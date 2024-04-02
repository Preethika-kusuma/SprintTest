package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario4 {
	WebDriver driver;
	public Scenario4(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
}
	@FindBy(xpath="//li//a[@href='/shop-by-category/personal-care-1']")
	WebElement Personalcare;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div/div/a/div/div[2]/div[1]/h2")
	WebElement product;
	
	@FindBy(xpath="//*[@id=\"PDP price banner\"]/div/div/div[1]/div[2]/div[1]/p[1]")
	WebElement productprice;
	
	@FindBy(xpath="//*[@id=\"headlessui-dialog-panel-:r1:\"]/div[2]/div/div[6]/button")
	WebElement addtocart;
	
	public void Personal_Care() {
		Personalcare.click();
	}
	public void Products() {
		product.click();
	}
	public void Product_price() {
		productprice.click();
	}
	public void Add_to_cart() {
		addtocart.click();
	}
}
