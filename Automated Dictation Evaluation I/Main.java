#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s1[100],s2[100];
  std::cin>>s1>>s2;
  if(strcmp(s1,s2)==0)
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}