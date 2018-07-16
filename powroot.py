import math
l,r =input().split()
l=int(l)
r=int(r)
c=0
for i in range(l,r):
  if int(math.sqrt(i))**2==i:
      c=c+1
print(c) 
