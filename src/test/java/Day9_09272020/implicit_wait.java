package Day9_09272020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class implicit_wait {

    public static void main(String[] args) {

        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver","src/main/resources/chromedriver");

        //setting the chrome options before defining the driver
        ChromeOptions options = new ChromeOptions();
        //set the driver to be maximized
        //options.addArguments("start-maximized");
        //set the driver to be incognito mode(private)
        options.addArguments("incognito");
        //run the driver in headless mode
        //options.addArguments("headless");


        //defining the web driver that you will be using
        WebDriver driver = new ChromeDriver(options); //options variable should be passed here



        //set the implicit wait before your test steps
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

        //navigate to hulu
        driver.navigate().to("https://www.hulu.com");

        //click on start free trial
        driver.findElement((By.xpath("//*[text()='START YOUR FREE TRIAL']")));








    }//end of main method



}//end of java class

