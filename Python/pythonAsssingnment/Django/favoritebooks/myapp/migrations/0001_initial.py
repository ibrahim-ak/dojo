# Generated by Django 5.0.6 on 2024-05-21 10:34

import django.db.models.deletion
from django.db import migrations, models


class Migration(migrations.Migration):

    initial = True

    dependencies = [
    ]

    operations = [
        migrations.CreateModel(
            name='User',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('first_name', models.CharField(max_length=45)),
                ('last_name', models.CharField(max_length=45)),
                ('creatd_at', models.DateTimeField(auto_now_add=True)),
                ('updated_at', models.DateTimeField(auto_now=True)),
            ],
        ),
        migrations.CreateModel(
            name='Book',
            fields=[
                ('id', models.BigAutoField(auto_created=True, primary_key=True, serialize=False, verbose_name='ID')),
                ('title', models.CharField(max_length=60)),
                ('uplodaed_book', models.ForeignKey(on_delete=django.db.models.deletion.CASCADE, related_name='books_uploaded', to='myapp.user')),
                ('users_like', models.ManyToManyField(related_name='like_book', to='myapp.user')),
            ],
        ),
    ]
