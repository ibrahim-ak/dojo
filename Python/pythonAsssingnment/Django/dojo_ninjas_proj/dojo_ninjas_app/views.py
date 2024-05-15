from django.shortcuts import render , redirect
from .models import Dojo ,Ninja
# Create your views here.
def index(request):

     dojodic={ 'dojo': Dojo.objects.all(),
     }

     return render(request,'index.html' ,dojodic)

def addDojo(request):
     # obj = Dojo.objects.all()
     
     name = request.POST['name']
     city = request.POST['city']
     state=request.POST['state']
     
     Dojo.objects.create(name = name,city =city , state = state)
     return redirect('/')

def addNinja(request):

     firstName = request.POST['firstName']
     lastName = request.POST['lastName']
     option = request.POST['dojooption']
     dojooption =Dojo.objects.get(id = option)
     Ninja.objects.create(first_name =firstName , last_name =lastName ,dojo = dojooption  )
     return redirect ('/')