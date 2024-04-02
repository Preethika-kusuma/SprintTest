package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario1 {
	WebDriver driver;
	public Scenario1(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//p[text()='Medicines']")
	WebElement Medicine;
	
	public void Medicine_module() {
		Medicine.click();
	}

}
