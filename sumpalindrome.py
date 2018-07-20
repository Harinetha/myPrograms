def reverse(string):
    string = string[::-1]
    return string
n=input()
num=n
l=[]
while n>0:
    l.append(n%10)
    n=n/10
s=str(sum(l))
s1=reverse(s)
if(s==s1):
    print('YES')
else
    print('NO')
    
