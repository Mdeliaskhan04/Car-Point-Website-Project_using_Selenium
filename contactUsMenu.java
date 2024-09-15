package CarPoint;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class contactUsMenu {
    public static void main(String[] args) {
        WebDriverManager.firefoxdriver().clearDriverCache().setup();
        WebDriver driver=new FirefoxDriver();
        driver.manage().window().maximize();
        driver.get("https://car-point-8c5e4.web.app/");
       WebElement ContactUs= driver.findElement(By.linkText("Contact Us"));
       ContactUs.click();
       driver.navigate().refresh();
       driver.navigate().back();
       driver.navigate().forward();

    }
}
