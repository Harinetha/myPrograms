n=int(input())
b=[]
prod=1
for i in range (0,n):
    k=int(input())
    b.append(k)
for i in range (0,n):
    for j in range (0,n):
        if(j!=i):
            prod=prod*b[j]
    print(prod)
    prod=1
