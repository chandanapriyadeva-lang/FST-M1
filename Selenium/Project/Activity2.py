# Activity 2: Get the URL of the header image
def get_header_image_url():
    driver.get("http://alchemy.hguy.co/orangehrm")
    header_image = driver.find_element(By.XPATH, "//img[@alt='OrangeHRM']")
    header_image_url = header_image.get_attribute("src")
    print(header_image_url)
    driver.quit()
