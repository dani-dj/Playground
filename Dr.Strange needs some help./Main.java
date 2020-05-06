#include<iostream>
#include<math.h>
int main()
{
  int n,x,r,m;
  std::cin>>n>>x>>m;
  r=pow(n,x);
  if(r>=m)
    std::cout<<"Doctor, you can proceed with your experiment.";
  else
    std::cout<<"Sorry Doctor! You need more bacteria.";
}