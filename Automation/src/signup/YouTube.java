package signup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class YouTube {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
	driver.get("https://www.youtube.com");
	System.out.println("Title of the page " + driver.getTitle());
	driver.manage().window().maximize();
	//driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);	
	WebElement login = driver.findElement(By.xpath("//yt-formatted-string"));
	WebDriverWait ws = new WebDriverWait(driver, 10);
	ws.until(ExpectedConditions.elementToBeClickable(login));
	login.click();
	
	/*WebElement login = driver.findElement(By.xpath("//yt-formatted-string"));
	login.click();
	*/
	WebElement email = driver.findElement(By.cssSelector("input[type='email']"));
	email.sendKeys("khera.jatin09@gmail.com");
	
	Actions ac=new Actions(driver);
	ac.sendKeys(Keys.TAB).sendKeys(Keys.TAB).build().perform();
	ac.sendKeys(Keys.ENTER).perform();
	Thread.sleep(2000);
	WebElement psswrd = //driver.findElement(By.xpath("//input[@class='whsOnd zHQkBf']"));
			driver.findElement(By.cssSelector("input[type='password']"));
	psswrd.sendKeys("Nitaj@524626");
	
	/*WebElement password = driver.findElement(By.xpath(input[contains(@name ,"password")]));
	password.sendKeys("Nitaj@524626");
	*/
	Thread.sleep(2000);
	WebElement next = driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));
	  next.click();
	/*ac.sendKeys(Keys.TAB).perform();
	ac.sendKeys(Keys.ENTER).perform();
	*/
	  Thread.sleep(2000);
	  WebElement trend = driver.findElement(By.xpath("//a[@id='endpoint']/span)[3]"));
		trend.click();
	  
	  
	  
	  
}
}
