package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import corporate_pages.Corporate_class;
import corporate_pages.Login;
import corporate_pages.MultipleHealth;

public class LmWind extends Corporate_class{
	WebDriver driver;

	@BeforeClass
		public void browser() {
		  System.setProperty("webdriver.chrome.driver", "C:\\chrome extension\\chromedriver.exe");
		  driver=new ChromeDriver();
		  driver.get("https://portal.medibuddy.in/Home.aspx");
		  driver.manage().window().maximize();
	}
	
	@AfterClass
	public void quit() {
		driver.quit();
	}

	@Test
	public void lmWind() throws InterruptedException {
		 loginpage = new Login(driver);	    
		 loginpage.login("test02@lmwindpower","09-05-1986");
		 
		 multiHealth = new MultipleHealth(driver);
		 multiHealth.pop();
		 Thread.sleep(2000);
		 multiHealth.hoverHealth();
		 //form filling is not continued will be back

  }
}
