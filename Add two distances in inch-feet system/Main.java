#include<iostream>
struct dist
{
  float i;
  float f;
};
int main()
{
  dist d1,d2,res;
  std::cin>>d1.i>>d1.f>>d2.i>>d2.f;
  res.f=d1.f+d2.f;
  if(res.f>12)
  {
    res.f-=12;
    res.i=1;
  }
  res.i=res.i+d1.i+d2.i;
  std::cout<<res.i<<"'-"<<res.f<<"\"";
}