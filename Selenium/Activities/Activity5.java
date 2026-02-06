import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity5 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the checkbox
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        // Find the toggle button and click it
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Check if it is displayed on the page
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());
        // Click the button again
        driver.findElement(By.xpath("//button[text()='Toggle Checkbox']")).click();
        // Check if it is displayed on the page
        System.out.println("Checkbox is displayed: " + checkbox.isDisplayed());

        // Close the browser
        driver.quit();
    }
}

Activity 5
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
    checkbox = driver.find_element(By.ID, "checkbox")
    # Find the checkbox toggle button
    checkbox_toggle = driver.find_element(By.XPATH, "//button[text()='Toggle Checkbox']")
    # Verify if the checkbox is displayed or not
    print("Checkbox is visible: ", checkbox.is_displayed())

    # Click the checkbox_toggle button to hide checkbox
    checkbox_toggle.click()
    # Verify again if the checkbox is displayed or not
    print("Checkbox is visible: ", checkbox.is_displayed())

Activity 6
Check if elements are selected
Using Selenium:

Open a new browser to https://training-support.net/webelements/dynamic-controls
Get the title of the page and print it to the console.
On the page, perform:
Find the checkbox input element.
Check if the checkbox is selected and print the result.
Click the checkbox to select it.
Check if the checkbox is selected again and print the result.
Close the browser.
Activity 6
Java Solution:

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity6 {
    public static void main(String[] args) {
        // Initialize the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/dynamic-controls");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the checkbox
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        // Click it
        checkbox.click();
        // Check if it is selected
        System.out.println("Checkbox is selected: " + checkbox.isSelected());
        // Click the checkbox again
        checkbox.click();
        // Check if it is selected
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

        // Close the browser
        driver.quit();
    }
}

Activity 7
Check if elements are enabled
Using Selenium:

Open a new browser to https://training-support.net/webelements/dynamic-controls
Get the title of the page and print it to the console.
On the page, perform:
Find the text field.
Check if the text field is enabled and print it.
Click the "Enable Input" button to enable the input field.
Check if the text field is enabled again and print it.
Close the browser.
24 . 2



