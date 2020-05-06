#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[50][50],sum=0;
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
      sum=0;
      for(j=1;j<=c;j++)
      {
          sum+=a[i][j];
      }
     std::cout<<sum<<"\n"; 
    }
  }
