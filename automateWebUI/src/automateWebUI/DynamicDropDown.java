package automateWebUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DynamicDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize(); // maximazing the windows
		driver. get ("http://spicejet.com/");
		
		driver.findElement(By.xpath("id('ctl00_mainContent_ddl_originStation1_CTXT')")).click();
		driver.findElement(By.xpath("//a[@value ='GOI']")).click();
		
		// if you want to access any method in class, create object for that class and access using object.method
		
		/*Select dropdown= new Select(driver.findElement(By.xpath("id('ctl00_mainContent_ddl_Adult')")));
		dropdown.selectByIndex(4);
		dropdown.selectByVisibleText("9 Adults");
		dropdown.deselectByIndex(4);
		dropdown.deselectByVisibleText("9 Adults");*/
		
		
		//Selecting the check box and verifying check box being selected or not
		System.out.println(driver.findElement(By.xpath("id('ctl00_mainContent_chk_IndArm')")).isSelected());
		// before clicking on check box
		driver.findElement(By.xpath(".//*[@id='ctl00_mainContent_chk_IndArm']")).click(); // click the check box
	    
		//driver.findElement(By.xpath("id('ctl00_mainContent_chk_IndArm')")).isSelected();
		// after clicking on check box
		//System.out.println(driver.findElement(By.xpath("id('ctl00_mainContent_chk_IndArm')")).isSelected());
		
		
	}

}
