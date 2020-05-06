#include<iostream>
int main(){

  int a,b;
  std::cin>>a>>b;
  std::cout<<"Before swapping a= "<<a<<" and b="<<b;
  int temp;
  temp=a;
  a=b;
  b=temp;
  std::cout<<"\n";
  std::cout<<"After swapping a= "<<a<<" and b="<<b;
  
}