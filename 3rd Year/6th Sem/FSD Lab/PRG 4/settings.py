INSTALLED_APPS = [
    'django.contrib.admin',
    'django.contrib.auth',
    'django.contrib.contenttypes',
    'django.contrib.sessions',
    'django.contrib.messages',
    'django.contrib.staticfiles',
    'webpage',
]

TEMPLATES = [
    {
        'DIRS': [os.path.join(BASE_DIR,'templates')],
    },
]