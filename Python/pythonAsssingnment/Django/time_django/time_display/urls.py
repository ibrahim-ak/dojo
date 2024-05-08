from django.urls import path     
from . import views
urlpatterns = [
     path('',views.redir  ),
     path('timedisplay',views.index)
]
