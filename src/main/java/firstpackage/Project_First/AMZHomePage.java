package firstpackage.Project_First;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZHomePage {
	
	WebDriver driver;
	
	String sname;
	
	@FindBy(xpath = "//span[@class='nav-line-2 ']")
	WebElement accountandlist;
	
	@FindBy(xpath = "(//span[.='Sign in'])[1]")
	WebElement sign;
	
	@FindBy(xpath = "//span[.='Your Account']")
	WebElement youraccount;
	
	@FindBy(xpath = "//a[.='Start here.'][1]")
	WebElement newcustomer;
	
	@FindBy(id = "twotabsearchtextbox")
	WebElement search;
	
	@FindBy(xpath = "//div[@id='nav-cart-count-container']")
	WebElement homeaddcart;
	
	@FindBy(id = "nav_prefetch_yourorders")
	WebElement orders;

	public AMZHomePage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void account() {
		Actions a = new Actions(this.driver);
		a.moveToElement(accountandlist).perform();
	}

	public void signacct() {
		sign.click();
	}

	public void accountprofile() {
		youraccount.click();
	}

	public void newcustomerregistration() throws InterruptedException 
	{
		Thread.sleep(3000);
		newcustomer.click();
	}

	public void Searching_product(String items) throws InterruptedException {
		Thread.sleep(2000);
		search.sendKeys(items + Keys.ENTER);

	}

	public void addtocarthomepage() {
		homeaddcart.click();
	}

	public void yourorders() {
		orders.click();
	}

}
