#include<stdio.h>
int main(){
    int c=0,i;
    char str[20];
    scanf("%s",str);
    for(i=0;str[i]!='\0';i++){
        c++;
    }
    printf("%d",c);
}
