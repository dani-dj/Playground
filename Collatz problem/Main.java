#include<iostream>
using namespace std;
int main()
{
  int n,t=0;
  std::cin>>n;
  std::cout<<n<<endl;
  while(n!=1)
  {
    t++;
    if(n%2==0)
      n=n/2;
    else
      n=(3*n)+1;
    std::cout<<n<<endl;
  }
    std::cout<<t;
}

