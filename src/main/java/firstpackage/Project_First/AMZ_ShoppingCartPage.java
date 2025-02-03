package firstpackage.Project_First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZ_ShoppingCartPage 
{
	@FindBy(xpath="(//span[@class='a-truncate sc-grid-item-product-title a-size-base-plus'])[1]")	WebElement cartproduct1;
	@FindBy(xpath="//span[@class='a-icon a-icon-small-add']") WebElement increment;
	@FindBy(xpath="(//input[@class='a-color-link'])[1]")	WebElement delete;
	//@FindBy(xpath="//*[@id=\"sc-active-a88ca232-9c3c-4373-9387-e53c245888b2\"]/div")	WebElement deletetext;
	@FindBy(xpath="(//span[@class='a-size-base sc-list-item-removed-msg-text-delete'])[1]")	WebElement deletetext;
	@FindBy(xpath="//input[@name='proceedToRetailCheckout']")	WebElement proceedbuy;
	
	public String productincart()
	{
		String producttext=cartproduct1.getText();
		return producttext;
	}
	public void increment()
	{
		increment.click();
		
	}
	public void deleteproduct()
	{
		delete.click();
	}
	public String deletetextafter()
	{
		String deletemsg=deletetext.getText();
		return deletemsg;
	}
	public void proceedtobuy()
	{
		proceedbuy.click();
	}
	public AMZ_ShoppingCartPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
