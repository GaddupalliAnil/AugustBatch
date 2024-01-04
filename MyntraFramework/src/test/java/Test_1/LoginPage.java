package Test_1;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pac_1.HomePage;
import Pac_1.Login;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://online.actitime.com/marolix15/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		Login l = new Login(driver);
		l.LoginToApplication();
		
		
		HomePage h=new HomePage(driver);
		h.openTasks();
		h.openReports();
		h.openUsers();
		h.ClickOnLogoutButton();
		
	
  
	}

}
