import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity2 {
    public static void main(String[] args) {
        // Set path to geckodriver if needed
        // System.setProperty("webdriver.gecko.driver", "/path/to/geckodriver");
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/login-form/");
        String pageTitle = driver.getTitle();
        System.out.println("Page Title: " + pageTitle);
        driver.findElement(By.id("username")).sendKeys("admin");
        driver.findElement(By.id("password")).sendKeys("password");
        driver.findElement(By.xpath("//button[text()='Submit']")).click();
        System.out.println(driver.findElement(By.tagName("h2")).getText());
      driver.quit();
    }
}