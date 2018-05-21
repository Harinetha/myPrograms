#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
    int l,i;
    char str[100];
    scanf("%s",str);
    l=strlen(str);
    for(i=0;i<l;i++)
    {
        if(str[i]>=97 && str[i]<=122)
        {
            str[i]=str[i]-32;
        }
        else
        {
            str[i]=str[i]+32;
        }
    }
    printf("%s",str);
    return 0;
}

