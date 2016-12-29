#include<stdio.h>
#include<conio.h>
void main(){
char a[10];
int i,n,j,k,flag=0;
printf("enter the string:");
gets(a);
n=strlen(a);
for(i=0;i<n;i++){
for(j=0;j<n;j++){
for(k=0;k<n;k++){
    if(a[j]==a[k]){
        flag=1;
    }
}
   } }

if(flag==1){
    printf("true");

}else
printf("false");


}

