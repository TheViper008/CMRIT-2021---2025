import os
import requests
from bs4 import BeautifulSoup
os.makedirs('comics', exist_ok=True)
for i in range(1, 10):
    try:
        page = requests.get(f"https://xkcd.com/{i}").content
        soup = BeautifulSoup(page, "html.parser")
        image = soup.find('div', {'id': "comic"}).img['src']

        with open(os.path.join('comics', image.split("/")[-1]), "wb") as f:
            f.write(requests.get("https://" + image[2:]).content)
            print(f"Downloaded comic {i}")
            
    except:
        print(f"Could not download comic {i}")

print("Done!")
