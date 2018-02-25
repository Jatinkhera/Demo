package signup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FB_login {
public static void main(String[] args) throws InterruptedException {
	
	System.setProperty("webdriver.chrome.driver", ".//chromedriver.exe");
	ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com");
		System.out.println("Title of the page "+ driver.getTitle());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	
		WebElement user = driver.findElement(By.id("email"));
		user.sendKeys("smart_guy3739@yahoo.com");
		
		WebElement psswrd = driver.findElement(By.id("pass"));
		psswrd.sendKeys("Decent@12345?");
		
		WebElement login = driver.findElement(By.xpath("//label/input"));
		login.click();
		
		Thread.sleep(5000);
		System.out.println("After login title is = " + driver.getTitle());
		/*WebElement login = driver.findElement(By.id("u_0_5"));
		login.click();
	
		WebElement search = driver.findElement(By.name("q"));
		search.sendKeys("www.facebook.com/jatin.khera1");
		
		Thread.sleep(5000);
		Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();
		//ac.keyDown(Keys.CONTROL).click().keyUp(Keys.CONTROL).build().perform();
*/

		WebElement usrnavigation = driver.findElement(By.id("userNavigationLabel"));
		/*Actions ac = new Actions(driver);
		ac.sendKeys(Keys.ENTER).perform();
		*/
		
		usrnavigation.click();
		//Thread.sleep(2000);
		
		WebElement logout = driver.findElement(By.xpath("//li[12]/a/span/span"));
		logout.click();
		
}
	

}
