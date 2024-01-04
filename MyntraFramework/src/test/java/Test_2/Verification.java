package Test_2;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import Pac_1.HomePage;
import Pac_1.Login;

public class Verification {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Login l;
		HomePage h;
		
		WebDriver driver=new ChromeDriver();
		driver.get("https://online.actitime.com/marolix15/login.do");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		//Testcase-1
		
		l=new Login(driver);
		l.LoginToApplication();
		
		h =new HomePage(driver);
		h.openTasks();
		String Url=driver.getCurrentUrl();
		String Title=driver.getTitle();
		System.out.println(Url);
		System.out.println(Title);
		
		if(Url.equals("https://online.actitime.com/marolix15/tasks/tasklist.do") && Title.equals("actiTIME - Task List"))
		
		      System.out.println("Pass");
		  
		  else {
			  
			  System.out.println("Fail");
		  }
		
		h.ClickOnLogoutButton();
		
		//Testcase-2
		
		l=new Login(driver);
		l.LoginToApplication();
		
		h.openReports();
		String Url1=driver.getCurrentUrl();
		String Title1=driver.getTitle();
		System.out.println(Url1);
		System.out.println(Title1);
		
		if(Url.equals("https://online.actitime.com/marolix15/reports/dashboard.do") && Title.equals("actiTIME - Reports Dashboard"))
		
			System.out.println("Pass");
		
		else {
			
			System.out.println("Fail");
		}
		
		h.ClickOnLogoutButton();
		
		//Testcase-3
		
		l.LoginToApplication();
		
		h.openUsers();
		String Url2=driver.getCurrentUrl();
		String Title2=driver.getTitle();
		System.out.println(Url2);
		System.out.println(Title2);
		
		if(Url.equals("https://online.actitime.com/marolix15/administration/userlist.do") && Title.equals("actiTIME - User List"))
			
			System.out.println("Pass");
		
		else {
			
			System.out.println("Fail");
		}
		
		h.ClickOnLogoutButton();
		  }
	}


