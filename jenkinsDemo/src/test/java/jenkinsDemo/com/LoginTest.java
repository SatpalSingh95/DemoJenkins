package jenkinsDemo.com;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest {

@Test
public void openGoogle() {

WebDriver driver = new ChromeDriver();

driver.get("https://www.google.com");

String title = driver.getTitle();

System.out.println("Page Title: " + title);

driver.quit();

}

}