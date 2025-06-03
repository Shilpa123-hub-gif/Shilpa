import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Activity11 {
    public static void main(String[] args) {
        
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/dynamic-controls");
        System.out.println("Page title: " + driver.getTitle());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement toggleButton = driver.findElement(By.xpath("//button[text()='Toggle Checkbox']"));
        toggleButton.click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.id("checkbox")));
        boolean checkboxExists = driver.findElements(By.id("checkbox")).size() > 0;
        System.out.println("Checkbox is displayed after hiding: " + checkboxExists);
        toggleButton.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("checkbox")));
        WebElement checkbox = driver.findElement(By.id("checkbox"));
        checkbox.click();
        System.out.println("Checkbox is selected: " + checkbox.isSelected());

     
        driver.quit();
    }
}
