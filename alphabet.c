#include<stdio.h>
#include<conio.h>
void main(){
char ch;
printf("enter the element:");
scanf("%c",&ch);
if((ch>=65&&ch<=91)||(ch>=97&&ch<=123))
printf("%c is alphabet",ch);
else
printf("not a alphabet");


}
