#include<iostream>
using namespace std;
int main()
{
  int n;
  std::cin>>n;
  int c;
  for(int i=1;i<=n;i++)
  {
    c=i+1;
    if(i%2==0)
      std::cout<<c++;
    for(int j=1;j<n;j++)
     {
    	std::cout<<i;
    }
    if(i%2!=0)
      std::cout<<c++;
   
    std::cout<<"\n";
  }
    return 0;
}
