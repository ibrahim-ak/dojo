
class BankAccount:

   def __init__(self, int_rate=0.00, balance=0):
          self.balance = balance
          self.int_rate=int_rate
          
   def deposit(self, amount):
          self.amount=amount
          self.balance+=amount
          return self
   def withdraw(self, amount):
          self.amount=amount
          if self.balance<0:
               print(f"you cant do this request your balance is {self.balance}")
               return
          else: self.balance -=amount 
          return self
          
          
   def display_account_info(self):
          print(self.balance)
          return
   def yield_interest(self):
          self.balance = (self.balance*self.int_rate)+ self.balance
          return self
firstUser=BankAccount(.05,1500).deposit(100).deposit(300).deposit(100).withdraw(1000).yield_interest().display_account_info()
secUser=BankAccount(.03,1000).deposit(300).deposit(1000).withdraw(100).withdraw(550).withdraw(250).withdraw(100).yield_interest().display_account_info()


