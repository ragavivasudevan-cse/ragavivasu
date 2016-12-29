#include<stdio.h>
#include<conio.h>
void main(){
char ch;
int i;
printf("enter the character:");
scanf("%c",&ch);
if(ch=='I')
    printf("%c is 1",ch);
    else if(ch=='V')
        printf("%c is 5",ch);
    else if(ch=='X')
        printf("%c is 10",ch);
    else if(ch=='L')
        printf("%c is 50",ch);
    else if(ch=='C')
        printf("%c is 100",ch);
    else if(ch=='D')
        printf("%c is 500",ch);
    else if(ch=='M')
        printf("%c is 1000",ch);

}
