  package Pac_1;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

 @FindBy(xpath="//a[@class='content tasks']")
 private WebElement Tasks;
 
 @FindBy(xpath="//a[@class='content reports']")
 private WebElement Reports;
 
 @FindBy(xpath="//a[@class='content users']")
 private WebElement Users;
 
 @FindBy(xpath="(//a[text()='Logout'])[1]")
 private WebElement LogoutButton;
 
 //@FindBy(xpath="")
 //private List<WebElement> File;
 
 private WebDriver driver;
 public HomePage(WebDriver driver){
	 PageFactory.initElements(driver, this);
	 this.driver=driver;
 }
 
 public void openTasks() {
	 Tasks.click();
 }
 
 public void openReports() {
	 Reports.click();
 }
 
 public void openUsers() {
	 Users.click();
 }
 
 public void ClickOnLogoutButton() {
	 LogoutButton.click();
 }
 
 }