from django.shortcuts import render , redirect

# Create your views here.
def index(request):
     if 'counter' not in request.session:
          request.session['counter'] = 0
     request.session['counter']+=1
     if 'counter1' not in request.session:
          request.session['counter1'] = 0
     
     return render(request,'index.html')
def refresh(request):
     if 'counter' not in request.session:
          request.session['counter'] = 0
     request.session['counter']+=1
     
def destroy_session(request):
     del request.session['counter']
     del request.session['counter1']
     return redirect ('/') 

def add2(request):
     request.session['counter1']+=2
     request.session['counter']-=1
     return redirect('/')

def userIncrement(request):
     if request.method == "POST":
          request.session['counter1']+=int(request.POST['userIncrement'])
          request.session['counter']-=1
     return redirect('/')