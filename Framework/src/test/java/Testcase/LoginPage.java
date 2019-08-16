package Testcase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import utilities.*;

public class LoginPage extends LaunchPage {
	@Test
	public void loginApp() {

		WebElement username = driver.findElement(By.xpath("//*[@type='text']"));
		username.sendKeys("Suganya1493");
		WebElement password = driver.findElement(By.xpath("//*[@type='password']"));
		password.sendKeys("ss12345");
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
		login.click();

	}
}
