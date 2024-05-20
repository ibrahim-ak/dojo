from django.urls import path 
from . import views

urlpatterns = [

     path('', views.index),
     path ('adduser',views.addUser),
     path('login',views.login),
     path ('success',views.success),
     path('logout', views.logout),
     path('createpost/<int:id>',views.post),
     path('addcomment/<int:id>/<int:msgid>',views.addcomment),
     path('delete/<int:id>',views.deletecomment),

     

]
