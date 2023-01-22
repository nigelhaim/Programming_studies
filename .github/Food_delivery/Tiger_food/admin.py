from django.contrib import admin
from .models import User, LOCATION, CUSTOMER, RIDER, RESTAURANT, ORDER, RESIDENCE
# Register your models here.
class DelAdmin(admin.ModelAdmin):
	readonly_fields = ('id',)
admin.site.register(User, DelAdmin)
admin.site.register(LOCATION, DelAdmin)
admin.site.register(RESIDENCE, DelAdmin)
admin.site.register(ORDER, DelAdmin)
admin.site.register(CUSTOMER, DelAdmin)
admin.site.register(RIDER, DelAdmin)
admin.site.register(RESTAURANT, DelAdmin)
