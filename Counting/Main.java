#include<iostream>
#include<string>
using namespace std;
int main()
{
  std::string  s;
  std::getline(std::cin,s);
  int v=0,c=0,d=0,sp=0,o=0;
  for(int i=0;i<s.length();i++)
  {
    if((s[i]>='a' && s[i]<='z') || (s[i] >='A' && s[i]<='Z'))
    {
      if((s[i]=='a' || s[i]=='e' ||s[i]=='i' || s[i]=='o' || s[i]=='u') || (s[i]=='A' || s[i]=='E' ||s[i]=='I' || s[i]=='O' || s[i]=='U'))
      {
        v++;
      }
      else
      {
        c++;
      }
    }
    else if(s[i]>='0' && s[i]<='9')
    {
      d++;
    }
    else if(s[i]==' ')
      sp++;
    else
      o++;
  }
  std::cout<<"Vowels:"<<v<<"\n"<<"Consonants:"<<c<<"\n"<<"White Spaces:"<<sp<<"\n"<<"Digits:"<<d<<"\n"<<"Symbols:"<<o;
}