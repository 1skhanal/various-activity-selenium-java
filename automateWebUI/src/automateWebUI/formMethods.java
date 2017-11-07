package automateWebUI;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class formMethods {

	public static void main(String[] args) {
		
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bbc.com/");
		/*Alert alert = driver.switchTo().alert();
		String alertmessage = alert.getText();
		System.out.println(alertmessage);
		alert.dismiss();*/
		
	}

}
 