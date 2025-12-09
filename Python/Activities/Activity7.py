numbers=input("Enter sequence of comma seperated values: ").split(",")
sum=0

for num in numbers:
    sum+=int(num)
print(sum)