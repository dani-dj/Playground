#include<iostream>
int main()
{
  int n,i;
  std::cin>>n;
  int x=6;
  std::cout<<x<<" ";
  for(i=1;i<n;i++)
  {
    x=x+(5*i);
    std::cout<<x<<" ";
  }
}