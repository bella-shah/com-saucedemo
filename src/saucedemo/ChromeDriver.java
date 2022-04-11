package saucedemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.time.Duration;

public class ChromeDriver {
    public static void main(String[] args) {
        String baseUrl = "https://www.saucedemo.com/";
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        WebDriver driver = new org.openqa.selenium.chrome.ChromeDriver();
        //launch the url
        driver.get(baseUrl);
        //maximise the window
        driver.manage().window().maximize();
        //the implicit time to driver
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(80));
        String title = driver.getTitle();
        System.out.println(title);
        //get current url
        System.out.println("Current URL = " + driver.getCurrentUrl());
        // find the email field element
        WebElement emailField = driver.findElement(By.id("user-name"));
        emailField.sendKeys("standard_user");
        // find the password field element
        WebElement passwordField = driver.findElement(By.name("password"));
        passwordField.sendKeys("secret_sauce");
        // close the browser

        driver.close();
    }
}
