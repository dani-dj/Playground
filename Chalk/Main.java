#include<iostream>
#include<math.h>
using namespace std;
int main()
{
  //Type your code here.
  int n;
  std::cin>>n;
  int x=floor(sqrt(n));
  std::cout<<n+x+1;
}