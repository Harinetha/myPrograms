#include<stdio.h>
#include<string.h>
#include<stdlib.h>
int main()
{
    int l,c=0,i;
    char str[100];
    scanf("%s",str);
    l=strlen(str);
    for(i=0;i<l;i++)
    {
        if((str[i]>=65 && str[i]<=90)||(str[i]>=97 && str[i]<=122))
        c++;
    }
    printf("%d%d",l,c);
    if(c==l)
    printf("Alphabet");
    else
    printf("NO");
    
    return 0;
}
