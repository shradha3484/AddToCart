package finalproject;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AddToCart {

	


	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shradha\\Downloads\\chromedriver_win32.zip\\chromedrive.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		
		
		//To maximize the window
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.manage().deleteAllCookies();
		
		//To find the Element and pass the Key
		driver.findElement(By.xpath("//*[@id=\"twotabsearchtextbox\"]")).sendKeys("samsung galaxy s22");
		driver.findElement(By.xpath("//*[@id=\"nav-search-submit-button\"]")).click();
		driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[4]/div/div/div/div/div/div[2]/div/div/div[1]/h2/a/span")).click();
		
		//To get the Quantity
		WebElement quantity = driver.findElement(By.xpath("//*[@id=\"quantity\"]"));
		Select se = new Select(quantity);
		se.selectByIndex(2);
		
		// Another method of get the quantity
		//se.selectByValue("3");
		//se.selectByVisibleText("Two");
		
		Thread.sleep(1000);
		driver.findElement(By.xpath("//*[@id=\"add-to-cart-button\"]")).click();
	}

}
