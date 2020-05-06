#include<iostream>
using namespace std;
int main()
{
  int n,m,a[100];
  std::cin>>n>>m;
  int i,js=0,ans=0;
  for(i=0;i<n;i++)
  {
    std::cin>>a[i];
    if((js+a[i])>m)
    {
      ans++;
      js=a[i];
    }
    else
      js+=a[i];
  }
  if(js)
    ans++;
  if(n==m)
    std::cout<<n;
  else
  std::cout<<ans; 
}