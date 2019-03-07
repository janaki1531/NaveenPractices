package practices;



	import java.util.List;
	import java.util.concurrent.TimeUnit;

	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Walmart {

		public static WebDriver driver;
		
		public static void googleTest() {
			
			driver=new ChromeDriver();
		
		driver.get("https://www.walmart.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Camera");
		
	List<WebElement>list=	driver.findElements(By.xpath("//div[@class='GlobalTypeahead-dropdown hide-content']//div[@class='header-Typeahead-row']//a"));
		
		
		System.out.println(list.size());
		
		for(int i=0;i<=list.size();i++) {
			System.out.println(list.get(i).getText());
			if(list.get(i).getText().contains("polaroid camera")) {
				list.get(i).click();
				break;
			}
		}
		
		}
		
		public static void main(String[] args) {
			googleTest();
		}
	}
