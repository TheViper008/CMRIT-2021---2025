from django.contrib import admin
from django.urls import path
from student.views import addProject

urlpatterns = [
    path("admin/", admin.site.urls),
    path("addprojects/", addProject),
]
