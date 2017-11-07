package automateWebUI;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RadioButtons {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
System.setProperty("webdriver.chrome.driver", "C:\\Users\\Srius and Srimon\\Desktop\\seleniumjar\\chromeDriver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
        driver.get("http://www.echoecho.com/htmlforms10.htm");
       // driver.findElement(By.xpath("//input[@value='Butter']")).click();
       System.out.println("Total Count of radio button on Group1 is:" + (driver.findElements(By.xpath("//input[@name='group1']")).size()));
       
       int count= driver.findElements(By.xpath("//input[@name='group1']")).size();// creating count variable to get the count of the radio button
       
       // using loop for the to use single radio button using .get(index)
       for (int i =0; i<count;i++)
       {
    	// driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
    	   System.out.println( driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value"));
    	   
    	   // creating string value on the radio button. can compare to string value of radio button and make a selection
    	   String  radioButton =driver.findElements(By.xpath("//input[@name='group1']")).get(i).getAttribute("value");
    	   	
    	   	if (radioButton.equals("Cheese"))
    	   			{
    	   		driver.findElements(By.xpath("//input[@name='group1']")).get(i).click();
    	   			}
       }
	}

}
