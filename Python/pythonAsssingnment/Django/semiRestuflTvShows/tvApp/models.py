from django.db import models


class TVshow(models.Model):
     title = models.CharField(max_length=70)
     network = models.CharField(max_length=70)
     releaseDate = models.DateField()
     desc=models.TextField()
     creatd_at = models.DateTimeField(auto_now_add=True)
     updated_at = models.DateTimeField(auto_now=True)
