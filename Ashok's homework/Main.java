#include<iostream>
int main()
{
  int m,n,a[50][50],b[50][50],c[50][50];
  std::cin>>m>>n;
  for(int i=1;i<=m;i++)
  {
    for(int j=1;j<=n;j++)
    {
      std::cin>>a[i][j];
    }
  }
  for(int i=1;i<=m;i++)
  {
    for(int j=1;j<=n;j++)
    {
      std::cin>>b[i][j];
    }
  }
  for(int i=1;i<=m;i++)
  {
    for(int j=1;j<=n;j++)
    {
      c[i][j]=a[i][j]+b[i][j];
      std::cout<<c[i][j]<<" ";
    }
    std::cout<<"\n";
  }
}