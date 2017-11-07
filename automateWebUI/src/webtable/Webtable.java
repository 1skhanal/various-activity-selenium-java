package webtable;

import java.io.File;
import java.io.IOException;
import java.io.ObjectOutput;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.junit.rules.Timeout;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Webtable {
	
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\chromeDriver\\chromedriver.exe");
				
				WebDriver driver = new ChromeDriver();
				driver.manage().window().maximize();
				driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				driver.manage().deleteAllCookies();
				
				driver.get("http://www.espncricinfo.com/new-zealand-v-south-africa-2016-17/engine/match/1020033.html");
				
			/*	// capturing Screen shot of the display page
				
				File srcFile= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
				
				try {
					FileUtils.copyFile(srcFile, new File("C:\\Users\\Srius and Srimon\\Desktop\\screenshot.png"));
				} catch (IOException e) {
					
					e.printStackTrace();
				}*/
				
				/*-----------------------------------------------------------------------------------------------------------------
				---------------------------------------------------------------------------------------------------------------*/
				
				WebElement table = driver.findElement(By.id("full-scorecard"));
				
				// finding the row in the table
			 List<WebElement> number_of_Rows=table.findElements(By.tagName("tr"));
			 System.out.println("total number of rows"+number_of_Rows.size());
			 
			 
			 // ---------------------finding column count in each row-----------------------------------------
			  int i=0;
			 for(WebElement eachrow:number_of_Rows)
			 {
				 
				 List<WebElement>eachcoloumn=eachrow.findElements(By.tagName("td"));
				 i++;
				 System.out.println("No ofColoumns in "+ i + "th row are:"+eachcoloumn.size());
			 }
	}

}
