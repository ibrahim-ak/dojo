from django.urls import path 
from . import views

urlpatterns = [
    # path('admin/', admin.site.urls),
    path('', views.index),
    path('addDojo', views.addDojo),
    path('addNinja',views.addNinja)
]