package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario5 {
	WebDriver driver;
	public Scenario5(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
		}
	@FindBy(xpath="/html/body/main/div[1]/header/div/div/div/div[3]/ul/li[2]/a")
	WebElement cart;
	
	public void Cart_Page() {
		cart.click();
	}
}
