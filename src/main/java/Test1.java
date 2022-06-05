
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test1 {
    public static void main(String[] args) {
        Boolean success = false;

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));


        try {
            String startAddress = "https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin";

            driver.get(startAddress);
            Thread.sleep(2000);

            WebElement input = driver.findElement(By.xpath("//input[@type='email']"));
            input.sendKeys("imiafamilia51485@gmail.com", Keys.ENTER);

            Thread.sleep(2000);

            WebElement passwordInput = driver.findElement(By.xpath("//input[@type='password']"));
            passwordInput.sendKeys("12345678If", Keys.ENTER);

            wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath("//input[@type='password']")));

            System.out.println(driver.getCurrentUrl());

            success = true;
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            if (success) {
                System.out.println("Test 1 success.");
            }
            driver.quit();
        }
    }
}
