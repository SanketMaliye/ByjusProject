package Com.Byjus.BaseClass;

import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Byjus_BaseClass {
	public static WebDriver driver;
	public static Logger log;
	
	@BeforeMethod
	public void Initiate() throws InterruptedException {
		
		log=Logger.getLogger("Banking_Log");
		PropertyConfigurator.configure("log4j.properties");
		
//		System.setProperty("webdriver.gecko.driver","C:\\Drivers\\geckodriver31.exe");
//		driver=new FirefoxDriver();
		System.setProperty("webdriver.chrome.driver","C:\\Drivers\\chromedriver.exe");
 		driver=new ChromeDriver();
 		driver.manage().window().maximize();
 		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://byjus.com/");
		Thread.sleep(3000);
	}
	
	@AfterMethod
	public void Teardown() throws InterruptedException {
		Thread.sleep(10000);
		driver.quit();
	}
}
