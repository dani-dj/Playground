#include<iostream>
#include<string>
using namespace std;
int main()
{
  std::string s[10];
    int i=0,c=0;
  std::cin>>s[0];
  while(s[i]!="####")
  {
    i++;
    std::cin>>s[i];
    c++;
  } 
  for(i=0;i<=c-1;i++)
  {
    if(i==0)
      std::cout<<s[0]<<"\n" ;
    else
    {
      int l=s[i-1].length();
        if(s[i][0]==s[i-1][l-1])
          std::cout<<s[i]<<"\n" ;
        else
          break;
    }
  } 
  
}