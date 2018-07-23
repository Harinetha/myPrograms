n=int(input())
k=int(input())
l=[]
k=k-1
for i in range(n):
    l.append(int(input()))
for j in range(k,n):
    print(l[j])  
for m in range(0,k):
    print(l[m])
