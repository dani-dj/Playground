#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  if(n==1)
  	std::cout<<n-1;
  if(n==2)
    std::cout<<n-1;
  if(n>2)
  {
    int s=0;
    for(int i=1;i<n;i++)
     s=s+i;
    std::cout<<s;
  } 
}