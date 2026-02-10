# Activity 8: Applying for a leave
def apply_for_leave():
    driver.get("http://alchemy.hguy.co/orangehrm")
    username_field = driver.find_element(By.NAME, "username")
    password_field = driver.find_element(By.NAME, "password")
    username_field.send_keys("orange")
    password_field.send_keys("orangepassword123")
    login_button = driver.find_element(By.XPATH, "//button[@type='submit']")
    login_button.click()
    try:
        WebDriverWait(driver, 10).until(EC.title_contains("OrangeHRM"))
        dashboard_option = driver.find_element(By.XPATH, "//a[@href='#/dashboard']")
        dashboard_option.click()
        apply_leave_button = driver.find_element(By.XPATH, "//button[@type='button' and @class='btn btn-primary']")
        apply_leave_button.click()
        leave_type_field = driver.find_element(By.NAME, "leaveType")
        leave_type_field.send_keys("Annual Leave")
        start_date_field = driver.find_element(By.NAME, "startDate")
        start_date_field.send_keys("2024-01-01")
        end_date_field = driver.find_element(By.NAME, "endDate")
        end_date_field.send_keys("2024-01-05")
        save_button = driver.find_element(By.XPATH, "//button[@type='submit']")
        save_button.click()
        try:
            WebDriverWait(driver, 10).until(EC.title_contains("Leave List"))
            print("Leave applied successfully")
        except TimeoutException:
            print("Leave application failed")
    except TimeoutException:
        print("Login failed")
    driver.quit()
