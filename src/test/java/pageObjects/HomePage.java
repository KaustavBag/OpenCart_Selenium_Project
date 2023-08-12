package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends BasePage {

	public HomePage(WebDriver driver) {
		super(driver);
	}
	
	//Elements
	
	@FindBy(xpath="//span[@class='caret']") WebElement btn_account;
	
	@FindBy(xpath="//a[text()='Register']") WebElement opt_register;
	
	//Action Methods
	
	public void clickAccount() {
		btn_account.click();
	}
	
	public void clickRegister() {
		opt_register.click();
	}
}
