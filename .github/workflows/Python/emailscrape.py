from email_scrapper import scrape_emails
from bs4 import BeautifulSoup
import requests

url = "https://www.ust.edu.ph//contacts/faculties-colleges-institutes-schools-and-departments/"
page = requests.get(url)
data = page.text
soup = BeautifulSoup(data, "html.parser")

myemails = scrape_emails(soup.decode())

for myemail in myemails:
    print(myemail)