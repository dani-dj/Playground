#include<iostream>
struct Time
{
  int h,m,s;
};
int main()
{
 struct Time t1;
 struct Time t2;
 struct Time diff;
  diff.h=0;
  diff.m=0;
  diff.s=0;
  std::cin>>t1.h>>t1.m>>t1.s;
  std::cin>>t2.h>>t2.m>>t2.s;
  if(t1.s<t2.s)
  {
    t1.s+=60;
    t1.m--;
  }
  diff.s=t1.s-t2.s;
  if(t1.m<t2.m)
  {
    t1.m+=60;
    t1.h--;
  }
  diff.m=t1.m-t2.m;
  diff.h=t1.h-t2.h;
  std::cout<<diff.h<<":"<<diff.m<<":"<<diff.s;
}