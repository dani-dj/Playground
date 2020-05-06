#include<iostream>
using namespace std;
int main()
{
  int n,mug,c[100],sum=0;
  std::cin>>n>>mug;
  for(int i=1;i<=n;i++)
  {
    std::cin>>c[i];
    sum+=c[i];
  }
  if(mug>=sum)
    std::cout<<"YES";
  else
    std::cout<<"NO";
}
  