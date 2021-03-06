package corporate_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;

public class MultipleHealth {
	
	public WebDriver driver;
	
	@FindBy(xpath="//button[@class='btn btn-default']")
	WebElement popup;
	
	@FindBy(xpath="//div[@class='col-sm-6 bg1']//a")
	WebElement healthHover;
	
	@FindBy(xpath="//span[contains(text(),'Book now')]")
	WebElement healthHovermonsanto;
	
	
	public MultipleHealth(WebDriver driver)
	{
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	public void pop() throws InterruptedException {
		popup.click();
		Thread.sleep(4000);
	}
	
	public MultipleEntity hoverHealth() throws InterruptedException {
		healthHover.click();
		Thread.sleep(4000);
		return new MultipleEntity(driver);
	}
	
	public MultipleEntity hoverHealthMonsanto() throws InterruptedException {
		healthHovermonsanto.click();
		Thread.sleep(4000);
		return new MultipleEntity(driver);
	}
	
	

}
