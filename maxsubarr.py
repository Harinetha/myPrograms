n=int(input())
li=[]
an=[]
for x in range(0,n):
    num=int(input())
    li.append(num)
l=len(li)
for i in range(0,l):
    ans=1*li[i]
    print('ans1',ans)
    for j in range(i+1,l):
        ans=li[j]*ans
        print('ans2',ans)
    an.append(ans)
    print('push',ans)
print("The ans is:",max(an))
