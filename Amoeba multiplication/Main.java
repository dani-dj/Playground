#include<iostream>
using namespace std;
int main()
{
  int n,a,b,c;
  std::cin>>n;
  if(n==1)
    std::cout<<n-1;
  else if(n==2)
    std::cout<<n-1;
  else if(n>2)
  {
    a=0;
    b=1;
    for(int i=3;i<=n;i++)
    {
      c=a+b;
      a=b;
      b=c;
    }
    std::cout<<c;
  }
}