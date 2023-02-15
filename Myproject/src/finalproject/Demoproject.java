package finalproject;

import java.sql.Driver;
import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class Demoproject {

	private static final String String = null;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shradha\\Downloads\\chromedriver_win32.zip\\chromedrive.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.saucedemo.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));  //pageload timeout
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String str=driver.getTitle();
		System.out.println("The title of the page is:"+str);
		//driver.navigate().to("https://www.google.com");
		String str1= driver.getCurrentUrl();
		System.out.println("The current url of the page is:"+str);
		driver.navigate().to("https://www.google.com");
		driver.navigate().forward();
		driver.navigate().back();
		driver.navigate().refresh();
		
		//Find User name
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		
		//Set Password
		WebElement epass=driver.findElement(By.id("password"));
		boolean status=epass.isDisplayed();
		if(status)
		{
			epass.sendKeys("secret_sauce");
		}
		WebElement btn=driver.findElement(By.name("login-button"));
		boolean status1=btn.isEnabled();
		if(status1)
		{
			btn.click();
		}
		
		//AddtoCart
		driver.findElement(By.linkText("Sauce Labs Backpack")).click();
		WebElement btn1=driver.findElement(By.name("add-to-cart-sauce-labs-backpack"));
		boolean status2=btn1.isEnabled();
		if(status2)
		{
			btn1.click();
		}
		driver.switchTo().window(str);
		Set <String> s = driver.getWindowHandles();
		ArrayList ar = new ArrayList(s);
		System.out.println();ar.get(0);
		
		}
	
	
	
}
			
		
			
		
	

