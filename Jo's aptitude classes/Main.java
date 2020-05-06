#include<iostream>
int main()
{
  int n1,n2,n3,r,x,i,s,j;
  std::cin>>n1>>n2>>n3>>x;
  if(n1<n2 && n1<n3)
    s=n1;
  else if(n2<n3)
    s=n2;
  else
    s=n3;
  for(;s>=1;s--)
  {
    if(n1%s==0 && n2%s==0 && n3%s==0)
    {
      r=s;
      break;
    }
  }
  if(r==x)
    std::cout<<"Answer is correct.";
  else
    std::cout<<"Answer is wrong.";
}