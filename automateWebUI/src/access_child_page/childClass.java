package access_child_page;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class childClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", 
		"C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://accounts.google.com/SignUp");
		driver.findElement(By.linkText("Learn more")).click();  // clicking to the learn more text on google sign in page
		System.out.println("Before switching to child page");
		System.out.println(driver.getTitle());                  // get the title of the page
		Set<String>ids=driver.getWindowHandles();              // setting the string to get windows handles ( tab Handle)
		Iterator <String>it=ids.iterator();   
		//  Using Iterator  as string to extract the parent page 
		 String parentId=it.next();                            
		// Second iteration to child page 
		 String childID=it.next();
		 driver.switchTo().window(childID);  // using switch command  to go to window(passing the parameter of the child iteration page
		 System.out.println("Displaying  child page title");
		 System.out.println(driver.getTitle());  // printing the title of the child window on the console
		 
		 driver.switchTo().window(parentId);
		 System.out.println("Switching from  child page to Parent Page");
		 System.out.println(driver.getTitle());
		 
		 

	}

}
