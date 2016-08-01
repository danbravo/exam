package questions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import java.util.Set;

/**
 * Created by DAN on 01.08.2016.
 */
public class Q27 {

    @Test
    public void windowTest() {
        WebDriver driver = new ChromeDriver();
        driver.get("http://pornhub.com/");
        String mainWin = driver.getWindowHandle();
        driver.findElement(By.cssSelector("button.movie")).click();
        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.numberOfWindowsToBe(2));
        Set<String> windowHandles = driver.getWindowHandles();

        windowHandles.stream().filter(w -> !w.equals(mainWin)).forEach(w -> driver.switchTo().window(w));

    }
}
