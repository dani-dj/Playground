#include<iostream>
#include<string>
using namespace std;
int main()
{
  std::string s;
  std::getline(std::cin,s);
  int x=s.find("the");
  while(x<s.length())
  {
    s.replace(x,4,"");
    x=s.find("the",x+1);
  }
  std::cout<<s;
}