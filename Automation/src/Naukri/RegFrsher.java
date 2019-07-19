package Naukri;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class RegFrsher {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Navaneetha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@value='Register with us']")).click();
	    driver.findElement(By.xpath(".//*[@value='fresher']")).click();
	    driver.findElement(By.xpath("//input[@id='fname']")).sendKeys("Navaneetha");
	    driver.findElement(By.xpath("//input[@id='email']")).sendKeys("navaneetha.c786@gmail.com");
	    driver.findElement(By.xpath("//input[@placeholder='Where recruiter can contact you'] ")).sendKeys("7026683368");
	    driver.findElement(By.xpath("//input[@placeholder='Minimum 6 characters']")).sendKeys("navaneetha");
		driver.findElement(By.xpath(".//*[@name='city']")).sendKeys("Chennai",Keys.DOWN,Keys.ENTER);
		

	}

}
