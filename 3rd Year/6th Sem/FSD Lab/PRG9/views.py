from io import BytesIO
from django.http import HttpResponse
from django.shortcuts import render
import csv
from csvapp.models import Student
from reportlab.platypus import SimpleDocTemplate, Table
#Create your views here.


def generate_csv_response(request):

    fieldnames = ['student_name', 'student_usn']

    queryset = Student.objects.all().values(*fieldnames)

    response = HttpResponse(content_type='text/csv')
    response['Content-Disposition'] = 'attachment; filename="student_data.csv"'

    writer = csv.DictWriter(response, fieldnames=fieldnames)
    writer.writeheader()

    for row in queryset:
        writer.writerow(row)

    return response

def generate_pdf_response(request):
    buffer = BytesIO()
    pdf = SimpleDocTemplate(buffer)

    queryset = Student.objects.all()
    data = [['Name', 'USN']]  

    for obj in queryset:
        data.append([obj.student_name, obj.student_usn])

    table = Table(data)

    pdf.build([table])

    response = HttpResponse(content_type='application/pdf')
    response['Content-Disposition'] = 'attachment; filename="student_data.pdf"'
    response.write(buffer.getvalue())
    buffer.close()

    return response
