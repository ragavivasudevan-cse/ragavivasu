#include<stdio.h>
#include<conio.h>
void main(){
int a,r;
printf("enter the integer value:");
scanf("%d",&a);
printf("reverse of the integer value is:");
while(a!=0){
        r=a%10;
        a=a/10;
printf("%d",r);
}
}
