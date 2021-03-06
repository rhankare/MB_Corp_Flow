package corporate_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ArcadisHome {
	public WebDriver driver;

    public ArcadisHome(WebDriver driver)
    {
	this.driver=driver;
	PageFactory.initElements(driver, this);
	}	
    
    @FindBy(xpath="//button[@class='btn btn-default']")
    WebElement close;
    
   @FindBy(xpath="//*[@id='form1']/div[1]/div/div[2]/div[6]/div/h2")
    //@FindBy(className="box text-center bgc4")
    WebElement mouseHover;
        
    @FindBy(xpath="//*[@id=\"form1\"]/div[1]/div/div[2]/div[6]/div/div[2]/a[2]")
    WebElement book;
  
    public void closePopUp() {
    	close.click();
    }
    
    public void mouseHoverBook() throws InterruptedException {
    	
    	
    	Actions action = new Actions(driver);
    	Thread.sleep(2000);
    	Action act = action.moveToElement(mouseHover).build();
    	act.perform();
    	Thread.sleep(2000);
    	book.click();
    }
    
//    public void bookAppointment() {
//    	book.click();
//    }
    

}
