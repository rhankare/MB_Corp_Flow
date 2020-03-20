package testcases;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import corporate_pages.Corporate_class;
import corporate_pages.Login;
import corporate_pages.Mdropdwn;
import corporate_pages.MultipleEntity;
import corporate_pages.MultipleHealth;
import generic.Constants;

public class Jdtl extends Corporate_class {
	WebDriver driver;
	MultipleHealth multipleHealth;
	
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
  public void jdtlCorp() throws InterruptedException {
	  loginpage = new Login(driver);
	  //constant = new Constants(driver);
	 // multiplentity = new MultipleEntity(driver);
	  
	  //loginpage.user("test3@jdtl");
	  //loginpage.pswd("12-09-1993");
	  multipleHealth = loginpage.login("test3@jdtl","12-09-1993");
	  
	  multipleHealth.pop();
	  multiplentity = multipleHealth.hoverHealth();
	  
	  multiplentity.selfTest();
	  multiplentity.chooseSelect();
	  Thread.sleep(20000);
	  
//	  multiplentity.form();
	  //multiplentity.scrollDown();
	  
	  multiplentity.selectState();
	  
//	  multiplentity.pop();
//	  Thread.sleep(2000);
//	  multiplentity.hoverHealth();
//	  Thread.sleep(8000);
//	  multiplentity.selfTest();
//	  Thread.sleep(2000);
//      multiplentity.chooseSelect();
//      Thread.sleep(8000);
      //multiplentity.selectState();
	  
	  
	 // m.loop();
	  //Thread.sleep(3000);
//	  m.selectState();
//	  Thread.sleep(2000);
//	  m.selectCity();
//	  Thread.sleep(2000);
//	  m.selectDiagnostic();
//	  
//	  Thread.sleep(2000);
//	  m.nextPage();
	   
		  
  }
  
 
}
