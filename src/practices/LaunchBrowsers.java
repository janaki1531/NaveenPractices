package practices;

import java.io.File;
import java.io.FileInputStream;
import java.util.Iterator;
import java.util.Properties;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.GeckoDriverService;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LaunchBrowsers {
	public static  WebDriver driver;

	public static void main(String[] args) throws Throwable {

	
	openbrowser("chrome");
	navigateurl();

	}

public static void openbrowser(String browser) {
	if(browser.equalsIgnoreCase("chrome")) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\NaveenPractices\\chromedriver.exe");
	driver	=new ChromeDriver();
		System.out.println("Chromre browser is able to open");
	
	}
	else if(browser.equalsIgnoreCase("Firefox")) {
		System.setProperty("webdriver.gecko.driver","C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\NaveenPractices\\geckodriver.exe");
	driver=new FirefoxDriver();
	System.out.println("FireFox is able to open the browser");
	}else if(browser.equalsIgnoreCase("IE")){
		
		System.setProperty("webdriver.ie.driver","C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\NaveenPractices\\IEdriverServer.exe");
		driver=new InternetExplorerDriver();
		System.out.println("IE is able to open the browser");
	}else {
		System.out.println("InvalidBrowser");
	}
}
	
	public static void navigateurl() throws Throwable {
	/*//driver.get("https://www.spicejet.com/");
		driver.get("https://www.spicejet.com/");
	driver.manage().window().maximize();
	driver.manage().deleteAllCookies();
	driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
	
	try {
		Thread.sleep(3000);
	} catch (InterruptedException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	driver.findElement(By.id("highlight-addons")).click();
	
	Actions act=new Actions(driver);
	
	act.moveToElement(driver.findElement(By.linkText("Seat + Meal Combo"))).click();
	act.build().perform();
	
	driver.navigate().back();
	System.out.println(driver.getTitle());
	
	Thread.sleep(2000);
	
	String ele=driver.findElement(By.xpath("//label[@for='ctl00_mainContent_chk_Unmr']")).getText();
	
	System.out.println(ele);
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(ele));
	ele.click();
	
	
	driver.navigate().to("https://www.rediff.com/");
	
	driver.findElement(By.xpath("//a[@title='Already a user? Sign in']")).click();
	driver.findElement(By.name("proceed")).click();
	
	Alert alert=driver.switchTo().alert();
			alert.accept();
	
	driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("janaki");
	
	driver.findElement(By.xpath("//input[@id='password']")).sendKeys("Shiva22@sep");
	driver.findElement(By.name("proceed")).click();
	
	driver.navigate().to("https://html.com/input-type-file/");
	driver.manage().deleteAllCookies();
	driver.findElement(By.xpath("//input[@id='fileupload']")).sendKeys("C:\\Users\\shiva\\Desktop\\Assignment_Response_Janaki K.docx");
	Thread.sleep(2000);
	driver.findElement(By.xpath("//input[@value='submit']")).submit();
	
	*/

	
	/*driver.navigate().to("https://classic.crmpro.com/login.cfm");
	

	WebElement element=driver.findElement(By.className("span2"));
	
	WebDriverWait wait=new WebDriverWait(driver, 20);
	wait.until(ExpectedConditions.visibilityOf(element));
	element.sendKeys("janaki");
	
	driver.findElement(By.name("password")).sendKeys("Shiva22@sep");
	driver.findElement(By.xpath("//input[@value='Login']")).click();
	
	
	

	
	driver.switchTo().frame(driver.findElement(By.name("mainpanel")));
	
	WebElement el=driver.findElement(By.xpath("//a[@title='Contacts']"));
	
	Actions act=new Actions(driver);
	act.moveToElement(el).build().perform();
	
	Thread.sleep(3000);
	
	WebElement wb1=driver.findElement(By.xpath("//a[@title='New Contact']"));
	
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	js1.executeScript("arguments[0].click();", wb1);
	
	
	*/
	
		/*driver.navigate().to("http://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		act.clickAndHold(driver.findElement(By.id("draggable"))).moveToElement(driver.findElement(By.id("droppable"))).release().build().perform();
		
		File scrFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
		String currentDir = System.getProperty("user.dir");
		FileUtils.copyFile(scrFile, new File(currentDir + "/screenshots/" + System.currentTimeMillis() + ".png"));
		*/
		
	/*	driver.get("http://www.popuptest.com/goodpopups.html");
		
		driver.findElement(By.linkText("Good PopUp #2")).click();
		Set<String>str=driver.getWindowHandles();
		Iterator<String>itr=str.iterator();
		
		String PW=itr.next();
		System.out.println("The parent window id is"+PW);
		
		System.out.println(driver.getTitle());
		
		String CW=itr.next();
		driver.switchTo().window(CW);
		System.out.println("The child window id is"+CW);
		System.out.println(driver.getTitle());
		
	
		driver.switchTo().window(PW);
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(CW);
		System.out.println(driver.getTitle());
		*/
		
		
		Properties prop=new Properties();
		//String file="C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\NaveenPractices\\objectrepo.properties";
		FileInputStream fs=new FileInputStream("C:\\Users\\shiva\\Desktop\\QA SELEMIUM TESTING AND JAVA\\duplicate workspace\\NaveenPractices\\objectrepo.properties");
		
		
		prop.load(fs);
		System.out.println(prop.getProperty("username"));
		System.out.println(prop.getProperty("password"));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
	
	
	}
}

