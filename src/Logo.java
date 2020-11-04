import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import java.util.List;

public class Logo {

    @Test
    void testNGCheck() {
        System.setProperty("webdriver.chrome.driver", "S://chromedriver.exe");
        ChromeDriver driver = new ChromeDriver();
        driver.get("http://thedemosite.co.uk/");
        List<WebElement> image = driver.findElements(By.tagName("img"));
        System.out.println(" Images: " +image.size());
        List<WebElement> buttons = driver.findElements(By.tagName("button"));
        System.out.println("Button : " + buttons.size());

    }
}

