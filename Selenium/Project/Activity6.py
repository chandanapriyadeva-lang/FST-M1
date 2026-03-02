# Activity 6: Verify that the "Directory" menu item is visible and clickable
def verify_directory_menu_item():
    driver.get("http://alchemy.hguy.co/orangehrm")
    username_field = driver.find_element(By.NAME, "username")
    password_field = driver.find_element(By.NAME, "password")
    username_field.send_keys("orange")
    password_field.send_keys("orangepassword123")
    login_button = driver.find_element(By.XPATH, "//button[@type='submit']")
    login_button.click()
    try:
        WebDriverWait(driver, 10).until(EC.title_contains("OrangeHRM"))
        directory_option = driver.find_element(By.XPATH, "//a[@href='#/directory/viewDirectory']")
        directory_option.click()
        try:
            WebDriverWait(driver, 10).until(EC.title_contains("Search Directory"))
            print("Directory menu item is visible and clickable")
        except TimeoutException:
            print("Directory menu item is not visible or clickable")
    except TimeoutException:
        print("Login failed")
    driver.quit()
