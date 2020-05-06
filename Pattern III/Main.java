#include<iostream>
using namespace std;
int main()
{
  int n,i;
  std::cin>>n;
  int x=n;
  for(i=1;i<=n;i++)
  {
    for(int j=1;j<=i;j++)
     {
    	std::cout<<i;
    	if(j!=i)
    		std::cout<<"*";
     }
    std::cout<<"\n";
  }
   for(i=n;i>=1;i--)
   {
     for(int j=1;j<=i;j++)
     {
       std::cout<<i;
       if(j!=i)
         std::cout<<"*";
     }
     std::cout<<"\n";
    
  }
}
