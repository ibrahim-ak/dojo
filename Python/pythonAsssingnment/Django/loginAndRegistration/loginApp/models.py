from django.db import models
import re
# Create your models here.

class UserManger(models.Manager):
     def basic_validator(self, postData):
          errors = {}
          # add keys and values to errors dictionary for each invalid field
          if len(postData['first_name']) < 2:
               errors["first_name"] = "First name should be at least 2 characters"
          if len(postData['last_name']) < 2:
               errors["last_name"] = "Last name should be at least 2 characters"
          EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
          if not EMAIL_REGEX.match(postData['email']):
               errors ['email'] = "Invalid email address!"
          if len(postData['password']) < 8:
               errors["password"] = "password should be at least 8 characters"
          if postData['password'] != postData['password_confirmation']:
               errors ['passwordNotmatch'] = "password didnt matchs please check"
          
          return errors
class User(models.Model):
     first_name=models.CharField(max_length=255)
     last_name=models.CharField(max_length=255)
     Email=models.CharField(max_length=255)
     password=models.CharField(max_length=255)
     created_at=models.DateTimeField(auto_now_add=True)
     updated_at=models.DateTimeField(auto_now=True)
     objects = UserManger()