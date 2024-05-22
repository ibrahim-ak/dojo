from django.utils import timezone
from django.db import models
import re
class UserManager(models.Manager):
     def basic_validator(self, postData):
          errors = {}
          if len(postData['first_name']) < 5:
               errors["first_name"] = "first name should be at least 5 characters"
          if len(postData['last_name']) < 5:
               errors["last_name"] = "lastname should be at least 5 characters"
          if len(postData['password']) < 5: 
               errors["password"] = "password should be at least 5 characters"
          EMAIL_REGEX = re.compile(r'^[a-zA-Z0-9.+_-]+@[a-zA-Z0-9._-]+\.[a-zA-Z]+$')
          if not EMAIL_REGEX.match(postData['email']):
               errors['email'] = ' nvalid email address!'
          
          
          return errors
class BookManager(models.Manager):

     def basic_validator_book(self, postData):
          errors = {}
          if (len(postData['title']) < 3)  :
               errors["title"] = "you should insert a title"
          if len(postData['descrption']) < 5:
               errors["descrption"] = "descrption should be at least 5 characters"
          return errors
# Create your models here.
class User(models.Model):
     first_name = models.CharField(max_length=45)
     last_name = models.CharField(max_length=45)
     email = models.EmailField()
     password = models.TextField()
     objects =UserManager()
     creatd_at = models.DateTimeField(auto_now_add=True)
     updated_at = models.DateTimeField(auto_now=True)

class Book(models.Model):
     title=models.CharField(max_length=60)
     description = models.TextField()
     uplodaed_book = models.ForeignKey(User,related_name='books_uploaded',on_delete=models.CASCADE)
     users_like = models.ManyToManyField(User,related_name='like_book')
     objects =BookManager()
     creatd_at = models.DateTimeField(default=timezone.now)
     updated_at = models.DateTimeField(default=timezone.now)
     