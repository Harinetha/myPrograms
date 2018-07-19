n=int(input())
b=[]
for i in range (n):
    b.append(int(input()))
b.reverse()
for i in range (0,n,1):
    if(i==n-1):
        print(b[i])
    else:
        print(b[i],'->',end='')
