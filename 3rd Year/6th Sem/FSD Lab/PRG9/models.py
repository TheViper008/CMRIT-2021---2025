from django.db import models

# Create your models here.
genders = (("M", "Male"), ('F', 'Female'))
    
class Student(models.Model):
    student_usn = models.CharField(max_length=10, blank=False, null=False, unique=True)
    student_name = models.CharField(max_length=80, blank=False, null=False)
    student_sem = models.IntegerField(blank=False, null=False)
    student_gender = models.CharField(blank=False, null=False, max_length=1, choices=genders)
    
    
