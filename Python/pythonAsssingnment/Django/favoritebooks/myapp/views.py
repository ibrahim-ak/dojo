from django.shortcuts import render , redirect
from .models import *
import bcrypt
from django.contrib import messages 
# Create your views here.
def index (request):

     return render(request,'loginRigestration.html')


def registration(request):

     errors = User.objects.basic_validator(request.POST)
     if len(errors) > 0:
          for key, value in errors.items():
               messages.error(request, value)
          return redirect('/')
     

     first_name= request.POST['first_name'] 
     last_name= request.POST['last_name']
     email=request.POST['email']
     password = request.POST['password']
     pw_hash = bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()

     creat_user= User.objects.create(first_name = first_name ,last_name = last_name , email = email ,password = pw_hash )

     return redirect('/')

def success(request):
     if 'username' not in request.session:
          return redirect('/')
     context = {
          'books': Book.objects.all(),
          "user" : request.session['userid']
     }
     return render(request,'bookpage.html',context)

def login(request):

     user = User.objects.filter(email=request.POST['login_email']) 
     if user: 
          logged_user = user[0]
          
          if bcrypt.checkpw(request.POST['login_password'].encode(), logged_user.password.encode()):
               request.session['userid'] = logged_user.id
               request.session['username'] = logged_user.first_name
               
               return redirect('/success')
     messages.error(request,"login failed")
     
     return redirect("/")

def logout(request):
     del request.session['username']
     return redirect('/')

def addbook(request):
     errors = Book.objects.basic_validator_book(request.POST)
     if len(errors) > 0:
          for key, value in errors.items():
               messages.error(request, value)
          return redirect('/success')
     title= request.POST['title'] 
     descrption= request.POST['descrption']
     user = User.objects.get(id = request.session['userid'] )
     book= Book.objects.create(title = title ,description = descrption , uplodaed_book=user)
     book.users_like.add(user)
     return redirect('/success')

def showbook (request,id):
     context = {
          'books': Book.objects.get(id = id),
          'all_users':User.objects.all(),
          'logged_user' : User.objects.get(id=request.session['userid'])
     }
     return render(request,'bookinfo.html',context)

def addtofavorite(request,id):
     thisbook = Book.objects.get(id=id)
     user =  User.objects.get(id= request.session['userid'])
     user.like_book.add(thisbook)
     return redirect(f'/success/{id}')
def removeFromFavorite(request,id):
     thisbook = Book.objects.get(id=id)
     user =  User.objects.get(id= request.session['userid'])
     user.like_book.remove(thisbook)
     return redirect(f'/success/{id}')

def booktoedit(request ,id):
     context={
     'thisbook' : Book.objects.get(id=id)}
     return render (request,'editbook.html',context)

def editbook(request,id):
     errors = Book.objects.basic_validator_book(request.POST)
     if len(errors) > 0:
          for key, value in errors.items():
               messages.error(request, value)
          return redirect(f'/booktoedit/{id}')
     thisbook = Book.objects.get(id=id)
     thisbook.title = request.POST['title']
     thisbook.description = request.POST['descrption']
     thisbook.save()
     return redirect(f'/success/{id}')

def deletebook(request,id):
     thisbook = Book.objects.get(id=id)
     thisbook.delete()
     return redirect('/success')
