package firstpackage.Project_First;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZ_SelectedProductPage 
{
	@FindBy(xpath="//span[@id='productTitle']")	WebElement ptitle;
	@FindBy(xpath="//span[@class='a-price aok-align-center reinventPricePriceToPayMargin priceToPay']")	WebElement pprice;
	@FindBy(xpath="//div[@id='feature-bullets']")	WebElement pdescription;
	@FindBy(xpath="(//span[@id=\"acrPopover\"])[1]")	WebElement prating;
	
	public boolean product_title(WebDriver driver) throws InterruptedException
	{
		System.out.println(driver.getWindowHandles());
		Set<String> id=driver.getWindowHandles();
		Iterator<String> i=id.iterator();
		String parentid=i.next();
		String childid=i.next();
		driver.switchTo().window(childid);
		Thread.sleep(3000);
	boolean title=	ptitle.isDisplayed();
	return title;
	}
	public boolean product_price()
	{
	boolean price=pprice.isDisplayed();
	return price;
	}
	public boolean product_description()
	{
	boolean desc=pdescription.isDisplayed();
	return desc;
	}
	public boolean product_rating()
	{
	boolean desc=prating.isDisplayed();
	return desc;
	}
	
	public AMZ_SelectedProductPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
}
