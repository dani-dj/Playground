#include<iostream>
#include<iomanip>
using namespace std;
int main()
{
  //Type your code here.
  int n,c=0;
  float s=0;
  do{
    std::cin>>n;
    if(n>0)
    {
      if(n%2==1)
      {
        c++;
        s=s+1;
      }
      else
        s=s-0.5;
    }
    else
    {
      s=s-1;
      break;
    }
  }while(n>0 && c!=3);
  std::cout<<std::setprecision(2)<<s;
    
}