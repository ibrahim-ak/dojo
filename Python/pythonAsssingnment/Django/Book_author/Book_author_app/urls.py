from django.urls import path 
from . import views

urlpatterns = [

    path('', views.index),
    path('addbook', views.addbook),
    path('book/<int:id>', views.indexbook),
    path('authors', views.indexAuthor),
    path('authors/<int:id>', views.indexAuthorid),
    path('authors/add', views.addauthors),
    path('authors/<int:id>',views.addnewwbookafterviewing)
]
