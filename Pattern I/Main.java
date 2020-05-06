#include<iostream>
using namespace std;
int main()
{
  int n,i;
  std::cin>>n;
  int x=n;
  for(i=1;i<=4;i++)
  {
    for(int j=1;j<=i;j++)
    	std::cout<<x;
    x++;
    	std::cout<<"\n";
  }
    x=n+3;
  for(i=4;i>=1;i--)
  {
    for(int j=1;j<=i;j++)
      	std::cout<<x;
    x--;
    std::cout<<"\n";
    
  }
}
