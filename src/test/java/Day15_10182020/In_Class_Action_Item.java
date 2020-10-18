package Day15_10182020;

import Reusable_Library.Reusable_Methods;
import Reusable_Library.Reusable_Methods_Loggers;
import com.relevantcodes.extentreports.LogStatus;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.IResultMap;
import org.testng.annotations.Test;

import java.util.List;

public class In_Class_Action_Item {






    //click on search

    //scroll down the page

    //capture search result

    //scroll up click on image link

    //display count of all images

    //click on sign in

    //verify using boolean

    //enter invalid username

    //click on next

    //capture error message


    @Test
    public void verifications() throws InterruptedException {

        WebDriver driver = Reusable_Methods.getDriver();


        //navigate to yahoo.com
        driver.navigate().to("https://www.yahoo.com");
        Thread.sleep(2000);

        WebElement title = driver.findElement(By.tagName("title"));
        System.out.println(title.getText());

        //get the count of all links in yahoo home page
        List<WebElement> linkCount = driver.findElements(By.xpath("//*[@class='_yb_e0gik']"));
        //print out the link count
        System.out.println("Link count is " + linkCount.size());

        //enter 'nutrition' on search bar
        Reusable_Methods_Loggers.sendKeys(driver,"//*[@name='p']","Nutrition",logger,"Search Field");
        Reusable_Methods_Loggers.submit(driver,"//*[@name='p']",logger,"Search Button");
        Thread.sleep(2000);




        //click on Sign in Button
        Reusable_Methods.click(driver, "//*[@class='_yb_687jt']", "Sign In Button");
        Thread.sleep(2500);
        boolean checkboxState = driver.findElement(By.xpath("//*[@id='persistent']")).isSelected();

        //expecting the checkbox to be selected
        if (checkboxState == true) {
            System.out.println("Checkbox is selected as expected");
        } else {
            System.out.println("Checkbox is not selected by default");
        }//end of if else

    }//end of method





}//end of java class

