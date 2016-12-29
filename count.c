#include<stdio.h>
#include<conio.h>
void main(){
int a,count=0,temp,i;
printf("enter the element");
scanf("%d",&a);
while(a!=0){

        temp=a%10;
        a=a/10;
        count++;
}
printf("count is %d",count);

}
