package corporate_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class Mdropdwn {
public WebDriver driver;
	
	public Mdropdwn(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
	
	
//	@FindBy(xpath="/html[1]/body[1]/section[1]/form[1]/div[3]/div[8]/div[2]/div[1]/div[1]/select[1]")
//	WebElement state;
	
	@FindBy(id="ddlState")
	WebElement state;
	
	@FindBy(id="ddlCity")
	WebElement city;
	
	@FindBy(id="ddlDiagnostic")
	WebElement diagnostic;
	
	@FindBy(xpath="//button[@id='btnNext']")
	WebElement next;
	
	public void loop() {
		System.out.println("loop going to dropdown");
	}
//	
	public void selectState() throws InterruptedException {
		
	//	Thread.sleep(2000);
	//	state.click();
		System.out.println("dropdown clicked");
		Select sel = new Select(state);
		Thread.sleep(2000);
		sel.selectByVisibleText("Andhra Pradesh");
	//	sel.selectByValue("49");
	}
	
	
	public void selectCity() throws InterruptedException {
	//	Thread.sleep(2000);
		System.out.println("dropdown city clicked");
		Select sel = new Select(city);
		Thread.sleep(2000);
		sel.selectByVisibleText("Tirupati");		
	}
	
	
	public void selectDiagnostic() throws InterruptedException {
	//	Thread.sleep(2000);
		System.out.println("dropdown diagnostic clicked");
		Select sel = new Select(diagnostic);
		Thread.sleep(2000);
		sel.selectByVisibleText("Apollo Clinic , Sankarambadi Circle");
	}	
	
	public void nextPage() {
		next.click();
	}

}
