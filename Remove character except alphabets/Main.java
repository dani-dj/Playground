#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  char s1[100],t[200];
  int n;
  std::cin>>s1;
  n=strlen(s1);
  int i,j=0;
  for(i=0;i<n;i++)
  {
    if((s1[i]>=65 && s1[i]<=90) || (s1[i]>=97 && s1[i]<=122))
    {
      t[j]=s1[i];
      j++;
    }
  }
  std::cout<<t;
}