#include <iostream>
int main() 
{
	int n,rem,reverse=0;
  	std::cin>>n;
  	while(n!=0)
    {
      rem=n%10;
      reverse=reverse*10+rem;
      n=n/10;
    }
	std::cout<<reverse;
      
      
	return 0;
}