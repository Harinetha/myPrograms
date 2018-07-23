n=int(input())
l=[]
ul=[]
for i in range(0,n):
    l.append(int(input()))
for x in l:
	if x not in ul:
		ul.append(x)
for x in ul:
	print x
