import okio.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver","C:\\Selenium_Drivers\\ChromeDriver_win32\\ChromeDriver.exe");

        WebDriver driver = new ChromeDriver();

        driver.get("http://formy-project.herokuapp.com/dragdrop");
        driver.manage().window().maximize();

        WebElement source = driver.findElement(By.id("image"));

        WebElement destination = driver.findElement(By.id("box"));

        Actions actions = new Actions(driver);
        actions.dragAndDrop(source, destination).build().perform();


    }

}
