#include<iostream>
int main(){
  // Type your code here
  int a,fact=1;
  std::cin>>a;
  for(int i=1;i<=a;i++)
  {
    fact=fact*i;
  }
  std::cout<<fact;
}