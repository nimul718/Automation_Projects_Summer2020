package Day7_09202020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.ArrayList;

public class Action_Item7 {

    public static void main(String[] args) throws InterruptedException {
        //set the chrome driver location
        System.setProperty("webDriver.chrome.driver","src/main/resources/chromedriver");

        //setting the chrome options before defining the driver
        ChromeOptions options = new ChromeOptions();
        //set the driver to be maximized
        //options.addArguments("start-maximized");
        //set the driver to be incognito mode(private)
        options.addArguments("incognito");
        //run the driver in headless mode
        options.addArguments("headless");


        //defining the web driver that you will be using
        WebDriver driver = new ChromeDriver(options); //options variable should be passed here

        //set the zipCode
        ArrayList<String> zipCode = new ArrayList<>();
        zipCode.add("11210");
        zipCode.add("11219");
        zipCode.add("10001");

        //navigate to weightWatchers website
        driver.navigate().to("https://www.weightwatchers.com");
        Thread.sleep(2000);


        //capture the home page title and verify it matches the expected title
        //which is Weight Watchers: Weight Loss & Wellness Help

        String actualTitle = driver.getTitle();
        //verify it matches the expected title
        if(actualTitle == "Weight Watchers: Weight Loss & Wellness Help"){
            System.out.println("Title matches");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }//end of conditional statement



        //go to website
        //driver.navigate()



        //add zipCode
        for(int i = 0; i < zipCode.size(); i++) {
            //navigate to weightwatchers website
            driver.navigate().to("https://www.weightwatchers.com");
            Thread.sleep(2000);











        }//end of loop






    }//end of main method





}//end of java class

