package signup;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utils.ScreenShots;

public class FriendRequest {
	
	public static ChromeDriver driver;
	
	@BeforeClass
	public static void lauchBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Jar files\\Exe_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	@Before
	public void login(){
		//WebElement em = driver.findElement(By.cssSelector("input#email"));    //tagname with id value (tagname#idvalue)
		WebElement em = driver.findElement(By.id("email"));
		em.sendKeys("smart_guy3739@yahoo.com");
		
		//WebElement ps = driver.findElement(By.cssSelector("input#pass"));   //tagname with id value (tagname#idvalue)
		WebElement ps = driver.findElement(By.name("pass"));
		ps.sendKeys("Decent@12345?");
		
		WebElement lg = driver.findElement(By.cssSelector("input[type='submit']"));   //tagname with id value (tagname#idvalue)
		lg.click();
	}

	@Test
	public void frequest() throws IOException{
		WebElement search = driver.findElement(By.id("fbInspectButton"));
		search.click();
		
		ScreenShots.take_screenshot(driver, "‪D:\\screenshots\\screenshot1.png");
	}
	
	
}
