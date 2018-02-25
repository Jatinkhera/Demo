package signup;

import java.util.concurrent.TimeUnit;

import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class GmailSignUp {
	
	public static ChromeDriver driver;
	
	@BeforeClass
	public static void launchBrowser(){
		System.setProperty("webdriver.chrome.driver", "D:\\Jar files\\Exe_Driver\\chromedriver.exe");
		driver = new ChromeDriver();
		//driver.get("https://www.google.com/gmail/about/");
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(1000, TimeUnit.SECONDS);
	}
	
	@Test
	public void signUp(){
		//WebElement ca = driver.findElement(By.xpath("//a[3]"));
		//ca.click();
		
		/*driver.findElement(By.cssSelector("body")).sendKeys(Keys.CONTROL +"t");
		driver.get("https://accounts.google.com/SignUp?service=mail&continue=https://mail.google.com/mail/?pc=topnav-about-en");
		*/
		WebElement fname = driver.findElement(By.id("FirstName"));
		fname.clear();
		fname.sendKeys("abc");
		
		WebElement lname = driver.findElement(By.id("LastName"));
		lname.sendKeys("xyz");
		
		WebElement email = driver.findElement(By.id("GmailAddress"));
		email.sendKeys("xyza9159@gmail.com");
		
		WebElement pass = driver.findElement(By.name("Passwd"));
		pass.sendKeys("Jatin12345?");
		
		WebElement cpass = driver.findElement(By.name("PasswdAgain"));
		cpass.sendKeys("Jatin12345?");
		
		/*WebElement month = driver.findElement(By.xpath("//div[@role='listbox']"));
		month.sendKeys("March");
		*/
		WebElement month = driver.findElement(By.xpath(".//*[@id='BirthMonth']/div[1]/div[2]"));
		month.click();
		
		WebElement mlist = driver.findElement(By.xpath(".//*[@id=':7']/div"));
		mlist.click(); 
		
		WebElement day = driver.findElement(By.id("BirthDay"));
		day.sendKeys("1");
		
		WebElement year = driver.findElement(By.id("BirthYear"));
		year.sendKeys("2000");
		
		WebElement sex = driver.findElement(By.xpath("//div[@aria-activedescendant=':d']"));
		sex.sendKeys("Male");
		
		WebElement mphone = driver.findElement(By.id("RecoveryPhoneNumber"));
		mphone.clear();
		mphone.sendKeys("+919876543210");
		
		WebElement curr_email = driver.findElement(By.id("RecoveryEmailAddress"));
		curr_email.sendKeys("xyza91599999@gmail.com");
		
		WebElement next = driver.findElement(By.id("submitbutton"));
		next.click();
		
		WebElement scroll = driver.findElement(By.id("tos-scroll-button"));
		scroll.click();
		JavascriptExecutor jse = (JavascriptExecutor) driver;
	    jse.executeScript("window.scrollBy(0,250)", "");
		
		//WebElement scroll1 = driver.findElement(By.id("tos-scroll-button"));
		//scroll1.click();
		//WebElement tc = driver.findElement(By.id("iagreebutton"));
		//tc.click();
	}

	
	
}
