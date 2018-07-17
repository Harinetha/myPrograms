#include<stdio.h>
#include<string.h>
int main(){
    int l1,l2,c=0,i;
    char str1[10],str2[10];
    scanf("%s",str1);
    scanf("%s",str2);
    l1=strlen(str1);
    l2=strlen(str2);
    if(l1!=l2)
    printf("no");
    else{
        for(i=0;i<l1;i++){
            if(str1[i]==str2[i]){
                c++;
            }
        }
    }
    if(c==l1)
        printf("yes");
    else
        printf("no");
    return 0;
}
