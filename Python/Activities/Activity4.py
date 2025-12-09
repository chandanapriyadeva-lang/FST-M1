user1=input("Enter 1st user name:")
user2=input("Enter 2nd user name:")

while True:
     user1_answer=input(user1 +", Do you want to chose Rock,Scissors or paper ?").lower()
     user2_answer=input(user2 +", Do you want to chose Rock,Scissors or paper ?").lower()

     if user1_answer==user2_answer:
      print("Game is tie")
     elif user1_answer=='scissors':
       if user2_answer=='paper':
          print('Scissors wins!')
       else:
          print('rock wins!')

     elif user1_answer=='rock':
       if user2_answer=='Scissors':
        print('Rock wins!')
       else:
        print('Paper wins!')

     elif user1_answer=='paper':
        if user2_answer=='rock':
         print('Paper wins!')
        else:
         print('Scissors wins!')

     else:
       print("Invalid input! You have not entered rock, paper or scissors, try again.")

     repeat=input("Do you want to Play Again ? Yes or No : ").lower()
     if repeat=='yes':
       pass
     elif repeat=='no':
       raise SystemExit
     else:
       print("You entered Invalid Input.exiting now..")
       raise SystemExit
       