import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Activity10 {
    public static void main(String[] args) {
        WebDriver driver = new FirefoxDriver();
        driver.get("https://training-support.net/webelements/drag-drop");
        System.out.println("Page title: " + driver.getTitle());

        WebElement football = driver.findElement(By.id("ball"));
        WebElement drop1 = driver.findElement(By.id("dropzone1"));
        WebElement drop2 = driver.findElement(By.id("dropzone2"));

        Actions action = new Actions(driver);
        action.dragAndDrop(football, drop1).perform();

        String zone1Text = drop1.findElement(By.className("dropzone-text")).getText();
        if(zone1Text.equals("Dropped!")) {
            System.out.println("Ball was dropped in Dropzone 1");
        }

        action.dragAndDrop(football, drop2).perform();

        String zone2Text = drop2.findElement(By.className("dropzone-text")).getText();
        if(zone2Text.equals("Dropped!")) {
            System.out.println("Ball was dropped in Dropzone 2");
        }

        driver.quit(); // Firefox window remains open
    }
}