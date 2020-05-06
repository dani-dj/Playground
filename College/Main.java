#include<iostream>
#include<cstring>
struct clg
{
  char name[30];
  char city[20];
  int year;
  float perc;
};
int main()
{
  int n;
  std::cout<<"Enter the number of colleges\n";
  std::cin>>n;
  struct clg c[100];
  struct clg t;
  for(int i=0;i<n;i++)
  {
    std::cout<<"Enter the details of college "<<i+1;
    std::cout<<"\nEnter name\nEnter city\nEnter year of establishment\nEnter pass percentage\n";
    std::cin>>c[i].name>>c[i].city>>c[i].year>>c[i].perc;
  }
  for(int i=1;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(strcmp(c[i].name,c[j].name)<0)
      {
        t=c[i];
        c[i]=c[j];
        c[j]=t;
      }
    }
  }
  
  std::cout<<"Details of colleges\n";
  for(int i=0;i<n;i++)
  {
    std::cout<<"College:"<<i+1;
    std::cout<<"\nName:"<<c[i].name;
    std::cout<<"\nCity:"<<c[i].city;
    std::cout<<"\nYear of establishment:"<<c[i].year;
    std::cout<<"\nPass percentage:"<<c[i].perc<<"\n";
  }
}