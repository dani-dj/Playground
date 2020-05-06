#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0,i,s1=0,s2=0;
  std::cin>>n;
  int t=n;
  while(n>0)
  {
    c++;
    n/=10;
  }
  n=t;
  int x;
  for(i=1;i<=c;i++)
  {
    x=n%10;
    n=n/10;
    if(i%2==0)
      s2=s2+x;
    else
      s1=s1+x;
  }
  if(s1==s2)
    std::cout<<"Yes";
  else
    std::cout<<"No";
}