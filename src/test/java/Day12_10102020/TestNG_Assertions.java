package Day12_10102020;

import Reusable_Library.Reusable_Methods;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;


public class TestNG_Assertions {

@Test
    public void assertions() throws InterruptedException {

        WebDriver driver = Reusable_Methods.getDriver();

        driver.navigate().to("https://www.google.com");
        Thread.sleep(2000);

        //verify the google title using Hard assert
        //Assert.assertEquals("GOOGLE",driver.getTitle());

        //verify the google title using soft assertion
        SoftAssert sassert = new SoftAssert();
        sassert.assertEquals(driver.getTitle(),"GOOGLE");


        //enter keyword on search
        Reusable_Methods.sendKeys(driver,"//*[@name='q']", "cars", "Search Field");

        sassert.assertAll();


    }//end of test




}//end of java class
