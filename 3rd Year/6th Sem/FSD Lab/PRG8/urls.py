from django.contrib import admin
from django.urls import path
from student.views import StudentDetailGenView, StudentListGenView

urlpatterns = [
    path("admin/", admin.site.urls),
    path("student_list/", StudentListGenView.as_view()),
    path("student_detail/<int:pk>/", StudentDetailGenView.as_view()),
    
]
