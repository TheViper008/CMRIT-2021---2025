from django.contrib import admin
from django.urls import path
from csvapp.views import generate_csv_response, generate_pdf_response

urlpatterns =[
    	path('admin/', admin.site.urls),
 	    path('generatecsv/', generate_csv_response),
    	path('generatepdf/', generate_pdf_response),
]
