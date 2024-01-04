package Pac_1;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login {
	
	@FindBy (xpath = "//input[@id='username']")
	private WebElement Username;
	
	@FindBy (xpath = "//input[@name='pwd']")
	private WebElement Password;
	
	@FindBy (xpath = "//input[@id='keepLoggedInCheckBox']")
	private WebElement KeepMeSignIn;
	
	@FindBy (xpath = "//a[@id='loginButton']")
	private WebElement LoginButton;
	
	
	public Login(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}

	//public void SendUsername() {
		//Username.sendKeys("aneelgaddupalli@gmail.com");
	//}
		
	//public void SendPassword() {
		//Password.sendKeys("aneel@0123");
	//}
	
	//public void ClickOnKeepMeSignIn() {
		//KeepMeSignIn.click();
	//}
	
	//public void ClickOnLoginButton() {
		//LoginButton.click();
	//}	
		
	//or
		
		public void LoginToApplication() {
			Username.sendKeys("aneelanil509@gmail.com");
			Password.sendKeys("YWmy39hE");
			KeepMeSignIn.click();
			LoginButton.click();
			
			
		}
}
	

