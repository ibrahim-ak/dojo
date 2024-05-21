from django.shortcuts import render ,redirect
import random

def index(request):
     
     if 'rand' not in request.session:
          request.session['rand'] = random.randint(1,100)
     return render (request, 'index.html')
# Create your views here.
def gussed(request):
     gussednum=int(request.POST['num'])
     print(request.session['rand'])
     if gussednum > request.session['rand']:
          request.session['message'] = 'Too high!'
          print(request.session['rand'])
     if gussednum < request.session['rand']:
          request.session['message'] = 'Too low!'
     if gussednum == request.session['rand']:
          request.session['message'] = 'you win'
          clear(request)
     return redirect('/')
def clear(request):
     del  request.session['message']
     del  request.session['rand']
     return redirect ('/')