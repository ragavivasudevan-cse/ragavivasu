#include<stdio.h>
#include<conio.h>
void main(){
int a;
printf("enter the year");
scanf("%d",&a);
if((a%4==0)&&(a%100!=0||a%400==0))
printf("%d is leap year",a);
}
