
from django.urls import path 
from . import views
urlpatterns = [
     # path('admin/', admin.site.urls),
     path('',views.index),
     path('registration',views.registration),
     path('login',views.login),
     path('logout',views.logout),
     path('success',views.success),
     path('success/<int:id>',views.showbook),
     path('addbook',views.addbook),
     path('addtofavorite/<int:id>',views.addtofavorite),
     path('unfavorite/<int:id>',views.removeFromFavorite),
     path('booktoedit/<int:id>',views.booktoedit),
     path('editbook/<int:id>',views.editbook),
     path('delete/<int:id>',views.deletebook),
]
