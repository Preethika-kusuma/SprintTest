package PageFactory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Scenario3 {
		WebDriver driver;
		public Scenario3(WebDriver driver) {
			this.driver=driver;
			PageFactory.initElements(driver, this);
		}
		
		@FindBy(xpath="//li//a[@href='/shop-by-category/ayurveda']")
		WebElement Ayurvedapage;
		
		@FindBy(xpath="//h2[text()='Category']")
		WebElement Category;
		
		@FindBy(xpath="//*[@id=\"headlessui-disclosure-button-:r4:\"]/div/div/input")
		WebElement Herbsproducts;
		
		public void Ayurveda_Page() {
			Ayurvedapage.click();
		}
		public void Select_Category() {
			Category.click();
		}
		public void Herbs_Products() {
			Herbsproducts.click();
		}
}
		
		
		