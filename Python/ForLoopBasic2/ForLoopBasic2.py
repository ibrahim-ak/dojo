#Biggie Size
def BigSize(list):
     for x in range(list):
          if list[x]<0:
               list[x] = "BigSize"
     print(list)

BigSize([1,4,-2,4,-4,8,534,-13,-515])

#Count Positives

def CountPositives(list):
     count=0
     for x in range (len(list)):
          if list[x] >-1:
               count=count+1
     list[len(list)-1]=count
     return list

print(CountPositives([1,6,-4,-2,-7,2]))

# Sum Total
def Sum_total(list):
     sum=0
     
     for x in range (len(list)):
          sum=sum+list[x]
     return sum     

Sum_total([1,2,3,4,5])

# Minimum
def Minimum (list):
     if (len(list)) == 0:
          print("false")
     else:
          for x in range(len(list)):
               if list[x]<list[len(list)-1]:
                    list[len(list)-1]= list[x]
          return(list[len(list)-1])

Minimum([-37,2,-123131,-9])

def Maximum(list):
     if (len(list)) == 0:
          print("false")
     else:
          for x in range(len(list)):
               if list[x]>list[len(list)-1]:
                    list[len(list)-1]= list[x]
          return(list[len(list)-1])

Maximum([-37,2,-123131,-9,5])

def average(list):
     sum=0
     for x in range (len(list)):
          sum=sum+list[x]
     avg = sum/len(list)
     return avg     


#Ultimate Analysis
Ultimate_Analysis= {'sumTotal': Sum_total( [37,2,1,-9]), 'average': average([37,2,1,-9]), 'minimum':Minimum([37,2,1,-9]), 'maximum': Maximum([37,2,1,-9]) , 'length':len([37,2,1,-9])}
print(Ultimate_Analysis)


# Reverse List
def Reverse_List(list):
     for x in range (len(list)-1,-1,-1):
          print(list[x])

Reverse_List([37,2,1,-9])