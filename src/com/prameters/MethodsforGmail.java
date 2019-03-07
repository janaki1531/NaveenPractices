package com.prameters;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class MethodsforGmail {
	public static WebDriver driver;
	
	public static void  setup(String browser,String url) throws Throwable {
		if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("Webdriver.chrome.driver", "C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\NaveenPractices\\chromedriver.exe");
		 driver=new ChromeDriver();
		}
		else if(browser.equalsIgnoreCase("firefox")) {
			System.setProperty("Webdriver.gecko.driver","C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\NaveenPractices\\geckodriver.exe");
			driver=new FirefoxDriver();
		}
		else if(browser.equalsIgnoreCase("IE")){
				System.setProperty("WebDriver.ImeHandler.driver","C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\NaveenPractices\\IEDriverServer.exe");
	
		driver=new InternetExplorerDriver();
		}
		
		
		driver.get(url);
		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
		driver.manage().window().maximize();
	    driver.findElement(By.xpath("//input[@type='email']")).click();

	}
	
	public  static void usernameMethod(String userName,String password) throws Throwable {
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
	
		
	}
	public  static void compose() {
	
		
	WebElement compose=	driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']"));
			compose.click();
			
	
	
	}

	public static void teardown() {
		driver.quit();
	}
}
