from django.db import models
from django.contrib.auth.models import AbstractUser
# Create your models here.

class User(AbstractUser):
	pass
class LOCATION(models.Model):
	LOC_CITY = models.CharField(max_length=500)
	LOC_REGION = models.CharField(max_length=500)
	

class RIDER(models.Model):
	RIDER_LNAME = models.CharField(max_length=50)
	RIDER_FNAME = models.CharField(max_length=50)
	RIDER_CONTACT_NUMBER = models.IntegerField()

class RESTAURANT(models.Model):
	RES_NAME = models.CharField(max_length=50)
	LOC_NUMBER = models.ForeignKey(LOCATION, on_delete=models.CASCADE, related_name="res_location", blank=True, null=True)
class PAYMENT(models.Model):
	PAYTYPE = models.CharField(max_length=10)
	PAY_AMOUNT = models.IntegerField()
	#CUS_CODE = models.ForeignKey(CUSTOMER, on_delete=models.CASCADE, related_name="pay_customer")
	#ORDER_CODE = models.ForeignKey(ORDER, on_delete=models.CASCADE, related_name="pay_order")
class RESIDENCE(models.Model):
	LOC_NUMBER = models.ForeignKey(LOCATION, on_delete=models.CASCADE, related_name="location", blank=True, null=True)
	RESD_STREET = models.CharField(max_length=100)
	RESD_BLDG = models.CharField(max_length=100)
class CUSTOMER(models.Model):
	#ForeignKey meaning one to Many / Many to one relationships 
	user = models.OneToOneField(User, null=True, on_delete=models.CASCADE)
	CUS_LNAME = models.CharField(max_length=50)
	CUS_FNAME = models.CharField(max_length=50)
	CUS_CONTACT_NUMBER = models.IntegerField()
	RESIDENCE = models.ForeignKey(RESIDENCE, on_delete=models.CASCADE, related_name="cus_resdence")
class ORDER(models.Model):
	CUS_CODE = models.ForeignKey(CUSTOMER, on_delete=models.CASCADE, related_name="res_location", blank=True, null=True)
	ORDER_DATE = models.DateTimeField()
	ORDER_TIME = models.DateTimeField()
	RIDER_ID = models.ForeignKey(RIDER, on_delete=models.CASCADE, related_name="rider", blank=True, null=True)
	PAY_ID = models.ForeignKey(PAYMENT, on_delete=models.CASCADE, related_name="payment", blank=True, null=True)
