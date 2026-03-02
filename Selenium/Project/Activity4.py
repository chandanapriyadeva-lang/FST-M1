# Activity 4: Add a new employee
def add_new_employee():
    driver.get("http://alchemy.hguy.co/orangehrm")
    username_field = driver.find_element(By.NAME, "username")
    password_field = driver.find_element(By.NAME, "password")
    username_field.send_keys("orange")
    password_field.send_keys("orangepassword123")
    login_button = driver.find_element(By.XPATH, "//button[@type='submit']")
    login_button.click()
    try:
        WebDriverWait(driver, 10).until(EC.title_contains("OrangeHRM"))
        pim_option = driver.find_element(By.XPATH, "//a[@href='#/pim/viewEmployeeList']")
        pim_option.click()
        add_button = driver.find_element(By.XPATH, "//button[@type='button' and @class='btn btn-primary']")
        add_button.click()
        first_name_field = driver.find_element(By.NAME, "firstName")
        last_name_field = driver.find_element(By.NAME, "lastName")
        first_name_field.send_keys("John")
        last_name_field.send_keys("Doe")
        save_button = driver.find_element(By.XPATH, "//button[@type='submit']")
        save_button.click()
        try:
            WebDriverWait(driver, 10).until(EC.title_contains("Employee List"))
            print("Employee added successfully")
        except TimeoutException:
            print("Employee addition failed")
    except TimeoutException:
        print("Login failed")
    driver.quit()
