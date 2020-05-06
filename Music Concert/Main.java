#include<iostream>
#include<cstdlib>
int main(){
  int *a,n,i,even=0,odd=0;
  std::cin>>n;
  a=(int*) malloc(n*sizeof(int));
  for(i=0;i<n;i++)
    std::cin>>*(a+i);
  for(i=0;i<n;i++)
  {
    if((*(a+i))%2==0)
      even++;
    else
      odd++;
  }
  std::cout<<odd<<"\n"<<even;
}