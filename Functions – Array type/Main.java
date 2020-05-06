#include<iostream>
using namespace std;
int func(int a[],int n)
{
  int i,j,even,odd;
  for(i=1;i<=n;i++)
  {
    if(a[i]%2==0)
      even++;
    else
      odd++;
  }
  if(even==n)
    return 1;
  else if(odd==n)
    return 2;
  else
    return 3;
}
int main()
{
  int n,a[100],even=0,odd=0,i;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  std::cout<<"\nEnter the elements in the array";
  for(i=1;i<=n;i++)
  {
    std::cin>>a[i];
  }
  int x=func(a,n);
  if(x==1)
    std::cout<<"\nThe array is Even";
  else if(x==2)
    std::cout<<"\nThe array is Odd";
  else if(x==3)
    std::cout<<"\nThe array is Mixed";
}