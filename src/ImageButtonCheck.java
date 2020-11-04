import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

public class ImageButtonCheck {

    @Test
    void testNGCheck() {
        System.setProperty("webdriver.chrome.driver", "S:\\chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://thedemosite.co.uk/");
        String actualTitle = "FREE example PHP code and online MySQL database - example username password protected site";
        //title on the site
        Assert.assertEquals(driver.getTitle(), actualTitle);
        WebElement logo=driver.findElement(By.xpath("/html/body/div/center/table/tbody/tr[2]/td/div/center/table/tbody/tr/td[1]/font/big/strong"));

        if(!logo.isDisplayed()){
            System.out.println("Logo is not displayed");
        }
        else {
            System.out.println("Logo is displayed");
        }
        driver.quit();




    }
}


