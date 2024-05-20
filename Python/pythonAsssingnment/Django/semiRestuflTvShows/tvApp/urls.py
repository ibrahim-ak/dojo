from django.urls import path ,include
from . import views 
urlpatterns = [
     
     path('shows/',views.shows),
     path('shows/new/',views.addshow),
     path('procces',views.procces),
     path('shows/<int:id>',views.showpreviwe),
     path('shows/delete/<int:id>',views.delete),
     path('shows/showtoedit/<int:id>',views.showtoedit),
     path('edit/<int:id>',views.edit),


]