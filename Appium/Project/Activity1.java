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
