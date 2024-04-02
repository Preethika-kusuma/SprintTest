package StepDefination;


import java.util.Scanner;

import java.time.Duration;

import org.openqa.selenium.By;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import PageFactory.Scenario1;
import PageFactory.Scenario2;
import PageFactory.Scenario3;
import PageFactory.Scenario4;
import PageFactory.Scenario5;
import PageFactory.Scenario6;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
////import net.bytebuddy.asm.MemberSubstitution.Substitution.Chain.Step.ForField.Write;
//
public class Apollo247test{
	WebDriver driver;
	
	@Given("I am on home page")
	public void i_am_on_home_page() {
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--disable-notifications");
		driver=new ChromeDriver(options);
		driver.manage().window().maximize();
		driver.get("https://www.apollo247.com/");
	    
	}

	@When("I clicked on medicine module")
	public void i_clicked_on_medicine_module() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		//WebElement medicine_page=driver.findElement(By.xpath("//p[text()='Medicines']"));	
		//medicine_page.click();
		Scenario1 medicine=new Scenario1(driver);
		medicine.Medicine_module();
	    
	}
	@Then("Navigated to medicine page")
	public void navigated_to_medicine_page() {
	    
	}

	@Given("clicked on health devices")
	public void clicked_on_health_devices() {
//	    WebElement healthdevice=driver.findElement(By.xpath("/html/body/div[2]/div[1]/div/div/ul/li[7]/a"));
//	    healthdevice.click();
	    Scenario2 HD=new Scenario2(driver);
	    HD.Health_Device();
	    
	}
	
	@When("click on product")
	public void click_on_product()  {
	

//		WebElement click_product=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div[1]/div[2]/div[3]/div/div/div/div/div[1]/div[3]/div/div/a/div/div[2]/div[1]/h2"));
//		click_product.click();
		Scenario2 HDP=new Scenario2(driver);
		HDP.health_product();
//		
	}
	@When("enter pincode")
	public void enter_pincode() {
    
//	WebElement enter_pincode=driver.findElement(By.xpath("//*[@id=\"PDP address banner\"]/div/div/div[1]/div/div/input"));
//	enter_pincode.click();
//	enter_pincode.sendKeys("500075");
		Scenario2 addpincode=new Scenario2(driver);
		addpincode.adress_pincode();
}

	@When("apply pincode for order")
	public void apply_pincode_for_order() {
   
//	WebElement apply_code=driver.findElement(By.xpath("//*[@id=\"PDP address banner\"]/div/div/div[1]/div/button/span"));
//	apply_code.click();
		Scenario2 applypincode=new Scenario2(driver);
		applypincode.apply_pincode();
}

	@Then("pincode will entered")
	public void pincode_will_entered() {
    
}
	
	@Given("I clicked on Ayurveda page")
	public void i_clicked_on_ayurveda_page() {
	   
//		WebElement ayurvedapage=driver.findElement(By.xpath("/html/body/main/div[2]/div/div/ul/li[6]/a"));
//		ayurvedapage.click();
		Scenario3 ayurvedapage=new Scenario3(driver);
		ayurvedapage.Ayurveda_Page();
	}
//
	@When("I click on category")
	public void i_click_on_category() {
	    
//		WebElement category=driver.findElement(By.xpath("//*[@id=\"headlessui-disclosure-button-:R3iqekm:\"]/h2"));
//		category.click();
		Scenario3 category=new Scenario3(driver);
		category.Select_Category();
	}

	@When("I click on add button")
	public void i_click_on_add_button() {
	    
	}

	@When("I select Herbs products")
	public void i_select_herbs_products() {
	    
//		WebElement select_product=driver.findElement(By.xpath("//*[@id=\"headlessui-disclosure-button-:r4:\"]/div/div/input"));
//		select_product.click();
		Scenario3 herbsproducts=new Scenario3(driver);
		herbsproducts.Herbs_Products();
	}

	@Then("I will get similar products")
	public void i_will_get_similar_products() {
	    
	}
	
	@Given("I want to click on personal care page")
	public void i_want_to_click_on_personal_care_page() {
//		WebElement personalcare=driver.findElement(By.xpath("/html/body/main/div[2]/div/div/ul/li[5]/a"));
//		personalcare.click();
		Scenario4 Pc=new Scenario4(driver);
		Pc.Personal_Care();
   
}

	@When("I click on personal care page")
	public void i_click_on_personal_care_page() {
    
}

	@When("click on Nivea Natural Glow Roll On Deodorant for Women")
	public void click_on_nivea_natural_glow_roll_on_deodorant_for_women() {
//		WebElement product=driver.findElement(By.xpath("//*[@id=\"__next\"]/div[2]/div[2]/div/div/div[2]/div[3]/div/div/div/div/div[1]/div[1]/div/div/a/div/div[2]/div[1]/h2"));
//		product.click();
		Scenario4 Personalcare_products =new Scenario4(driver);
		Personalcare_products.Products();
    
}
	@When("select the price value")
	public void select_the_price_value() {
//		WebElement add=driver.findElement(By.xpath("//*[@id=\"PDP price banner\"]/div/div/div[1]/div[2]/div[1]/p[1]"));
//		add.click();
		Scenario4 ProductPrice=new Scenario4(driver);
		ProductPrice.Product_price();
	}
//	   
//
	@When("click on Add to cart")
	public void click_on_add_to_cart() {
//		WebElement addedproduct=driver.findElement(By.xpath("//*[@id=\"headlessui-dialog-panel-:r1:\"]/div[2]/div/div[6]/button"));
//		addedproduct.click();
		Scenario4 addproduct=new Scenario4(driver);
		addproduct.Add_to_cart();
    
}

	@Then("product is added cart")
	public void product_is_added_cart() {
}
//
//
	@Given("I want to click on cart page")
	public void i_want_to_click_on_cart_page() {
//	WebElement addtocart=driver.findElement(By.xpath("/html/body/main/div[1]/header/div/div/div/div[3]/ul/li[2]/a"));
//	addtocart.click();
		Scenario5 cartpage=new Scenario5(driver);
		cartpage.Cart_Page();
}

	@Then("I am on my cart page")
	public void i_am_on_my_cart_page() {
}
@Given("I want to search medicine")
public void i_want_to_search_medicine() {
		Scenario6 SB=new Scenario6(driver);
		SB.Search_Bar();
	}

@When("I search for {string}")
public void i_search_for(String string) {
	Scenario6 SM=new Scenario6(driver);
	SM. Search_Medicine(string);
}


@When("It should display all similar items")
public void it_should_display_all_similar_items() {
   
}

@Then("medicine should be appear")
public void medicine_should_be_appear() {
}
}
    
    
