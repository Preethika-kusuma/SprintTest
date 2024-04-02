package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario2 {
	WebDriver driver;
	public Scenario2(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath="//li//a[@href='/shop-by-category/health-devices']")
	WebElement health_device;
	
	@FindBy(xpath="//*[@id=\"__next\"]/div[2]/div[2]/div/div[1]/div[2]/div[3]/div/div/div/div/div[1]/div[3]/div/div/a/div/div[2]/div[1]/h2")
	WebElement Product;
	
	@FindBy(xpath="//*[@id=\"PDP address banner\"]/div/div/div[1]/div/div/input")
	WebElement pincode;
	
	@FindBy(xpath="//*[@id=\"PDP address banner\"]/div/div/div[1]/div/button/span")
	WebElement apply;
	
	public void Health_Device() {
		health_device.click();
	}
	
	public void health_product(){
		Product.click();
	}
	
	public void adress_pincode() {
		pincode.click();
	}
	
	public void apply_pincode() {
		apply.click();
	}
	
}
