#include<iostream>
int main()
{
  int n,i;
  std::cin>>n;
  int x=11*11;
  int t=4;
  std::cout<<x<<" ";
  for(i=1;i<n;i++)
  {
    x=(11+(i*t))*(11+(i*t));
    std::cout<<x<<" ";
  }
}
     