
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Test2 {
    public static void main(String[] args) {
        Boolean success = false;

        System.setProperty("webdriver.chrome.driver", "C:\\WebDriver\\bin\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        try {
            driver.get("https://accounts.google.com/signin/v2/identifier?continue=https%3A%2F%2Fmail.google.com%2Fmail%2F&service=mail&sacu=1&rip=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin");
            Thread.sleep(2000);

            WebElement input = driver.findElement(By.xpath("//input[@type='email']"));
            input.sendKeys("gfhhghsjhfhjdhfjhfdjdh@gmail.com", Keys.ENTER);

            Thread.sleep(2000);

            String invalid = input.getAttribute("aria-invalid");

            if (invalid.equals("true")) {
                System.out.println("Input invalid!"); // success
                success = true;
            } else {
                // error
                throw new Exception("Input not invalid!");
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (Exception e) {
            throw new RuntimeException(e);
        } finally {
            if (success) {
                System.out.println("Test 2 success.");
            }
            driver.quit();
        }
    }
}
