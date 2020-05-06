#include<iostream>
int main()
{
   int s,a[100];
  std::cin>>s;
  for(int i=1;i<=s;i++)
    std::cin>>a[i];
  int lar=a[0];
  for(int i=1;i<=s;i++)
  {
    if(a[i]>lar)
      lar=a[i];
  }
  std::cout<<lar;
}
    