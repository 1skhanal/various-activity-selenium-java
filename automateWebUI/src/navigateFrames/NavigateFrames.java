package navigateFrames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.BrowserType;

public class NavigateFrames {

	public static void main(String[] args) {
		
		ChromeOptions options= new ChromeOptions();
		options.setBinary("C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\chromeDriver\\chromedriver.exe");
		
		//System.setProperty("webdriver.chrome.driver",
				//"C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\chromeDriver\\chromedriver.exe");
		ChromeDriver browser = new ChromeDriver(options);
		
		//WebDriver driver= new ChromeDriver();
		browser.manage().window().maximize();
		
		browser.get("http://www.google.com/");
		
		
		
		
		
				
	

	}
	
	
	/*writing utility to handle frames

	   public void switchtoFrame(BrowserType browser)
	   {
		   
		   int frameCount= ((By) browser).findElements(By.tagName("iframe")).size();
		   
		   for(int i=0; i<frameCount; i++)
		   {
		   
		   driver.switchTo().frame(i);
		   System.out.println(i);
		   
	   }
	   }*/
}

