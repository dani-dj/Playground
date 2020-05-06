#include<iostream>
using namespace std;
int main()
{
  int n,i,s,j,l,r;
  l=1;
  std::cin>>n;
  r=n*n+1;
  int sp=0;
  for(i=n;i>0;i--)
  {
    for(s=1;s<=sp;s++)
    	std::cout<<"-";
    for(j=1;j<=i;j++)
    {
      std::cout<<l;
      std::cout<<"*";
      l++;
     }
    for(j=1;j<=i;j++)
    {
      std::cout<<r;
      if(j<i)
        std::cout<<"*";
      r++;
    }
    r=r-(i-1)*2-1;
    std::cout<<"\n";
    sp+=2;
  }
}