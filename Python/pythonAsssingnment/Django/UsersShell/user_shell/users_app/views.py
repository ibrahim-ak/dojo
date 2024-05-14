from django.shortcuts import render , redirect
from . models import Users


def index(request):

     context ={
          'Users' :  Users.objects.all()
     }
     return render (request,'index.html',context)

def DBprocess(request):
     # :  Users.objects.create(firstname = {'Firstname'} , lastname= 'Lastname', email_address = 'Email',age = 'Age')
     firsname = request.POST['Firstname']
     lastname = request.POST['Lastname']
     Email=request.POST['Email']
     Age=request.POST['Age']
     Users.objects.create(firstname = firsname,lastname =lastname , email_address = Email , age = Age )
     return redirect ('/')
# Create your views here.
