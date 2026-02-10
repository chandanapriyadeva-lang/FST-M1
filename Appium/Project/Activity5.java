//Correct Credentials
@Test
public void loginValidTest() {

    driver.get("https://training-support.net/webelements");
    driver.findElement(By.xpath("//android.view.View[@text='Login Form']")).click();

    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("password");
    driver.findElement(By.id("submitButton")).click();

    String message = driver.findElement(By.id("successMessage")).getText();
    Assert.assertTrue(message.contains("Welcome"));
}
//Incorrect Credentials
@Test
public void loginInvalidTest() {

    driver.findElement(By.id("username")).sendKeys("admin");
    driver.findElement(By.id("password")).sendKeys("wrongpass");
    driver.findElement(By.id("submitButton")).click();

    String message = driver.findElement(By.id("errorMessage")).getText();
    Assert.assertTrue(message.contains("Invalid"));
}
//popup Login
@Test
public void popupLoginTest() {

    driver.get("https://training-support.net/webelements");
    driver.findElement(By.xpath("//android.view.View[@text='Popups']")).click();

    driver.findElement(By.id("openPopup")).click();

    driver.findElement(By.id("popupUsername")).sendKeys("admin");
    driver.findElement(By.id("popupPassword")).sendKeys("password");
    driver.findElement(By.id("popupSubmit")).click();

    String message = driver.findElement(By.id("popupSuccess")).getText();
    Assert.assertTrue(message.contains("Success"));
}


