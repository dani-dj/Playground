#include<iostream>
using namespace std;
int main()
{
  int n,i,j,a[100],x,ind;
  std::cout<<"Enter the number of elements in the array";
  std::cin>>n;
  std::cout<<"\nEnter the elements in the array";
  for(i=1;i<=n;i++)
    std::cin>>a[i];
  std::cout<<"\nEnter the location where you wish to insert an element";
  std::cin>>ind;
  if(ind>0 && ind<=n)
  {
  std::cout<<"\nEnter the value to insert";
  std::cin>>x;
  {
  for(i=n;i>=ind;i--)
  {
    a[i+1]=a[i];
  }
  a[ind]=x;
  std::cout<<"\nArray after insertion is\n";
  for(i=1;i<=n+1;i++)
    std::cout<<a[i]<<"\n";
  }
  }
  else
    std::cout<<"\nInvalid Input";
}