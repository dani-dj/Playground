#include<iostream>
using namespace std;
int main()
{
   int i,j,r,c,a[50][50],b[50][50];
  std::cin>>r>>c;
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
    	std::cin>>a[i][j];
    }
  }
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
    	std::cin>>b[i][j];
    }
  }
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
    	std::cout<<a[i][j]+b[i][j]<<" ";
    }
     std::cout<<"\n";
  }
}