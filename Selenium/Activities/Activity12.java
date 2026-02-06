import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Activity12 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();
        // Create the Wait object
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        // Open the page
        driver.get("https://www.training-support.net/webelements/dynamic-content");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the button and click it
        driver.findElement(By.id("genButton")).click();
        // Wait for the word to appear
        if (wait.until(ExpectedConditions.textToBePresentInElementLocated(By.id("word"), "release"))) {
            // Print the text to console
            System.out.println("Word found: " + driver.findElement(By.id("word")).getText());
        }
        // Close the browser
        driver.quit();
    }
}

Activity 12
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
    driver.get("https://training-support.net/webelements/dynamic-content")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the button and click it
    driver.find_element(By.ID, "genButton").click()
    # Wait for the word to appear
    if wait.until(EC.text_to_be_present_in_element((By.ID, "word"), "release")):
        # Print the text to console
        print("Word found: ", driver.find_element(By.ID, "word").text)

Handling Multiple Elements
Finding Multiple Web Elements
To find multiple WebElements on a web page, we use:

driver.findElements() in Java
driver.find_elements() in Python
Its usage is very limited. We interact with single elements far more than multiple elements.
Both methods return a list of all the elements matching the specified locator.
If the element doesn’t exist or is not available on the page then, the return value will be an empty list.
List<WebElement> elements = driver.findElements(By.xpath("//table/tr"));
elements = driver.find_elements(By.XPATH, "//table/tr")


Handling Web Tables
35 . 2



