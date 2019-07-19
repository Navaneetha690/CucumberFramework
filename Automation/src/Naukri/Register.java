package Naukri;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Register {

	public static void main(String[] args) throws InterruptedException, AWTException
	{
		System.setProperty("webdriver.chrome.driver","F:\\Selenium\\Navaneetha\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.get("https://www.naukri.com/");
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@value='Register with us']")).click();
	    driver.findElement(By.xpath("//button[text()='I am a Professional']")).click();
	    driver.findElement(By.xpath("//input[@name='uploadCV']")).click();
	    Robot robot=new Robot();
	    StringSelection ss=new StringSelection("F:\\Selenium\\Test_Engineer-3+YearsExp");
	    Toolkit.getDefaultToolkit().getSystemClipboard().setContents(ss, null);
	    robot.keyPress(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_V);
	    robot.keyRelease(KeyEvent.VK_CONTROL);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	    System.out.println("Resume Uploadd successfully");
	    
	}

}
