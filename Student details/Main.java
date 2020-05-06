#include<iostream>
#include<cstring>
struct stu
{
  int id;
  char name[30];
  char dept[20];
  int year;
  float cgpa;
};
int main()
{
  int n;
  std::cout<<"Enter the number of students\n";
  std::cin>>n;
  struct stu s[100];
  struct stu t;
  for(int i=0;i<n;i++)
  {
    std::cout<<"Enter the details of student "<<i+1;
    std::cout<<"\nEnter name\nEnter department\nEnter year of study\nEnter cgpa\n";
    s[i].id=i+1;
    std::cin>>s[i].name>>s[i].dept>>s[i].year>>s[i].cgpa;
  }
  for(int i=1;i<n;i++)
  {
    for(int j=0;j<n;j++)
    {
      if(strcmp(s[i].name,s[j].name)<0)
      {
        t=s[i];
        s[i]=s[j];
        s[j]=t;
      }
    }
  }
  std::cout<<"Details of students\n";
  for(int i=0;i<n;i++)
  {
    std::cout<<"Student "<<i+1;
    std::cout<<"\nName:"<<s[i].name;
    std::cout<<"\nDepartment:"<<s[i].dept;
    std::cout<<"\nYear of study:"<<s[i].year;
    std::cout<<"\nCGPA:"<<s[i].cgpa<<"\n";
  }
}