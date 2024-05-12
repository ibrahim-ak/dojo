# Update Values in Dictionaries and Lists

x = [ [5,2,3], [10,8,9] ] 
students = [
     {'first_name':  'Michael', 'last_name' : 'Jordan'},
     {'first_name' : 'John', 'last_name' : 'Rosales'}
]
sports_directory = {
     'basketball' : ['Kobe', 'Jordan', 'James', 'Curry'],
     'soccer' : ['Messi', 'Ronaldo', 'Rooney']
}
z = [ {'x': 10, 'y': 20} ]


#1
x[1][0]=15
print(x)

#2
students[0]['last_name'] = 'Bryant'
print(students)

#3
sports_directory['soccer'][0] = 'Andres'
print(sports_directory)
#4
z[0]['y'] = 30
print(z)

#Iterate Through a List of Dictionaries

def iterateDictionary(some_list):
     for students in some_list:
          output = "-->"
          for key, value in students.items():
               output += f"{key} - {value}, "
          print(output) 


students = [
     {'first_name': 'Michael', 'last_name': 'Jordan'},
     {'first_name': 'John', 'last_name': 'Rosales'},
     {'first_name': 'Mark', 'last_name': 'Guillen'},
     {'first_name': 'KB', 'last_name': 'Tonel'}
]

iterateDictionary(students)



#Get Values From a List of Dictionaries

def iterateDictionary2(key_name, some_list):
     for person in some_list:
          print(person.get(key_name))

students = [
     {'first_name': 'Michael', 'last_name': 'Jordan'},
     {'first_name': 'John', 'last_name': 'Rosales'},
     {'first_name': 'Mark', 'last_name': 'Guillen'},
     {'first_name': 'KB', 'last_name': 'Tonel'}
]

iterateDictionary2('first_name', students)
iterateDictionary2('last_name', students)



# Iterate Through a Dictionary with List Values

def printInfo(some_dict):
     for key, values in some_dict.items():
          print(len(values), key)
          for value in values:
               print(value)

dojo = {
     'locations': ['San Jose', 'Seattle', 'Dallas', 'Chicago', 'Tulsa', 'DC', 'Burbank'],
     'instructors': ['Michael', 'Amy', 'Eduardo', 'Josh', 'Graham', 'Patrick', 'Minh', 'Devon']
}

printInfo(dojo)