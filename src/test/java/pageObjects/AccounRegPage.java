package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class AccounRegPage extends BasePage{
	

	public AccounRegPage(WebDriver driver){
		super(driver);
	}

//Elements
	
@FindBy(id="input-firstname") WebElement txt_firstname;
@FindBy(name="lastname") WebElement txt_lastname;
@FindBy(name="email") WebElement txt_email;
@FindBy(name="telephone") WebElement input_telephone;
@FindBy(name="password") WebElement input_password;
@FindBy(name="confirm") WebElement input_confirmpass;
@FindBy(name="agree") WebElement check_agree;
@FindBy(xpath="//input[@value='Continue']") WebElement btn_submit;
@FindBy(xpath="//h1[text()='Your Account Has Been Created!']") WebElement txt_accountconfirm;
//Actions

public void setFirstname(String firstname) {
	txt_firstname.sendKeys(firstname);
}

public void setLastname(String lastname) {
	txt_lastname.sendKeys(lastname);
}

public void setEmail(String email) {
	txt_email.sendKeys(email);
}

public void setTelephone(String telephone) {
	input_telephone.sendKeys(telephone);
}

public void setPassword(String password) {
	input_password.sendKeys(password);
}

public void setConfirmPass(String password) {
	input_confirmpass.sendKeys(password);
}

public void checkAgree() {
	check_agree.click();;
}

public void clickSubmit() {
	btn_submit.click();
}



public boolean accountConfirmMsg() {
	boolean status=txt_accountconfirm.isDisplayed();
	return status;
}

}