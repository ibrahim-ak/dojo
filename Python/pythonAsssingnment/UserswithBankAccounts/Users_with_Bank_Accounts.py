class user:
     
     def  __init__(self,username):
          self.username = username
          self.account = BankAccount() 
          
          
     def withdrwal(self,amount):
          
          if amount > self.account.balance:
                    print(f"your balance is lees than the needed withdrawl , your main account balance is {self.account.balance}")
                    return
          else:
               self.account.balance -= amount     
               return self
     def displayUserBalance(self):
          print(f"mrs/mrs {self.username}")
          print(f"your main account balance is {self.account.balance} $" )
          return self.account.balance,self

     def deposit(self,depositamount):
               self.account.balance+=depositamount
               return self

     
     def withdrwalfromSubAcoount(self,amount):
          
          if amount > self.subAccount.balance:
                    print(f"your balance is lees than the needed withdrawl , your SubAccount balance is {self.subAccount.balance}")
                    return
          else:
               self.subAccount.balance -= amount     
               return self
     def displayUserSubAccountBalance(self):
          print(f"mrs/mrs {self.username}")
          print(f"your subAcoount balance is {self.subAccount.balance} $" )
          return self.subAccount.balance,self

     def depositInSub(self,subdepositamount):
               self.subAccount.balance+=subdepositamount
               return self
     def displaytotal(self):
          self.total = self.subAccount.balance + self.account.balance
          print(f"your account balance {self.total} $")
     def opensubAccount(self):
          self.subAccount = subAccount()
          
class BankAccount:

     def __init__(self, balance=0):
          self.balance = balance

class subAccount:
     def __init__(self, balance=0):
          self.balance = balance


# user1=user("mohammad").deposit(200).deposit(1000).withdrwal(420).displayUserBalance()
user1=user("ibrahim")
user1.opensubAccount()
user1.depositInSub(550)
user1.displayUserSubAccountBalance()
user1.deposit(400)
user1.displayUserBalance()
user1.displaytotal()