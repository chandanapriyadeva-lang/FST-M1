
def addition (n):
    if n:
        return  n + addition(n-1)
    else:
        return 0
      

print(addition(10))