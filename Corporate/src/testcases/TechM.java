package testcases;

import java.util.logging.Logger;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import corporate_pages.Corporate_class;
import corporate_pages.HealthCheck;
import corporate_pages.Login;
import corporate_pages.MbPage;
import corporate_pages.MultipleHealth;
import corporate_pages.SopraHome;

public class TechM extends Corporate_class {
WebDriver driver;
	
	static Logger Log = Logger.getLogger(TechM.class.getName());


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
	public void techm() throws InterruptedException {
		 loginpage = new Login(driver);	    
		 loginpage.login("Test1@techm","Techm123");
		 Reporter.log("Login Passed");
		 sopraHome = new SopraHome(driver);
		 sopraHome.closePopUp();
		 Thread.sleep(2000);		 
		 healthcheck = new HealthCheck(driver);
		 healthcheck.bookTechM();
		 Reporter.log("<br> Health Check clickable | HealthCheckPage");
		 Thread.sleep(25000);
		 mbPage = new MbPage(driver);
		 mbPage.citySelect();
		 Reporter.log("<br> City Selection Passed");
		 Thread.sleep(5000);
		 mbPage.viewNonSponsoredPackage();
		 Reporter.log("<br> Non Sponsor Package able to select");
		 Thread.sleep(4000);
		 mbPage.bookAppointment();
		 Reporter.log("<br> Book Apointment clickable");
		 Thread.sleep(3000);
		 mbPage.slotSelectAshok();
		 mbPage.selectTime();		 
		 Thread.sleep(2000);
		 mbPage.slotConfirm();
		 Reporter.log("<br> Time slected and confirmed");
		 Thread.sleep(6000);
		 mbPage.continueNext();
		 Reporter.log("<br> Continued to last page");
  }
}
