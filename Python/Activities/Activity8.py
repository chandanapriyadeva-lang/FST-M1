numbers=input("Enter numbers with ,:").split(',')
print(numbers)

def  compareNum(l1): 
    if l1[0]==l1[-1]:
        return True
    else:
        return False
    

print(compareNum(numbers))


    