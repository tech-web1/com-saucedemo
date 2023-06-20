package project4;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginTest {

    public static void main(String[] args) {


        String baseurl = "https://www.saucedemo.com/";

        //Launch the Chrome Browser
        WebDriver driver = new ChromeDriver();
        //open the Url into Browser
        driver.get(baseurl);

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(25));

        //Get the Title of the page
        String title = driver.getTitle();
        System.out.println("Page Title is "+title);
        //Print current Url
        System.out.println("Current Url"+driver.getCurrentUrl());

        //Print the page Source
        System.out.println("Page source"+driver.getPageSource());

        //Find the Username Field Element
        WebElement userNameField=driver.findElement(By.name("user-name"));
        userNameField.sendKeys("jaitra@yahoo.com");

        //Type the password field and type the password
        driver.findElement(By.name("password")).sendKeys("Abcd12");

        //Close The Browser
        driver.close();
    }
}

