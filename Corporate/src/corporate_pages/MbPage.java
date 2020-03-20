package corporate_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MbPage {
	public WebDriver driver;

    public MbPage(WebDriver driver)
    {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
//    @FindBy(xpath="//a[text()='Health Check']")
//    WebElement healthcheck;
//
//    @FindBy(xpath="//a[contains(text(),'Book now')]")
//    WebElement booknow;
    
    @FindBy(xpath="/html/body/div[1]/div/div/div/div[1]/div[1]/img")
	WebElement city;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement cityRealimage;
    
    @FindBy(xpath="/html[1]/body[1]/div[1]/div[1]/div[1]/div[1]/div[1]/div[1]")
    WebElement cityCbn;
    
    @FindBy(xpath="//div[@class='action bold mdbTxt text-right']//span[contains(text(),'View Package')]")
	WebElement viewpkg;
    
    @FindBy(xpath="//button[@class='btn btn-primary']")
	WebElement bookapoint;
    
    @FindBy(xpath="//div[@id='42245aaaaaaaaaaaaaaaaaaaaaaaaaaa']//a[@class='btn btn-primary pull-right clearfix btn-xs'][contains(text(),'Select slot')]")
	WebElement selectslot;
    
    @FindBy(xpath="//div[@class='row']//div[3]//div[1]//div[2]//span[1]//a[1]")
    WebElement selectSlotanalog;
    
    @FindBy(xpath="//div[@id='60708aaaaaaaaaaaaaaaaaaaaaaaaaaa']//a[@class='btn btn-primary pull-right clearfix btn-xs'][contains(text(),'Select slot')]")
    WebElement selectSlotrealImage;
    
    @FindBy(xpath="//a[@class='btn btn-primary pull-right clearfix btn-xs']")
    WebElement selectSlotCbn;
 
  
    @FindBy(xpath="//label[contains(text(),'08:00 AM')]")
	WebElement timings;
    
    
    @FindBy(xpath="//a[contains(text(),'Confirm slot')]")
	WebElement confirmTime;
    
    @FindBy(xpath="//span[contains(text(),'Continue')]")
	WebElement cont;
	
	
	
//	public void health() {
//		healthcheck.click();
//	}	
//	
//	public void book() {
//		booknow.click();
//	}
//	
	
	public void WaitExplicitly()		{
		WebDriverWait wait=new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(city));
		
	}
	
	public void citySelect() {
		city.click();
	}
	
	public void cityRealImage() {
		cityRealimage.click();
	}
	
	public void cityCbnI() {
		cityCbn.click();
	}
	
	
	public void viewPackage() {
		viewpkg.click();
	}	
	
	
	public void bookAppointment() {
		bookapoint.click();
	}
	
	
	public void slotSelect() {
		selectslot.click();
	}
	
	public void slotSelectanalog() {
		selectslot.click();
	}
	
	public void slotSelectRealImage() {
		selectSlotrealImage.click();
	}
	
	public void slotSelectCbnI() {
		selectSlotCbn.click();
	}
		
	public void selectTime() {
		timings.click();
	}
		
	public void slotConfirm() {
		confirmTime.click();
	}	
	
	public void continueNext() {
		cont.click();
	}

	
}
