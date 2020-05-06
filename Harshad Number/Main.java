#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,s=0,r,t;
  std::cin>>n;
  t=n;
  while(n>0)
  {
    r=n%10;
    s=s+r;
    n=n/10;
  }
  if(t%s==0)
    std::cout<<"Harshad Number";
  else
    std::cout<<"Not Harshad Number";
}
  
