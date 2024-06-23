from django.contrib import admin
from django.urls import path
from dateandtime.views import displaydate

urlpatterns = [
    path('admin/', admin.site.urls),
    path('date/', displaydate),
]
