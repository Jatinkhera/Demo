package utils;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class ScreenShots {
	/*public static void take_screenshot(String path, ChromeDriver driver) throws IOException{
	   File f=driver.getScreenshotAs(OutputType.FILE);
				FileUtils.copyFile(f, new File(path));
	}*/

	public static void take_screenshot(WebDriver driver, String path) throws IOException{
		
		//Convert web driver object to TakeScreenshot  
	//	TakesScreenshot scrShot = ((TakesScreenshot)driver);
		
		 //Call getScreenshotAs method to create image file
		File f=((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File(path));
}
}