from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.ui import WebDriverWait
from selenium.webdriver.support import expected_conditions as EC
from selenium.common.exceptions import TimeoutException

# Set up the browser
driver = webdriver.Chrome()

# Activity 1: Verify the website title
def verify_website_title():
    driver.get("http://alchemy.hguy.co/orangehrm")
    title = driver.title
    if title == "OrangeHRM":
        print("Title matches")
    else:
        print("Title does not match")
    driver.quit()
