package Amazon;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Registration {

	public static void main(String[] args) throws InterruptedException
	{
		System.setProperty("webdriver.gecko.driver","F:\\Selenium\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("file:///C:/Users/Nanee/Downloads/elements.html");
		driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("Navaneetha");
		driver.findElement(By.xpath("//input[@name='user_email']")).sendKeys("navaneetha.c786@gmail.com");
		driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("Navaneetha");
		driver.findElement(By.xpath("//label[text()='Under 13']")).click();

		driver.findElement(By.xpath("//textarea[@name='user_bio']")).sendKeys("I am Navaneetha");

		WebElement drop=driver.findElement(By.xpath("//select[@name='user_job']"));
		Select select=new Select(drop);
		Thread.sleep(5000);
		select.selectByVisibleText("Python Developer");
		
		driver.findElement(By.xpath("//label[text()='Development']")).click();
		driver.findElement(By.xpath("//button[text()='Sign Up']")).click();
		Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.findElement(By.linkText("Index")).click();
		System.out.println("New page success");
		
		
		

	}

}
