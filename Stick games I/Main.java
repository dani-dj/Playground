#include<iostream>
using namespace std;
int main()
{
  int m,n,add,mul;
  std::cin>>m>>n;
  add=m+n;
  mul=m*n;
  if((mul-add)%2==0)
    std::cout<<"Mani Iyer";
  else
    std::cout<<"Arun Gupta";
}