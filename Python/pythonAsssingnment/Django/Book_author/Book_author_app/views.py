from django.shortcuts import render , redirect
from .models import Books ,Authors
# Create your views here.
def index(request):
    context = {
    "books": Books.objects.all()
    }
    return render(request,'index.html',context)


def indexAuthor(request):
    context = {
        "authors": Authors.objects.all()
    }
    return render( request,'authors.html',context)


def addbook(request):
    tit = request.POST['title']
    desce = request.POST['description']
    Books.objects.create(title = tit ,desc = desce )
    return redirect('/')

def addauthors(request):
    fname = request.POST['first_name']
    lname = request.POST['last_name']
    nts = request.POST['notes']
    Authors.objects.create(first_name = fname ,last_name = lname , notes =nts )
    return redirect('/authors')

def indexAuthorid(requset,id):
    
    context = {
        'id':  Authors.objects.get(id=id),
        'allauthors': Authors.objects.all(),
        "allbooks" : Books.objects.all(),
        "remaining": Books.objects.exclude(authors = id )


    }

    return render (requset,'viewauthor.html',context)

def indexbook(requset,id):
        
        context ={
            'id':Books.objects.get(id=id),
            'authors': Authors.objects.all(),
            'remaining': Authors.objects.exclude(book_authors = id )
        }

        return render (requset,'viewbook.html',context)


def addnewwbookafterviewing(requset,id):
    cd = Books.objects.get(id=id)
    newAddingaAuthorRequest = requset.POST['newbooktoadd']
    newauthor=Authors.objects.get(id = newAddingaAuthorRequest)
    newauthor.book_authors.add(id)
    return redirect(f'/authors/{cd}')
