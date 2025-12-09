nums=int(input("how many Fibonnaci seuence you want :"))
first=1
second=1
fiboSeries=[first,second]
for i in range(nums-2):
    third=first+second
    first=second
    second=third
    fiboSeries.append(third)
print(fiboSeries)

 
 