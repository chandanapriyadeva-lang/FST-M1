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
