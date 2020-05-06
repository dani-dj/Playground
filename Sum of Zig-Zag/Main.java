#include<iostream>
using namespace std;
int main()
{
  int j,sum=0,i,r,c,a[100][100];
  std::cin>>r>>c;
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
      std::cin>>a[i][j];
  }
  for(i=1;i<c;i++)
    sum+=a[1][i];
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
      if(i+j==c+1)
        sum+=a[i][j];
    }
  }
  for(i=2;i<=c;i++)
    sum+=a[r][i];
  std::cout<<"Sum of Zig-Zag pattern is "<<sum;
}