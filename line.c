#include <stdio.h>

int main(void) {
	int x[3],y[3];
	int i,flag;
	for(i=0;i<3;i++)
	{
		scanf("%d %d",&x[i],&y[i]);
	}
	if((x[i]==x[i+1])&&(x[i+1]==x[i+2])||(y[i]==y[i+1])&&(y[i+1]==y[i+2]))
	{
		printf("yes");
	}
	else
	{
		printf("no");
	}
	return 0;
}
