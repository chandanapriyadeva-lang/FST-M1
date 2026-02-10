@Test
public void editTaskAddDeadline() {

    WebElement firstTask = driver.findElements(By.id("taskName")).get(0);

    new TouchAction(driver)
            .longPress(LongPressOptions.longPressOptions()
            .withElement(ElementOption.element(firstTask)))
            .release().perform();

    driver.findElement(By.id("deadlineField")).click();

    // Select next Saturday (example locator)
    driver.findElement(By.xpath("//android.view.View[@content-desc='13']")).click();
    driver.findElement(By.id("okButton")).click();

    driver.findElement(By.id("saveButton")).click();

    String deadline = driver.findElement(By.id("deadlineLabel")).getText();
    Assert.assertTrue(deadline.contains("Sat"));
}

