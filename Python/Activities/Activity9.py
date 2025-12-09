lst1=[1,2,56,34,22]
lst2=[32,24,5,7,8,9]
lst3=[]
for i in lst1:
    if i%2>0:
        lst3.append(i)
for j in lst2:
    if j%2==0:
        lst3.append(j)

print(lst3)