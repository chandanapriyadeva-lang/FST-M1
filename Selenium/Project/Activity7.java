# Activity 7: Adding qualifications
def add_qualifications():
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
        qualification_option = driver.find_element(By.XPATH, "//a[@href='#/pim/viewQualifications']")
        qualification_option.click()
        add_button = driver.find_element(By.XPATH, "//button[@type='button' and @class='btn btn-primary']")
        add_button.click()
        qualification_field = driver.find_element(By.NAME, "qualification")
        qualification_field.send_keys("Bachelor's Degree")
        save_button = driver.find_element(By.XPATH, "//button[@type='submit']")
        save_button.click()
        try:
            WebDriverWait(driver, 10).until(EC.title_contains("Qualifications"))
            print("Qualification added successfully")
        except TimeoutException:
            print("Qualification addition failed")
    except TimeoutException:
        print("Login failed")
    driver.quit()
