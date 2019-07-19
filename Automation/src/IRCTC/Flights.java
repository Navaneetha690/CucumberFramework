package IRCTC;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Flights
{
	public static void main(String[] args) throws InterruptedException 
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Navaneetha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.irctc.co.in");
		driver.manage().window().maximize();
		Thread.sleep(10000);
		
		driver.findElement(By.linkText("FLIGHTS")).click();
		
		String flight=driver.getWindowHandle();
		
		Set<String> fwindows=driver.getWindowHandles();
		for(String child : fwindows)
		{
			if(!child.contains(flight))
			{
				driver.switchTo().window(child);
			}
		}
	
		driver.findElement(By.xpath("//input[@placeholder='From']")).sendKeys("Bengaluru");
	
				
			
		
		

		
	}
}


