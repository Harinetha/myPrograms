#include <stdio.h>
#include <string.h>
int main()
{
    int l,i,num,j;
    char str[75];
    scanf("%s",str);
    l=strlen(str);
    for(i=0;i<l;i=i+2)
    {
       if(((str[i+2]-48) >=0 )&&((str[i+2]-48)<=9))
       {
          num=(str[i+1]-48)*10+(str[i+2]-48);
         for(j=0;j<num;j++)
        printf("%c",str[i]);
        i++;
       }
       else
       {
        for(j=0;j<str[i+1]-48;j++)
        printf("%c",str[i]);
       }
    }
    return 0;
}
