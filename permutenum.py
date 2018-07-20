import sys
from itertools import permutations
x=str(input("enter the number:"))
y=list(x)
l=[]
flag=0
perms = [''.join(p) for p in permutations(y)]
for i in range(len(perms)):
      l.append(int(perms[i]))
l.sort()
for i in range(len(l)):
    if((l[i]!=int(x) )& (l[i]>int(x))):
        flag=1
        print(l[i])
        sys.exit(0)
if(flag==0):
    print('impossible')
