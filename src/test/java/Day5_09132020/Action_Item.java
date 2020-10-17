package Day5_09132020;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class Action_Item {
    public static void main(String[] args) throws InterruptedException {

        //set the chrome driver location
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver");

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

        //lets create dynamic array to handle multiple boroughs on google search
        String[] Hobby = new String[5];
        Hobby[0] = "gym";
        Hobby[1] = "basketball";
        Hobby[2] = "football";
        Hobby[3] = "photography";
        Hobby[4] = "sculpting";

        for (int i = 0; i < Hobby.length; i++) {
            //let's navigate to bing home page
            driver.navigate().to("https://www.bing.com");

            //maximize my window
            driver.manage().window().maximize();

            //put two second delay
            Thread.sleep(2000);

            //locate search field by name and enter a keyword on the field
            driver.findElement(By.name("q")).sendKeys(Hobby[i]);

            //click on bing search
            driver.findElement(By.name("search")).submit();
            //delay to load search result page
            Thread.sleep(2000);
            //capture the search result text
            String result = driver.findElement(By.className("sb_count")).getText();
            String[] arrayResult = result.split(" ");
            //print out the search number
            System.out.println("My search number for " + Hobby[i] + " is " + arrayResult[0]);

        }//end of loop

        driver.quit();










        }//end of main method











}//end of java class
