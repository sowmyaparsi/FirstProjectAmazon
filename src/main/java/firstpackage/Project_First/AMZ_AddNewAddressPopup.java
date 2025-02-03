package firstpackage.Project_First;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AMZ_AddNewAddressPopup 
{
@FindBy(name="address-ui-widgets-countryCode")	WebElement country;
@FindBy(id="address-ui-widgets-enterAddressFullName")	WebElement fname;
@FindBy(id="address-ui-widgets-enterAddressPhoneNumber")	WebElement phnumber;
@FindBy(id="address-ui-widgets-enterAddressLine1")	WebElement address1;
@FindBy(id="address-ui-widgets-enterAddressLine2")	WebElement address2;
@FindBy(id="address-ui-widgets-enterAddressCity")	WebElement city;
@FindBy(name="address-ui-widgets-enterAddressStateOrRegion")	WebElement state;
@FindBy(id="address-ui-widgets-enterAddressPostalCode")	WebElement pincode;
@FindBy(id="address-ui-widgets-use-as-my-default")	WebElement defaultaddress;
@FindBy(xpath="//span[@id='checkout-primary-continue-button-id']")	WebElement usethisaddress;

public void selectcountry() throws InterruptedException
{
	System.out.println(country.isEnabled());
	
	//System.out.println(country.isSelected());
	Thread.sleep(3000);
	Select s=new Select(country);
	s.selectByVisibleText("Germany");
	
}
public void addnewaddress()
{
	fname.sendKeys("sowmya");
	phnumber.sendKeys("7472268271");
	address1.sendKeys("22211 Calvert st ap216");
	address2.sendKeys(" Woodland hills");
	city.sendKeys("woodland hills");
	Select s=new Select(state);
	s.selectByValue("CA");
	pincode.sendKeys("91367");
	defaultaddress.click();
	usethisaddress.click();
}

public AMZ_AddNewAddressPopup(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
