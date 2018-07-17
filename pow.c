#include <stdio.h>

int main() {
	int n,k;
	scanf("%d %d",&n,&k);
	int i,flag=0,ans=1;
	for(i=0;i<n;i++){
		ans=ans*k;
		if(ans==n){
			flag=1;
			printf("yes");
			break;
		}
	}
	if(flag==0)
	printf("no");
	return 0;
}
