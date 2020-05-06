#include<iostream>
struct Emp
{
  char name[50],des[30];
  int id,age,sal;
};
int main()
{
  struct Emp e;
  std::cout<<"Enter name:\nEnter ID:\nEnter age:\nEnter designation:\nEnter Salary:\n";
  std::cin>>e.name>>e.id>>e.age>>e.des>>e.sal;
  std::cout<<"Employee Details";
  std::cout<<"\nName of the Employee : "<<e.name;
  std::cout<<"\nID of the Employee : "<<e.id;
  std::cout<<"\nAge of the Employee : "<<e.age;
  std::cout<<"\nDesignation of the Employee : "<<e.des;
  std::cout<<"\nSalary of the Employee : "<<e.sal;
}