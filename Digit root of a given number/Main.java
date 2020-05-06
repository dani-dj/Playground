#include<iostream>
int root(int n)
{
  int rem,sum=0;
    while(n>0 || sum>9)
    {
      if(n==0)
      {
        n=sum;
        sum=0;
      }
      rem=n%10;
      sum=sum+rem;
      n=n/10;
    }
    return (sum);
}
int main()
{
  int r,n;
  std::cin>>n;
  r=root(n);
  std::cout<<r;
}