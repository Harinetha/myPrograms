n=int(input())
k=int(input())
b=[]
flag=0
for i in range (n):
    b.append(int(input()))
for i in range (0,n,1):
    for j in range (i+1,n,1):
        if((b[i]+b[j])==k):
            flag=1
            print("yes")
if (flag==0):
    print("no")
