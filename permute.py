n=input()
temp=[]
from itertools import permutations
perms = [''.join(p) for p in permutations(n)]
for i in range(len(perms)):
    if perms[i] not in temp:
        temp.append(perms[i])
for i in range(len(temp)):
    print(temp[i])
