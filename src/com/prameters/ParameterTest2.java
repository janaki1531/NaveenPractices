package com.prameters;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class ParameterTest2 {
	public WebDriver driver;
	public static String sheetName = "Sheet1";
	@BeforeMethod
	@Parameters({"browser","url"})
	public void setup(String browser,String url) throws Throwable {
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
	
	
	//C:\Users\shiva\Desktop\Data.xlsx
	
	
//		@Test
//	@Parameters({"url"})
	
//	public void emailtest(String url) throws Throwable {
//	
//			driver.get(url);
//		driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
//		driver.manage().window().maximize();
//	    driver.findElement(By.xpath("//input[@type='email']")).click();
//	    
//		}
//		

	
		@DataProvider(name="janaki")
		public Object[][] excelReading(){
			
			return  ExcelFileReading1.excelReading(sheetName);
				
			}
 
			
		@Test(dataProvider="janaki")
				//,dependsOnMethods="emailtest")
	 
	 //   @Parameters({"email"})
	    
	    public void username(String userName,String password) throws Throwable {
			
		//  	 System.out.println(userName);
		//  	System.out.println(password);
		  	 
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys(userName);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		Thread.sleep(2000);
		//}
	    
		//@Test(dependsOnMethods="username")
	//	@Parameters({"password"})
		//public void password(String password) throws InterruptedException {
		//	Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
		driver.findElement(By.xpath("//span[contains(text(),'Next')]")).click();
		
	}
		@Test
		public void compose() {
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			driver.findElement(By.xpath("//div[@class='T-I J-J5-Ji T-I-KE L3']")).click();
		}
		

		@AfterTest
		public void teardown() {
			
			driver.close();
		}
}
