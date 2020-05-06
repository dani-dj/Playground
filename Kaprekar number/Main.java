#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  int n,c,s,t;
  std::cin>>n;
  if(n==1)
  {
    std::cout<<"Kaprekar Number";
    goto l;
  }
  else
  {
    s=n*n;
    c=0;
    while(s)
    {
      c++;
      s/=10;
    }
    s=n*n;
    for(int i=1;i<=c;i++)
    {
      t=pow(10,i);
      if(n==t)
        continue;
      int sum=s/t+s%t;
      if(sum==n)
      {
        std::cout<<"Kaprekar Number";
        goto l;
      }
    }
    std::cout<<"Not a Kaprekar Number";
    l:
    return 0;
  }
  
}