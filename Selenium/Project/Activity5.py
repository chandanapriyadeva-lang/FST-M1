# Activity 5: Edit user information
def edit_user_information():
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
        edit_button = driver.find_element(By.XPATH, "//button[@type='button' and @class='btn btn-primary']")
        edit_button.click()
        first_name_field = driver.find_element(By.NAME, "firstName")
        last_name_field = driver.find_element(By.NAME, "lastName")
        first_name_field.send_keys("Jane")
        last_name_field.send_keys("Doe")
        save_button = driver.find_element(By.XPATH, "//button[@type='submit']")
        save_button.click()
        try:
            WebDriverWait(driver, 10).until(EC.title_contains("My Info"))
            print("User information updated successfully")
        except TimeoutException:
            print("User information update failed")
    except TimeoutException:
        print("Login failed")
    driver.quit()
