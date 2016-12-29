#include<stdio.h>
#include<conio.h>
void main(){
char a[10];
int temp,n,i;
printf("enter the character");
gets(a);
n=strlen(a);
for(i=0;i<n;i+=2){
    temp=a[i];
    a[i]=a[i+1];
    a[i+1]=temp;
}
printf("\n%s",a);

}


