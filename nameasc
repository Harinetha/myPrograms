#include<stdio.h>
#include<string.h>
int main(){
   int i,j,k,count,flag=0,l1,l2,max;
   char str[5][25],temp[25],t1[20],t2[10];
   scanf("%d",&count);
   for(i=0;i<count;i++)
       scanf("%s",str[i]);
   for(i=0;i<count;i++)
   {
      for(j=i+1;j<count;j++){
             // printf("\n%s %s\n",str[i],str[j]);
             flag=0;
             l1=strlen(str[i]);
             l2=strlen(str[j]);
             max=l1>l2?l1:l2;
             if(l1==l2)
             max=l1;
             strcpy(t1,str[i]);
             strcpy(t2,str[j]);
             if(t1[0]!=t2[0])
             {
                if(t1[0]>t2[0])
                {
                    flag=1;
                    goto h;
                }
            }
            else
            {
            for(k=0;k<max;k++)
             {
                if(t1[k]>t2[k])
               {
               flag=1;
               goto g;
               }
             }
            }
        h:
         g:
         if(flag==1){
            strcpy(temp,str[i]);
            strcpy(str[i],str[j]);
            strcpy(str[j],temp);
         }
      }
   }
      printf("\nSorted Strings:");
   for(i=0;i<=count;i++)
   puts(str[i]);
   return 0;
}
