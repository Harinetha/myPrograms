#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
    int l,i,j;
    char str[100],temp;
    scanf("%[^\n]s",str);
    l=strlen(str);
    for(i=0;i<l;i++)
    {
        if(str[i]==' ')
        {
            for(j=i;j<l;j++)
            {
                str[j]=str[j+1];
            }l--;
        }
    }
    printf("%s",str);
    return 0;
}

