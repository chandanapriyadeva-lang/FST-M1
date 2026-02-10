# Activity 9: Retrieve emergency contacts
def retrieve_emergency_contacts():
    driver.get("http://alchemy.hguy.co/orangehrm")
    username_field = driver.find_element(By.NAME, "username")
    password_field = driver.find_element(By.NAME, "password")
    username_field.send_keys("orange")
    password_field.send_keys("orangepassword123")
    login_button = driver.find_element(By.XPATH, "//button[@type='submit']")
    login_button.click()
    try:
        WebDriverWait(driver, 10).until(EC.title_contains("OrangeHRM"))
        my_info_option = driver.find_element(By.XPATH, "//a[@href='#/pim/viewMyDetails']")
        my_info_option.click()
        emergency_contacts_option = driver.find_element(By.XPATH, "//a[@href='#/pim/viewEmergencyContacts']")
        emergency_contacts_option.click()
        emergency_contacts_table = driver.find_element(By.XPATH, "//table[@class='table table-striped']")
        emergency_contacts_rows = emergency_contacts_table.find_elements(By.TAG_NAME, "tr")
        for row in emergency_contacts_rows:
            print(row




