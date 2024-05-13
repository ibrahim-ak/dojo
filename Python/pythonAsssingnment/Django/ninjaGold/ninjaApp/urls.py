from django.urls import path 
from . import views

urlpatterns = [
     path('',views.index),
     path('farming',views.farming),
     path('cave',views.cave),
     path('home',views.home),
     path('quest',views.quest),
     path('clear',views.clear),
     # path('activity',views.activities)

]