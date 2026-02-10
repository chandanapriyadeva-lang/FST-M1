@Test
public void completeTasksTest() {

    List<WebElement> checkboxes = driver.findElements(By.id("completeCheckBox"));
    checkboxes.get(0).click();
    checkboxes.get(1).click();

    // Edit 3rd task
    WebElement thirdTask = driver.findElements(By.id("taskName")).get(2);
    new TouchAction(driver)
            .longPress(LongPressOptions.longPressOptions()
            .withElement(ElementOption.element(thirdTask)))
            .release().perform();

    WebElement progress = driver.findElement(By.id("progressBar"));
    progress.sendKeys("50");
    driver.findElement(By.id("saveButton")).click();

    driver.findElement(By.id("menuOptions")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@text='Completed tasks']")).click();

    List<WebElement> completed = driver.findElements(By.id("taskName"));
    Assert.assertEquals(completed.size(), 2);
}
