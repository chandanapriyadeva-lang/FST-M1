fruits={"apple":200,"orange":100,"Banana":50}

choice=input("Enter your choices of fruit:")
for fruit in fruits:
    if fruit==choice:
        print(f"{fruit} is available")
        break
else: 
    print(f"{fruit} is not available")   
