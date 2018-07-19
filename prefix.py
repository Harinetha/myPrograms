import sys
n=int(input())
l=[]
m=[]
t=[]
flag=0
c=0
for i in range(n):
    b=str(input())
    l.append(b)
    k=len(l[i])
    t.append(k)
length=min(t)
for i in range(length):
    for j in range(n):
        temp=l[0][i]
        if(l[j][i]==temp):
            c=c+1
        else:
            sys.exit()
    if(c==n):
        c=0
        print(l[0][i],end='')
        m.append(l[0][i])

