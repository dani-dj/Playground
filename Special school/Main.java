#include<iostream>
#include<cstring>
int main()
{
  char s[100],str[100],t[100];
  int i,j,n,cmp;
  std::cin>>s>>t;
  n=strlen(s);
  for(i=0,j=n-1;i<n;i++,j--)
  {
    str[i]=s[j];
  }
  cmp=strcmp(t,str);
  if(cmp==0) 
    std::cout<<"It is correct";
  else
    std::cout<<"It is wrong";
}