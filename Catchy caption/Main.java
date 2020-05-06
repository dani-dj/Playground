#include <cstring>
#include <iostream>
int main()
{
  std::string s;
  std::getline(std::cin,s);
  int c=1;
  for(int i=0;i<s.length();i++)
  {
   if(s[i]==' ')
     c++;
  }
  if(c<=10)
    std::cout<<"Caption eligible for the contest" ;
  else
    std::cout<<"Caption not eligible for the contest" ;
}