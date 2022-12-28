package Com.Byjus.PageObject;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import Com.Byjus.BaseClass.Byjus_BaseClass;

public class Byjus_LoginPage extends Byjus_BaseClass{
//	1.
	public Byjus_LoginPage() {
		PageFactory.initElements(driver, this);
	}
	
//	2.
	@FindBy(xpath="(//a[text()=\"Login\"])[2]") public WebElement LoginBt;
	@FindBy(xpath="//input[@placeholder=\"Enter your mobile number\"]")
	public WebElement Mob;
	@FindBy(xpath="//button[text()=\"Continue\"]") public WebElement Continue;
	@FindBy(xpath="//button[text()=\"Next\"]") public WebElement Next;
	
//	3.
	public void LoginButton() {
		LoginBt.click();
	}
	public void MobileNumber(String M) {
		Mob.sendKeys(M);
	}
	public void ContinueButton() {
		Continue.click();
	}
	public void NextButton() {
		Next.click();
	}
}
