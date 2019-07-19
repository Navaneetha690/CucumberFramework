package Naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelector {

	public static void main(String[] args)
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Navaneetha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
		driver.findElement(By.xpath("//input[@value='Register with us']")).click();
		driver.findElement(By.xpath("//button[text()='I am a Professional']")).click();
		driver.findElement(By.cssSelector("#fname")).sendKeys("Navaneetha");
		driver.findElement(By.cssSelector("input[id='email']")).sendKeys("navaneetha.chittepu@gmail.com");
		driver.findElement(By.cssSelector("input[name='password']")).sendKeys("Nani_c246");
		/*String str=driver.findElement(By.cssSelector("input[name='password']")).getAttribute("placeholder");
		System.out.println(str);*/
	}

}
