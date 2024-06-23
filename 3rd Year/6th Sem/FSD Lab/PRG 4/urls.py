from django.contrib import admin
from django.urls import path
from webpage.views import homepage, contactpage, aboutpage

urlpatterns = [
    path('admin/', admin.site.urls),
    path('home/',homepage),
    path('about/',aboutpage),
    path('contact/',contactpage),
]
