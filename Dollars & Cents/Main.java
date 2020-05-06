#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int x1,y1,x2,y2,t,s,r1=0,r2;
  std::cin>>x1>>y1>>x2>>y2;
  s=y1+y2;
  r2=s;
  if(s>=100)
  {
    r2=s-100;
    r1=1;
  }
  r1=r1+x1+x2;
  std::cout<<r1<<"\n"<<r2;
}
  