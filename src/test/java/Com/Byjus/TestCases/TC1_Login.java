package Com.Byjus.TestCases;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import Com.Byjus.BaseClass.Byjus_BaseClass;
import Com.Byjus.PageObject.Byjus_LoginPage;

public class TC1_Login extends Byjus_BaseClass {

	@Test
	public void LoginTC() throws InterruptedException {
		
		Byjus_LoginPage LP=new Byjus_LoginPage();
		log.info("Browser Is Opened.");
		
		LP.LoginButton();
		log.info("Login Button Clicked.");
		Thread.sleep(6000);
		WebElement fr=driver.findElement(By.xpath("//iframe[@onload=\"learnLoginIframeLoad(this)\"]"));
		driver.switchTo().frame(fr);
		Thread.sleep(3000);
		LP.MobileNumber("9175671762");
		log.info("Mobile Number Entered.");
		Thread.sleep(5000);
		LP.ContinueButton();
		log.info("Clicked Continue Button.");
		Thread.sleep(30000);
		LP.NextButton();
		log.info("Clicked Next Button.");
	}
}
