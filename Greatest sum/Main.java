#include<iostream>
using namespace std;
int main()
{
  int r,c,i,j,a[50][50],sum=0,s1[50],s2[50],ind1,ind2;
  std::cin>>r>>c;
  for(i=1;i<=r;i++)
  {
    for(j=1;j<=c;j++)
    {
      std::cin>>a[i][j];
    }
  }
  sum=0;
    for(i=1;i<=r;i++)
    {
      sum=0;
      for(j=1;j<=c;j++)
      {
         sum+=a[i][j];
      }
      s1[i]=sum;
    }
    for(j=1;j<=c;j++)
    {
      sum=0;
      for(i=1;i<=r;i++)
      {
         sum+=a[i][j];
      }
      s2[j]=sum;
    }
  int l1=0,l2=0;
  for(i=1;i<=r;i++)
   {
     if(l1<s1[i])
      {
       l1=s1[i];
       ind1=i;
      }
   }
   for(i=1;i<=c;i++)
    {
     if(l2<s2[i])
      {
       l2=s2[i];
       ind2=i;
      }
   }
   std::cout<<"Sum of rows is ";
   for(i=1;i<=r;i++)
      std::cout<<s1[i]<<" ";
   std::cout<<"\nRow "<<ind1<<" has maximum sum\n";
   std::cout<<"Sum of columns is ";
   for(i=1;i<=c;i++)
     std::cout<<s2[i]<<" ";
   std::cout<<"\nColumn "<<ind2<<" has maximum sum\n";
}