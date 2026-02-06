import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity16 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title is: " + driver.getTitle());

        // Find the dropdown
        WebElement dropdown = driver.findElement(By.cssSelector("select.h-10"));
        // Pass the WebElement to the Select object
        Select singleSelect = new Select(dropdown);

        // Select the second option using visible text
        singleSelect.selectByVisibleText("Two");
        // Print the selected option
        System.out.println("Second option: " + singleSelect.getFirstSelectedOption().getText());

        // Select the third option using index
        singleSelect.selectByIndex(3);
        // Print the selected option
        System.out.println("Third option: " + singleSelect.getFirstSelectedOption().getText());

        // Select the fourth option using value attribute
        singleSelect.selectByValue("four");
        // Print the selected option
        System.out.println("Fourth option: " + singleSelect.getFirstSelectedOption().getText());

        // Print all the options
        List<WebElement> allOptions = singleSelect.getOptions();
        System.out.println("Options in the dropdown: ");
        for(WebElement option : allOptions) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}

Activity 16
Python Solution:

# Import webdriver from selenium
from selenium import webdriver
from selenium.webdriver.common.by import By
from selenium.webdriver.support.select import Select

# Start the Driver
with webdriver.Firefox() as driver:
    # Navigate to the URL
    driver.get("https://training-support.net/webelements/selects")
    # Print the title of the page
    print("Page title is: ", driver.title)

    # Find the dropdown
    dropdown = driver.find_element(By.CSS_SELECTOR, "select.h-10")
    # Pass the WebElement to the Select object
    singleSelect = Select(dropdown)

    # Select the second option using visible text
    singleSelect.select_by_visible_text("Two")
    # Print the selected option
    print("Second option: " + singleSelect.first_selected_option.text)

    # Select the third option using index
    singleSelect.select_by_index(3)
    # Print the selected option
    print("Third option: " + singleSelect.first_selected_option.text)

    # Select the fourth option using value attribute
    singleSelect.select_by_value("four")
    # Print the selected option
    print("Fourth option: " + singleSelect.first_selected_option.text)

    # Print all the options
    allOptions = singleSelect.options
    print("Options in the dropdown: ")
    for option in allOptions: 
        print(option.text)

Activity 17
Selects #2
Using Selenium:

Open a new browser to https://training-support.net/webelements/selects
Get the title of the page and print it to the console.
On the Multi Select:
Select the "HTML" option using the visible text.
Select the 4th, 5th and 6th options using the index.
Select the "Node" option using the value.
Deselect the 5th option using index.
Close the browser.
Activity 17
Java Solution:

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Activity17 {
    public static void main(String[] args) {
        // Create a new instance of the Firefox driver
        WebDriver driver = new FirefoxDriver();

        // Open the page
        driver.get("https://training-support.net/webelements/selects");
        // Print the title of the page
        System.out.println("Page title: " + driver.getTitle());

        // Find the dropdown
        WebElement selectElement = driver.findElement(By.cssSelector("select.h-80"));
        // Pass the WebElement to the Select object
        Select multiSelect = new Select(selectElement);

        // Select "HTML" using visible text
        multiSelect.selectByVisibleText("HTML");
        // Select 4th, 5th, and 6th index options
        for (int i = 3; i <= 5; i++) {
            multiSelect.selectByIndex(i);
        }
        // Select "Node" using value attribute
        multiSelect.selectByValue("nodejs");
        // Print the selected options
        List<WebElement> selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        // Deselect the 5th index option
        multiSelect.deselectByIndex(4);
        // Print the selected options
        selectedOptions = multiSelect.getAllSelectedOptions();
        System.out.println("Selected options are: ");
        for (WebElement option : selectedOptions) {
            System.out.println(option.getText());
        }

        // Close the browser
        driver.quit();
    }
}

Handling Alerts
44 . 2



