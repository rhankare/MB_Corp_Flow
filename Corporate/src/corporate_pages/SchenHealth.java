package corporate_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SchenHealth {
public WebDriver driver;
	
	public SchenHealth(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}
	
//	@FindBy(id="btnHealthCheck")
//	WebElement health;
	
	@FindBy(id="btnHealthCheck")
	WebElement health;
	
	@FindBy(xpath="//div[@id='divshowAHCInfo']//a[@class='button btn btn-success pull-right'][contains(text(),'OK')]")
	WebElement ok;
	
	public void healthClick() {
		health.click();
	}	
		
	public SchenAnnualHealth selectOk() {
		ok.click();
		return new SchenAnnualHealth(driver);
	}
//	public void healthClick() {
//		Actions builder = new Actions(driver);		
//		builder.moveToElement(health, 100, 100).click().build().perform();
	//	health.click();
//	}

}
