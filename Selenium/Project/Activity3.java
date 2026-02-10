def login_to_site():
    driver.get("http://alchemy.hguy.co/orangehrm")
    username_field = driver.find_element(By.NAME, "username")
    password_field = driver.find_element(By.NAME, "password")
    username_field.send_keys("orange")
    password_field.send_keys("orangepassword123")
    login_button = driver.find_element(By.XPATH, "//button[@type='submit']")
    login_button.click()
    try:
        WebDriverWait(driver, 10).until(EC.title_contains("OrangeHRM"))
        print("Login successful")
    except TimeoutException:
        print("Login failed")
    driver.quit()
