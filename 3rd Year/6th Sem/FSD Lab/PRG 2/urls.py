from django.contrib import admin
from django.urls import path
from offsetdate.views import displaydateoffset

urlpatterns = [
    path('admin/', admin.site.urls),
    path('offset/',displaydateoffset),
]
