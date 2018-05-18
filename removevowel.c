#include <stdio.h>
#include<stdlib.h>
#include<string.h>
int main()
{
    char str[10000],str1[10000];
    int i,k=0,l,j;
    scanf("%s",str);
    l=strlen(str);
    for(i=0;i<l;i++){
        if(str[i]=='a'||str[i]=='e'||str[i]=='i'||str[i]=='o'||str[i]=='u'
        ||str[i]=='A'||str[i]=='E'||str[i]=='I'||str[i]=='O'||str[i]=='U'){
            str[i]='@';
        }
    }
    for(i=0;i<l;i++){
        if(str[i]!='@'){
            str1[k++]=str[i];
        }
    }
    printf("%s\n",str1);
    for(j=k-1;j>=0;j--)
    {
        printf("%c",str1[j]);
    }
    return 0;
}
