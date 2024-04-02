package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario6 {
	WebDriver driver;
	public Scenario6(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//*[@id=\"mainContainerCT\"]/div[1]/div/div/div/div")
	WebElement searchbar;
	
	@FindBy(xpath="//*[@id=\"searchProduct\"]")
	WebElement search_medicine;
	
	public void Search_Bar() {
		searchbar.click();
	}
	public void Search_Medicine(String string) {
		search_medicine.sendKeys(string);
		search_medicine.click();
	}
}
	
	
