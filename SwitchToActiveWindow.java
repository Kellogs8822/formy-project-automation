import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import javax.swing.text.html.FormSubmitEvent;
import java.sql.Driver;

public class SwitchToActiveWindow {
    public static void main(String[] args) throws InterruptedException {

	System.setProperty("webdriver.chrome.driver","C:\\Selenium_Drivers\\ChromeDriver_win32\\ChromeDriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/switch-window");
        driver.manage().window().maximize();

       WebElement newTabButton = driver.findElement(By.id("new-tab-button"));
       newTabButton.click();

        String originalHandle = driver.getWindowHandle();

        for (String handle1: driver.getWindowHandles()){
            driver.switchTo().window(handle1);
        }

       driver.switchTo().window(originalHandle);
    }
}
