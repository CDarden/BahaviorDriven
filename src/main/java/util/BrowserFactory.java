package util;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserFactory {

static WebDriver driver;
	
	public static WebDriver startBrowser() {
		System.setProperty("webdriver.chrome.driver", "updated Chrome Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("http://www.techfios.com/billing/?ng=admin/");
		return driver;
		
	}
	
	public static void tearDown() {
		driver.close();
		driver.quit();

	
	
	}
	
}
