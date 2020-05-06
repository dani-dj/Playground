#include<iostream>
int main()
{
   int s,a[10],i;
  std::cin>>s;
  for(i=1;i<=s;i++)
    std::cin>>a[i];
  int x;
  std::cin>>x;
  for( i=1;i<=s;i++)
  {
    if(x==a[i])
    {
      std::cout<<"She passed her exam";
      break;
    } 
  } 
  if(i==s+1)
      std::cout<<"She failed" ;
}
    