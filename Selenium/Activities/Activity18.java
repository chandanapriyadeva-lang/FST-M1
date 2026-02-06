import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity18 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/alerts");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find and click the button to open the alert
        driver.findElement(By.id("simple")).click();

        // Switch focus to the alert
        Alert simpleAlert = driver.switchTo().alert();

        // Print the text in the alert
        String alertText = simpleAlert.getText();
        System.out.println("Text in alert: " + alertText);

        // Close the alert by clicking OK
        simpleAlert.accept();
        
        // Print the message
        System.out.println(driver.findElement(By.id("result")).getText());

        // Close the browser
        driver.quit();
    }
}

Activity 18
Python Solution:

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support import expected_conditions as EC
from selenium.webdriver.support.wait import WebDriverWait

# Start the Driver
with webdriver.Firefox() as driver:
    # Declare the wait variable
    wait = WebDriverWait(driver, timeout=10)
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/alerts")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find and click the button to open the alert
    driver.find_element(By.ID, "simple").click()

    # Switch focus to the alert
    simpleAlert = wait.until(EC.alert_is_present())

    # Print the text in the alert
    alertText = simpleAlert.text
    print("Text in alert: " + alertText)

    # Close the alert by clicking OK
    simpleAlert.accept()

    # Print the message
    print(driver.find_element(By.ID, "result").text)
Activity 19
Alerts #2
Using Selenium:

Open a new browser to https://training-support.net/webelements/alerts
Get the title of the page and print it to the console.
Find the button to open a CONFIRM alert and click it.
Switch the focus from the main window to the Alert box and get the text in it and print it.
Close the alert once with Ok and again with Cancel.
Close the browser.
Activity 19
Java Solution:

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity19 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/alerts");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find and click the button to open the alert
        driver.findElement(By.id("confirmation")).click();

        // Switch focus to the alert
        Alert confirmAlert = driver.switchTo().alert();

        // Print the text in the alert
        String alertText = confirmAlert.getText();
        System.out.println("Text in alert: " + alertText);

        // Close the alert by clicking OK
        confirmAlert.accept();

        // Can also close the alert by clicking Cancel
        // confirmAlert.dismiss();

        // Print the message
        System.out.println(driver.findElement(By.id("result")).getText());

        // Close the browser
        driver.quit();
    }
}

Activity 20
Alerts #3
Using Selenium:

Open a new browser to https://training-support.net/webelements/alerts
Get the title of the page and print it to the console.
Find the button to open a PROMPT alert and click it.
Switch the focus from the main window to the Alert box and get the text in it and print it.
Type "Awesome!" into the prompt.
Close the alert by clicking Ok.
Close the browser.
47 . 2



