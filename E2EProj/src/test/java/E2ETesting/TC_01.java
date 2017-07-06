package E2ETesting;

import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

public class TC_01 {
	
	@Test
	public void TC_01()
	{
		System.setProperty("webdriver.chrome.driver", "./Driver/chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		//System.setProperty("webdriver.gecko.driver", "./Driver/geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		driver.get("https://accounts.google.com/SignUp?hl=en-GB");
		driver.findElement(By.xpath(".//*[@id='wrapper']/div[2]/div/div[1]/p/a")).click();
		//System.out.println(driver.getTitle());
		Set<String> multiplewindows = driver.getWindowHandles();
		Iterator<String> itr = multiplewindows.iterator();
		String parent = itr.next();
		System.out.println(driver.getTitle());
		String child = itr.next();
	    driver.switchTo().window(child);
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		System.out.println(driver.getTitle());
		
		 
		
		
		
	
		
		
	}

}
