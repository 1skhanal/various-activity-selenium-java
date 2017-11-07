package actions;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class handlingAjax {

	public static void main(String[] args) throws InterruptedException {
		
         System.setProperty("webdriver.gecko.driver",
		"C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\firefoxdriver\\geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("http://www.amazon.in/");
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		
		// starting action method. Implementing driver  on parameter helps to work as driver class as well.
		Actions action= new Actions(driver);
		WebElement signinElement=driver.findElement(By.xpath(".//*[@id('nav-link-yourAccount')]"));
        action.moveToElement(signinElement).build().perform();
        signinElement.click();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        
        
        //Captial Letters output  in the search box
        
        WebElement space = driver.findElement(By.xpath(".//*[@id=('twotabsearchtextbox')]"));
        space.sendKeys("check");
       // action.keyDown(Keys.SHIFT).moveToElement(space).sendKeys("saaree").build().perform();
       // action.contextClick(space).build().perform();
        
	}

}
