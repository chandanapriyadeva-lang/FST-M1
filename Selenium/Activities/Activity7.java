import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity7 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the text field
        WebElement textbox = driver.findElement(By.id("textInput"));
        // Check if it is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        // Click the toggle button to enable it
        driver.findElement(By.id("textInputButton")).click();
        // Check if the text field is enabled
        System.out.println("Input field is enabled: " + textbox.isEnabled());
        
        // Type something in to it
        textbox.sendKeys("Example text");
        System.out.println(textbox.getDomProperty("value"));

        // Close the browser
        driver.quit();
    }
}

Activity 7
Python Solution:

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/dynamic-controls")

    # Print the title of the page
    print("Page title is: ", driver.title)
    
	# Find the checkbox
    textbox = driver.find_element(By.ID, "textInput")
    # Verify if the checkbox is enabled or not
    print("Textbox is enabled: ", textbox.is_enabled())
    # Click it again
    driver.find_element(By.ID, "textInputButton").click()
    # Verify again if the textbox is enabled or not
    print("Textbox is enabled: ", textbox.is_enabled())

Simulating Complex Interactions
Handling special keyboard and mouse events are done using the Advanced User Interactions API.
In Java:
It consists of the Actions and Action classes that are needed when executing these events.
In Python:
It consists of the webdriver.ActionChains() method to generate an actions builder.
Events on a web page are the result of user interactions with the webpage.
The user can interact with the page either by a keyboard or by a mouse.
Keyboard events can be stuff like: pressing ENTER (RETURN), typing in a input field, pressing arrow keys, etc.
Mouse events can be stuff like: left click, right click, hovering over an element, etc.
Simulating Complex Interactions
Complex Keyboard Actions
26 . 2



