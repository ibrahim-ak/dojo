from django.urls import path , include
from . import views
urlpatterns = [
    # path('admin/', admin.site.urls),
    path('',views.index ),
    path('',views.refresh),
    path('destroy_session',views.destroy_session),
    path('add2',views.add2),
    path('userIncrement',views.userIncrement)
]