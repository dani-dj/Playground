#include <iostream>
#include<string.h>
int main()
{
char str[100], rev[100];     
int count = 0, end, i=0;    
std::cin.getline(str,100);
while(str[i]!='\0')
{
  count++;
  i++;
}
end=count-1;
for(i=0;i<count;i++,end--)
  rev[i]=str[end];
std::cout<<rev;
}