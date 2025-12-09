numbers=tuple(input("Enter sequence of numbers seperated with comma ,").split(","))

print(numbers)

for i in numbers:
    if int(i)%5==0:
        print(i)