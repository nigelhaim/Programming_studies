from bs4 import BeautifulSoup
import requests 

url = "https://www.ust.edu.ph/"
page = requests.get(url)
data = page.text

soup = BeautifulSoup(data, "html.parser")

for link in soup.find_all('a'):
    print(link.get('href'),file=open("links.txt", "a"))

print("links saved.")