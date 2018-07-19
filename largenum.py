n=int(input())
b=[]
for i in range(1,n+1):
    a=input()
    b.append(a)
for i in range(1,n+1):
    print(max(b),end='')
    b.remove(max(b))
