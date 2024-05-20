from django.shortcuts import render, redirect
from .models import *
import bcrypt
from django.contrib import messages
     # Create your views here.
def index(request):

          context={ 'users': User.objects.all(),
                   'massages': Message.objects.all(),
          }

          return render(request,'login.html', context)

def success(request):
     if 'username' not in request.session:
          return redirect('/')

     context={
          'user' : User.objects.get(id =request.session['username']),
          'massages': Message.objects.all(),
          'comments': Comment.objects.all()

          }

     return render (request,"success.html",context)

def addUser(request):

          errors = User.objects.basic_validator(request.POST)
          if len(errors) > 0:
               for key, value in errors.items():
                    messages.error(request, value, extra_tags="registerFailed")
               return redirect('/')
          else:
               first_name = request.POST['first_name']
               last_name = request.POST['last_name']
               email = request.POST['email']
               password = request.POST['password']
               pw_hash = bcrypt.hashpw(password.encode(), bcrypt.gensalt()).decode()
               User.objects.create(first_name=first_name,last_name =last_name,Email=email,password = pw_hash )
          return redirect('/success')

def login(request):

          email = User.objects.filter(Email=request.POST['login_email'])
          if email: 
               logged_email = email[0] 
               if bcrypt.checkpw(request.POST['login_password'].encode(), logged_email.password.encode()):
                    request.session['username'] = logged_email.id
                    
                    return redirect('/success')
          else: 
               messages.error(request, 'the password or email you enterd is incorrect',extra_tags="loginFailed")
               return redirect("/")

def logout(request):
     request.session.clear()
     return redirect('/')

def post(requset,id):
     post = requset.POST['textarea']

     user1 =Message.objects.create (users = User.objects.get(id=id) ,message =post  )

     
     return redirect ('/success')

def addcomment(request,id,msgid):
     comment = request.POST['comment']

     comment1 = Comment.objects.create(Comment = comment , users = User.objects.get(id=id),messages =Message.objects.get(id=msgid) )
     return redirect('/success')

def deletecomment(request,id):
     comment_delete= Comment.objects.get(id=id)
     comment_delete.delete()
     return redirect('/success')
