package utilities;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;

public class LaunchPage {
	public WebDriver driver;

	@BeforeTest
	public void InitializeBrowser() {
		switch (Constants.browser_name) {
		case "chrome":
			System.setProperty("webdriver.chrome.driver", Constants.Chrome_Path);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		case "ie":
			System.setProperty("webdriver.ieserver.driver", Constants.Ie_Path);
			driver = new InternetExplorerDriver();
			driver.manage().window().maximize();
			break;
		default:
			System.setProperty("webdriver.chrome.driver", Constants.Chrome_Path);
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			break;

		}
	}

	@AfterClass
	public void closeApp() {
		if (driver != null) {

			driver.quit();
		}

	}

	@BeforeClass
	public void launchApp() {

		driver.get(Constants.URL);

	}

}
