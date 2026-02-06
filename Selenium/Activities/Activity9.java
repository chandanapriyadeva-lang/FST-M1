import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity9 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        // Open the page
        driver.get("https://training-support.net/webelements/keyboard-events");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Press the key
        builder.sendKeys("This is coming from Selenium").sendKeys(Keys.RETURN).build().perform();
        
        // Print the message from the page
        String pageText = driver.findElement(By.cssSelector("h1.mt-3")).getText();
        System.out.println(pageText);

        // Close the browser
        driver.quit();
    }
}

Activity 9
Python Solution:

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver import Keys, ActionChains
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the actions variable
    actions = ActionChains(driver)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/keyboard-events")

    # Print the title of the page
    print("Page title is: ", driver.title)

    # Press the key
    actions.send_keys("This is coming from Selenium").send_keys(Keys.RETURN).perform()
    
    # Print the message from the page
    pageText = driver.find_element(By.CSS_SELECTOR, "h1.mt-3").text
    print(pageText)

Using Selenium:

Open a new browser to https://training-support.net/webelements/drag-drop
Get the title of the page and print it to the console.
On the page, perform:
Find the ball and simulate a click and drag to move it into "Dropzone 1".
Verify that the ball has entered Dropzone 1.
Once verified, move the ball into "Dropzone 2".
Verify that the ball has entered Dropzone 2.
Close the browser.
Activity 10
Drag and Drop
Activity 10
Java Solution:

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Actions object
        Actions builder = new Actions(driver);

        // Open the page
        driver.get("https://training-support.net/webelements/drag-drop");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the football
        WebElement football = driver.findElement(By.id("ball"));
        // Find the dropzone1
        WebElement dropzone1 = driver.findElement(By.id("dropzone1"));
        // Find the dropzone2
        WebElement dropzone2 = driver.findElement(By.id("dropzone2"));

        // Perform drag and drop to dropzone 1
        builder.clickAndHold(football).moveToElement(dropzone1).pause(5000).release().build().perform();
        if(dropzone1.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 1");
        }

        // Perform drag and drop to dropzone 2
        builder.dragAndDrop(football, dropzone2).pause(5000).build().perform();
        if(dropzone2.findElement(By.className("dropzone-text")).getText().equals("Dropped!")) {
        	System.out.println("Ball was dropped in Dropzone 2");
        }

        // Close the browser
        driver.quit();
    }
}

Selenium Waits
31 . 2



