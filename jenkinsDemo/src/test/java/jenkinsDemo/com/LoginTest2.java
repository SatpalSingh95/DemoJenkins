package jenkinsDemo.com;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class LoginTest2 {
	@Test
	public void openInstagram() {

	WebDriver driver = new ChromeDriver();

	driver.get("https://www.instagram.com/?hl=en");

	String title = driver.getTitle();

	System.out.println("Page Title: " + title);

	driver.quit();

	}
}
