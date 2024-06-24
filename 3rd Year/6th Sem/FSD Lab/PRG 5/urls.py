from django.contrib import admin
from django.urls import path
from student.views import register,course_search

urlpatterns = [
    path('admin/', admin.site.urls),
    path('register/',register),
    path('coursesearch/',course_search),
]
