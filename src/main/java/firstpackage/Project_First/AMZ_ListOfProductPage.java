package firstpackage.Project_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class AMZ_ListOfProductPage 
{
	WebDriver driver;
	//xpath("(//a[@class='a-link-normal s-no-outline'])[1]")
	@FindBy(xpath="(//a[@class='a-link-normal s-no-outline'])[1]") WebElement firstproduct;
	@FindBy(id="p_36/range-slider_slider-item_upper-bound-slider") WebElement pricerange;
	@FindBy(xpath="//input[@type='range']")	WebElement slider;
	@FindBy(xpath="//input[@class='a-button-input']") WebElement go;
	@FindBy(xpath="(//span[@class='a-list-item'])[25]")	WebElement brands;
	@FindBy(xpath="//span[.='5G']") WebElement tech;
	@FindBy(xpath="(//a[.='Price: Low to High'])[5]")	WebElement sortlowtohigh;
	@FindBy(id="s-result-sort-select") WebElement featured;
	@FindBy(xpath="//button[@id='a-autoid-1-announce']")	WebElement addcart;
	@FindBy(xpath="(//div[@class='a-section'])[1]")	WebElement product1;
	@FindBy(xpath="(//a[@class='a-link-normal s-line-clamp-2 s-link-style a-text-normal'])[1]")	WebElement description;
	
	
	/*public void pricechanging() 
	{
	   Actions actions = new Actions(driver);
	    actions.clickAndHold(slider).moveByOffset(50, 0).release().perform();
	    //pricerange.sendKeys("0");
	    go.click();

	}*/
	public void product_first() throws InterruptedException
	{
		Thread.sleep(3000);
		firstproduct.click();
	}
	public String product1()
	{
		String producttext=product1.getText();
		return producttext;
	}
	public void addingtocart()
	{
		
		addcart.click();
		
	}
	public void brands()
	{
		brands.click();
	}
	public void technology()
	{
		tech.click();
	}
	public void sortinglowtohigh()
	{
		Select s=new Select(featured);
		s.selectByVisibleText("Price: Low to High");
	}
	public AMZ_ListOfProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
