//Add 3 Tasks & Assert
@Test
public void addTasksTest() {

    driver.findElement(By.id("fab")).click(); // Add task button

    addTask("Complete Activity 1", "High");
    addTask("Complete Activity 2", "Medium");
    addTask("Complete Activity 3", "Low");

    List<WebElement> tasks = driver.findElements(By.id("taskName"));
    Assert.assertEquals(tasks.size(), 3);
}

public void addTask(String taskName, String priority) {
    driver.findElement(By.id("taskTitle")).sendKeys(taskName);
    driver.findElement(By.id("prioritySpinner")).click();
    driver.findElement(By.xpath("//android.widget.TextView[@text='" + priority + "']")).click();
    driver.findElement(By.id("saveButton")).click();
}
//Edit Task & Add Deadline
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
//Mark Tasks Complete
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
//To-Do List Web Page
@Test
public void webTodoTest() {

    driver.get("https://training-support.net/webelements");

    driver.findElement(By.xpath("//android.view.View[@text='To-Do List']")).click();

    WebElement input = driver.findElement(By.id("taskInput"));
    input.sendKeys("Add tasks to list\n");
    input.sendKeys("Get number of tasks\n");
    input.sendKeys("Clear the list\n");

    List<WebElement> tasks = driver.findElements(By.className("task"));
    Assert.assertEquals(tasks.size(), 5); // 2 existing + 3 added

    for(WebElement task : tasks) {
        task.click(); // strike out
    }
}
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

