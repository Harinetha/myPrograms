n=int(input())
li=[]
an=[]
for x in range(0,n):
    num=int(input())
    li.append(num)
l=len(li)
ans=0
for i in range(0,l):
    ans=0
    for j in range(0,i+1):
        ans=li[j]+ans
    an.append(ans)
print(max(an))
