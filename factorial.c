#include<stdio.h>
#include<conio.h>
int b,fact=1;
int main(){
int a;
printf("enter the number");
scanf("%d",&a);
factorial(a);
return 0;
}

int factorial(int a){
    b=a;
while(a!=0){
fact=fact*a;
a--;
}printf("factorial of %d:%d",b,fact);
}
