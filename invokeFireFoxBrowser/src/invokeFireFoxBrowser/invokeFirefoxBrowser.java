package invokeFireFoxBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class invokeFirefoxBrowser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\firefoxdriver\\geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("http:\\cnn.com");
		driver.quit();
		 System.out.println("browser is close");

	}
}