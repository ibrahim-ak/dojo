from django.db import models


class TvshowManager(models.Manager):
     def basic_validator(self, postData):
          errors = {}
          if len(postData['title']) < 2:
               errors["title"] = "title  should be at least 2 characters"
          if len(postData['Network']) < 3:
               errors["desc"] = "Network  should be at least 3 characters"
          if len(postData['Description']) < 10:
               errors["Description"] = " description should be at least 3 characters"
          return errors
     
class TVshow(models.Model):
     title = models.CharField(max_length=70)
     network = models.CharField(max_length=70)
     releaseDate = models.DateField()
     desc=models.TextField()
     creatd_at = models.DateTimeField(auto_now_add=True)
     updated_at = models.DateTimeField(auto_now=True)
     objects = TvshowManager()
