from django.contrib import admin
from django.urls import path
from fruitlist.views import lists

urlpatterns = [
    path('admin/', admin.site.urls),
    path('fruitlist/',lists),
]
