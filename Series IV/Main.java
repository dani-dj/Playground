#include<iostream>
using namespace std;
int main()
{
  int n,i,j;
  std::cin>>n;
  for(i=1;i<=n;i++)
  {
    if(i%2==0)
      j=(i*i)-2;
    else
      j=(i*i)-1;
    std::cout<<j<<" ";
  }
}