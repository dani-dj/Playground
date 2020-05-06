#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,s=0,j;
  std::cin>>n;
  for(i=0;s<n;i++)
  {
    std::cin>>j;
    s=s+j;
  }
  std::cout<<"The number of turns is "<<i;
}