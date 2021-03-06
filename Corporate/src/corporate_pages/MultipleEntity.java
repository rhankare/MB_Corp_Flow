package corporate_pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriver.Window;
import org.openqa.selenium.WebDriverException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import generic.Constants;

public class MultipleEntity {
public WebDriver driver;
	
	public MultipleEntity(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		
	}	
	
//	@FindBy(xpath="//button[@class='btn btn-default']")
//	WebElement popup;
//	
//	public void pop() {
//		popup.click();
//	}
//	
//	@FindBy(xpath="//div[@class='col-sm-6 bg1']//a")
//	WebElement healthHover;
//	
//	public void hoverHealth() {
//		healthHover.click();
//	}
	
	
	// Selecting self Test
	@FindBy(id="2446709")
	WebElement selfSopra;
	
	@FindBy(xpath="//div[@id='1787073']")
	WebElement self;
	
	@FindBy(xpath="//div[@id='2086957']")
	WebElement selfWipro;
	
	@FindBy(xpath="//div[@id='4026037490']")
	WebElement selfArcadis;
	
	
	// Choosing the Package
	@FindBy(xpath="//button[contains(text(),'Choose')]")
	WebElement choose;
	
	@FindBy(xpath="//tr[1]//td[4]//button[1]")
	WebElement chooseWipro;
	
	@FindBy(xpath="//button[contains(text(),'Choose')]")
	WebElement chooseArcadis;
	
	@FindBy(xpath="//button[contains(text(),'Choose')]")
	WebElement chooseSopra;
	
	
	
	public void selfTest() throws InterruptedException {
		self.click();
		Thread.sleep(4000);
	}	
		
	public void selfTestWipro() throws InterruptedException {
		selfWipro.click();
		Thread.sleep(4000);
	}	
	
	public void selfTestArcadis() {
		selfArcadis.click();
	}
	
	public void selfTestSopra() {
		selfSopra.click();
	}
	
	public void chooseSelect() throws InterruptedException {
		choose.click();
		Thread.sleep(4000);
	}	
	
	public void chooseSelectWipro() throws InterruptedException {
		chooseWipro.click();
		Thread.sleep(4000);
	}
	
	public void chooseSelectArcadis() {
		chooseArcadis.click();
	}
	
	public void chooseSelectSopra() {
		chooseSopra.click();
	}
	
	@FindBy(xpath="/html/body/section/form/div[3]/div[8]/div[2]/div[1]/div[1]/select")
	WebElement stateSecond;
	
	public void selectStateSecond() throws InterruptedException {	
		Actions action = new Actions(driver);
		Action act= action.moveToElement(stateSecond).build();
		act.perform();
		Thread.sleep(3000);
		stateSecond.click();
			
			 Select select = new Select(stateSecond);
			 select.selectByVisibleText("Karnataka");
			
	}
	

	
//	public void scrollDown() {
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,1000)");
//	}
	
	
	//@FindBy(id="ddlState")	
	//WebElement stateId;
		
	@FindBy(xpath="//div[@id='divDCDetails']")
	WebElement stateFrame;
	
	@FindBy(xpath="//*[@id='ddlState']/option[10]")
	WebElement state;
	
//	public void selectState() throws InterruptedException {
//		System.out.println("Block started");
//		stateFrame.click();
//		System.out.println("Entered Block");
//		Thread.sleep(3000);
//		state.click();
//		Thread.sleep(3000);
//		Actions action = new Actions(driver);
//		action.moveToElement(state).click(state).build().perform();
//		System.out.println("Cursor clicked on the drop");
//		Select select = new Select(state);
//		select.selectByVisibleText("Bihar");
//		System.out.println("DONE");
//	}	
	
//	public void loop() {
//		System.out.println("loop going to dropdown");
//	}

	
	@FindBy(id="divDCDetails")
	WebElement dropform;
	
	public void form() {
		dropform.click();
	}
	
	public void selectState() throws InterruptedException {
		WebElement div = (new WebDriverWait(driver, 10))
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("ddlState")));
		if(div.isEnabled())
		{
			System.out.println("DIV AVAILABLE");
		}
		WebElement div2 = div.findElement(By.id("divState"));
		
		if(div2.isEnabled())
		{
			System.out.println("DIV2 AVAILABLE");
		}
		
		System.out.println("ENTERED");
		Select select = new Select(div2.findElement(By.id("ddlState")));
		select.selectByVisibleText("Bihar");
		System.out.println("DONE");
	}
}
