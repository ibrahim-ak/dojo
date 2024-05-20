from django.shortcuts import render , redirect
from .models import *
# Create your views here.
def shows(request):
     context={ 
          'TVshow' :TVshow.objects.all() 
     }

     return render(request,'shows.html',context)


def addshow(request):
     
     return render( request,'addShow.html')

def procces(request):
     t = request.POST['title']
     net=request.POST['Network']
     release=request.POST['ReleaseDate']
     des=request.POST['Description'] 
     create = TVshow.objects.create(title = t ,network = net ,releaseDate = release , desc= des )
     
     return redirect (f'shows/{create.id}')

def showpreviwe(request,id):
     
     context={ 
          'id' :TVshow.objects.get (id=id),
          
     }
     return render(request,'showpreviwe.html',context)

def delete(request,id):
     dele = TVshow.objects.get(id=id)
     dele.delete()
     return redirect ('/shows/')

def showtoedit(request,id):
     context ={
          'showtoedit':TVshow.objects.get(id=id)
     }
     
     return render (request,'edit.html',context)

def edit(request,id):
     title =request.POST['title']
     Network = request.POST['Network']
     ReleaseDate = request.POST['ReleaseDate']
     Description = request.POST['Description']
     show = TVshow.objects.get(id=id)
     show.title = title
     show.network=Network
     show.releaseDate = ReleaseDate
     show.desc =Description
     show.save()
     return redirect('/shows/')