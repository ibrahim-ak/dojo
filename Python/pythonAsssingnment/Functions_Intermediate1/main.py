import random
def randInt(min=None , max = None):
     num = random.random()*max+min #this equation for the last print only
     return num

# should print a random integer between 0 to 100

# print(randInt()*100) 

# should print a random integer between 0 to 50

# print(randInt()*50) 

# should print a random integer between 50 to 100

# print(randInt()*50+50)

# should print a random integer between 50 and 500
print(randInt(min=50, max=500))

