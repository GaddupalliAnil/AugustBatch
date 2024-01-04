package Verification;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import Browsers.Base;
import Pac_1.HomePage;
import Pac_1.Login;

public class VerifyTheActiTime extends Base {
	WebDriver driver;
	Login l;
	HomePage h;
	
	@Parameters("BrowserName")
	@BeforeTest
	public void LaunchBrowser(String browser) {
		if (browser.equals("Chrome")) {
			driver=OpenChromeBrowser();
		}
		if(browser.equals("Firefox")) {
			driver=OpenFirefoxBrowser();
		}
		if(browser.equals("Edge")) {
			driver=OpenEdgeBrowser();
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
	}
	
	
	@BeforeClass
	public void CreatePomObject() {
		l=new Login(driver);
		h=new HomePage(driver);
		
		
	}
	@BeforeMethod
	public void LoginToApplication_1() {
		driver.get("https://online.actitime.com/marolix15/login.do");
		l=new Login(driver);
		l.LoginToApplication();
		h=new HomePage(driver);
		
	}
	@Test
	public void VerifyTheTask() {
		h.openTasks();
		String Url=driver.getCurrentUrl();
		String Title=driver.getTitle();
		System.out.println(Url);
		System.out.println(Title);
		if(Url.equals("https://online.actitime.com/marolix15/tasks/tasklist.do") && Title.equals("actiTIME - Task List")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	@Test
	public void VerifyTheReports() {
		h.openReports();
		String Url1=driver.getCurrentUrl();
		String Title1=driver.getTitle();
		System.out.println(Url1);
		System.out.println(Title1);
		if(Url1.equals("https://online.actitime.com/marolix15/reports/dashboard.do") && Title1.equals("actiTIME - Reports Dashboard")) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}
	}
	@AfterMethod
	public void ClickOnLogout() {
		h.ClickOnLogoutButton();		
	}
	@AfterClass
	public void ClearPomObject() {
		l=null;
		h=null;
	}
	@AfterTest
	public void CloseTheBrowser() {
		driver.quit();
		driver=null;
		System.gc();
	}
	
	}
	
