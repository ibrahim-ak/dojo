from django.shortcuts import render , redirect
import random 
def index(request):
     if 'gold' not in request.session:
          request.session['gold']=0
     return render(request,'index.html')

def farming(request):
     request.session['farm'] = 'farm'
     request.session['farmr'] = int(random.randint(10,20))
     request.session['gold']+=request.session['farmr']
     if 'activities' not in request.session:
          request.session['activities'] = ''
     request.session['activities'] += f" you entered a farm and earned {request.session['farmr']}"
     return redirect('/')

def cave(request):
     request.session['cave'] = 'cave'
     request.session['caver'] = int(random.randint(10,20))
     request.session['gold']+=request.session['caver']
     if 'activities' not in request.session:
          request.session['activities'] = ''
     request.session['activities'] += f' you enterd a cave and earned {request.session['caver']}'

     return redirect('/')
def home(request):
     request.session['home'] = 'home'
     request.session['homer'] = int(random.randint(10,20))
     request.session['gold']+=request.session['homer']
     if 'activities' not in request.session:
          request.session['activities'] = ''
     request.session['activities'] += f' you enterd a home and earned {request.session['homer'] }'

     return redirect('/')

def quest(request):
     request.session['quest'] = 'quest'
     request.session['questr'] = int(random.randint(-50,50))
     request.session['gold']+=request.session['questr'] 
     if 'activities' not in request.session:
          request.session['activities'] = ''
     if request.session['questr'] <0:
          text = 'lose'
     else :
          text = 'win'
     request.session['activities'] += f' you enterd a quest and {text} {request.session['questr']}'

     return redirect('/')

def clear(request):
     request.session.clear()
     
     return redirect('/')