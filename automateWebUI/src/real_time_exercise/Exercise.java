package real_time_exercise;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Exercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.ebay.com/");
		
		// count the Link on the entire page 
		
		System.out.println("Counting the link on the ebay page");
		
		 System.out.println(driver.findElements(By.tagName("a")).size());
		 
		 // count of link on the footer section of page
		 
		WebElement footer= driver.findElement(By.xpath(".//*[@id='footerFragment']"));
		System.out.println("Anchor element on the footer");
		System.out.println(footer.findElements(By.tagName("a")).size());
		
		// counting  2nd row anchor element on the footer section
		WebElement footerColn= driver.findElement(By.xpath(".//*[@id='gf-BIG']/table/tbody/tr/td[2]/ul"));
		System.out.println("Counting 2nd row anchor element of footer");
		System.out.println( footerColn.findElements(By.tagName("a")).size());
		
		String beforeClick = null;
		String afterClick;
		
		for(int i=0; i<footerColn.findElements(By.tagName("a")).size();i++)
		{
			System.out.println(footerColn.findElements(By.tagName("a")).get(i).getText());
			
			// If contain Site map on the footer click on the Site map
			
			if(footerColn.findElements(By.tagName("a")).get(i).getText().contains("Site map"))
			{
				
				beforeClick= driver.getTitle();
				System.out.println("This is the title of the page" + " :"+ driver.getTitle());
				footerColn.findElements(By.tagName("a")).get(i).click();
				break;
			}
		}
		
		afterClick= driver.getTitle();
		System.out.println("This is the title of the page" + " :"+ driver.getTitle());
		
		    if(beforeClick !=  afterClick)
		     {
		    	
		    	if (driver.getPageSource().contains("Sitemap"))
			     System.out.println("PASS");
		     }
		    else{
		    	System.out.println("FAIL");
		    }
	}

}
