from django.shortcuts import render
from django.http import HttpResponse
from student.models import Student
from django.views import generic

# Create your views here.

class StudentListGenView(generic.ListView):
    model = Student
    template_name = 'student_list.html'
    
class StudentDetailGenView(generic.DetailView):
    model = Student
    template_name = 'student_detail.html'
