#include<iostream>
struct complex
{
  int r,i;
  void print()
  {
    if(i>=0)
       std::cout<<r<<"+"<<i<<"i";
    else
      std::cout<<r<<i<<"i";
  } 
};
int main()
{
  complex a,b,c;
  int ch;
  std::cin>>ch;
  std::cin>>a.r>>a.i;
  std::cin>>b.r>>b.i;
  switch(ch)
  {
    case 1:
      c.r=a.r+b.r;
      c.i=a.i+b.i;
      c.print();
      break;
    case 2:
      c.r=a.r-b.r;
      c.i=a.i-b.i;
      c.print();
      break;
    case 3:
      c.r=(a.r*b.r)-(a.i*b.i);
      c.i=(a.r*b.i)+(a.i*b.r);
      c.print();
      break;
    default:
      std::cout<<"Invalid choice";
  }
} 
      
      
      
      
      
      
  