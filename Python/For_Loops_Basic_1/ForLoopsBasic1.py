#Basic 
for x in range(151):
          
     print(x)


#Multiples of Five
for y in range(5,1001,5):
     print(y)


#Counting, the Dojo Way
for w in range (1,101,1):
     if w%10==0:
          print("Coding Dojo")
     elif w%5 ==0:
          print("Coding")
     else:
          print(w)



#Whoa. That Sucker's Huge
sum =0
for a in range(0,500000,1):
     if a%2==1:
          sum=sum+a
print(sum)

# Countdown by Fours 
for b in range (2018,0,-4):
     print(b)
     
# Flexible Counter

lowNum=2 
highNum=9
mult=3

for a in range (lowNum,highNum+1):
     if a%mult==0:
          
          print(a)