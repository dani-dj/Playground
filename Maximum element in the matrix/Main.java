#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[50][50],lar=0;
  std::cin>>r>>c;
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  lar=0;
    for(i=1;i<=r;i++)
    {
      for(j=1;j<=c;j++)
      {
        if(lar<a[i][j])
          lar=a[i][j];
      }
    }
  std::cout<<"The maximum element is "<<lar;
  }
