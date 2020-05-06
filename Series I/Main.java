#include<iostream>
using namespace std;
int main()
{
 int n,i;
 std::cin>>n;
  float x=0.5f;
  std::cout<<x<<" ";
  for(i=2;i<=n;i++)
  {
    x=x*3;
    std::cout<<x<<" ";
  }
  
}