package Day9_09272020;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;

public class action_item3 {

    public static void main(String[] args) throws InterruptedException {

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


        //First Name list
        ArrayList<String>firstName = new ArrayList<>();
        firstName.add("Steve");
        firstName.add("John");
        firstName.add("Kobe");

        //Last name list
        ArrayList<String>lastName = new ArrayList<>();
        lastName.add("Austin");
        lastName.add("Snow");
        lastName.add("Bryant");

        //SSN
        ArrayList<String>ssnList = new ArrayList<>();
        ssnList.add("123456");
        ssnList.add("654321");
        ssnList.add("098765");

        //zipCode List
        ArrayList<String>zipCode = new ArrayList<>();
        zipCode.add("11219");
        zipCode.add("11218");
        zipCode.add("11230");

        //zipCode List
        ArrayList<String>day = new ArrayList<>();
        day.add("26");
        day.add("30");
        day.add("01");

        //zipCode List
        ArrayList<String>year = new ArrayList<>();
        year.add("1987");
        year.add("2000");
        year.add("1975");









        //navigate to UHC.com
        driver.navigate().to("https://www.uhc.com");
        Thread.sleep(2000);

        Actions actions = new Actions(driver);


        //Verify the home page title contains Health Insurance plans
        String actualTitle = driver.getTitle();
        //verify it matches the expected title
        if(actualTitle == "Health Insurance Plans"){
            System.out.println("Title matches");
        } else {
            System.out.println("Title doesn't match. Actual title is " + actualTitle);
        }//end of conditional statement


        //click on find a doctor link
        Thread.sleep(1500);
        WebElement findDoctor = driver.findElement(By.xpath("//*[text()='Find a Doctor']"));
        actions.moveToElement(findDoctor).click().perform();

        //click on sign in to find a provider
        WebElement signIn = driver.findElement(By.xpath("//*[@id='btn-sign-in']"));
        actions.moveToElement(signIn).click().perform();

        //switch to new tab using array list
        ArrayList<String> tabs = new ArrayList<>(driver.getWindowHandles());
        driver.switchTo().window(tabs.get(1));

        //click on register now
        Thread.sleep(1500);
        WebElement registerNow = driver.findElement(By.xpath("//*[@id='registerbutton']"));
        actions.moveToElement(registerNow).click().perform();

        //enter first name
        Thread.sleep(1500);
        for (int i = 0; i < firstName.size(); i++) {
            WebElement idfirstName = driver.findElement(By.xpath("//*[@name='firstName']"));
            idfirstName.clear();
            idfirstName.sendKeys(firstName.get(i));

            //enter last name
            WebElement idlastName = driver.findElement(By.xpath("//*[@name='lastName']"));
            idlastName.clear();
            idlastName.sendKeys(lastName.get(i));

            //enter date of birth
            WebElement month = driver.findElement(By.xpath("//*[@name='dob_month']"));
            Select mDropDown = new Select(month);
            mDropDown.selectByVisibleText("March");

            WebElement dobDay = driver.findElement(By.xpath("//*[@name='dob_day']"));
            dobDay.clear();
            dobDay.sendKeys(day.get(i));
            WebElement dobYear = driver.findElement(By.xpath("//*[@name='dob_year']"));
            dobYear.clear();
            dobYear.sendKeys(year.get(i));


            WebElement ssnRadio = driver.findElement(By.xpath("//*[text()='Social Security Number']"));
            actions.moveToElement(ssnRadio).click().perform();

            //enter last 6 digit of ssn
            WebElement ssnNumber = driver.findElement(By.xpath("//*[@id='ssnLastSixDigits']"));
            ssnNumber.clear();
            ssnNumber.sendKeys(ssnList.get(i));


            //enter zipcode
            WebElement zipCodeNumber = driver.findElement(By.xpath("//*[@id='zipCode']"));
            zipCodeNumber.clear();
            zipCodeNumber.sendKeys(zipCode.get(i));


        }//end of for loop


        //click on No for member ID
        Thread.sleep(1500);
        JavascriptExecutor jse = (JavascriptExecutor)driver;
        jse.executeScript("scroll(0,5000)");

        //WebElement quickTools = driver.findElement(By.xpath("//*[text()='Quick Tools']"));
        //actions.moveToElement(quickTools).perform();



        //click on continue
        Thread.sleep(1500);
        WebElement continueBtn = driver.findElement(By.xpath("//*[@id='submitBtn']"));
        actions.moveToElement(continueBtn).click().perform();

        //capture error
        //store and print
        //close and switch tab re-navigate
        //driver quit
        //driver.quit();








    }//end of main method











}//end of java class
