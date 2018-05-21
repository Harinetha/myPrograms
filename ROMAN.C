#include<stdio.h>
#include<string.h>
int digit(char);
int main(){
    char r[1000];
    int i=0;
    long int sum =0;
    scanf("%s",r);
    while(r[i]){
        if(digit(r[i]) >= digit(r[i+1]))
        {
             sum = sum + digit(r[i]);
        }
         else{
           // printf("%d %d\n",digit(r[i]),digit(r[i+1]));
            sum = sum + (digit(r[i+1]) - digit(r[i]));
                        // printf("%d\n",sum);

             i++;
         }
         i++;
    }
    printf("INTEGER VALUE is : %ld",sum);
    return 0;
}
 int digit(char c){
    int value=0;
    switch(c){
         case 'I': value = 1;break;
         case 'V': value = 5;break;
         case 'X': value = 10;break;
        
         default: value    = -1; 
    }
    return value;
}
