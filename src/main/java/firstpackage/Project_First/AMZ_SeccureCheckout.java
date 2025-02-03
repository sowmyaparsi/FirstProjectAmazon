package firstpackage.Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AMZ_SeccureCheckout 
{
	//WebDriver driver;
	@FindBy(xpath="//span[@id='add-new-address-desktop-sasp-tango-link']")	WebElement addnewaddress;
	@FindBy(xpath="//div[@class='a-column a-span12 a-spacing-none a-span-last']")	WebElement adddeliveryinstruction;
	@FindBy(xpath="//span[@id='cdp-save-button-announce']")	WebElement saveinstrucpopup;
	@FindBy(xpath="//input[@value='SelectableAddCreditCard']") WebElement creditordebitoption;
	@FindBy(xpath="//div[contains(@class, 'a-popover-wrapper')]//span[@id='cdp-save-button-announce']") WebElement element1;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[2]")	WebElement netbanking;
	@FindBy(xpath="(//input[@name='ppw-instrumentRowSelection'])[4]")	WebElement emi;
	@FindBy(xpath="(//a[@class='a-link-emphasis pmts-add-cc-default-trigger-link'])[1]")	WebElement savecard;
	@FindBy(xpath="((//div[@class='a-section a-spacing-small a-spacing-top-small a-text-right']/span[1])/span/button)")	WebElement savecard_cancel;
	@FindBy(xpath="//input[@name='addCreditCardNumber']")	WebElement cardnumber;
	@FindBy(name="ApxSecureIframe")	WebElement iframeelement;
	@FindBy(name="ppw-bankSelection_dropdown")	WebElement netbanking_select;
	@FindBy(xpath="//input[@name='ppw-claimCode']") WebElement couponcode;
	@FindBy(xpath="//input[@name='ppw-claimCodeApplyPressed']")	WebElement apply_btn;
	public void addnewaddressmthd() 
	{
		addnewaddress.click();
	}
	public void adddeliveryinstruction() throws InterruptedException
	{
		Thread.sleep(3000);
		if (adddeliveryinstruction.isDisplayed()) 
		{
			System.out.println("Displayed");
			Thread.sleep(3000);
			adddeliveryinstruction.findElement(By.tagName("span")).click();
		} 
		else 
		{
			System.out.println("Add Delivery Instruction Not displayed");
		}
	}
	public void adddeliverryinstrupopup_savebtn(WebDriver driver) throws InterruptedException
	{
		if (saveinstrucpopup.isDisplayed()) {
			System.out.println("Save button displayed");

			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
			WebElement modal = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a-button a-button-enabled a-button-primary']")));
			modal.click();
			//saveinstrucpopup.click();
		} 
		else 
		{
			System.out.println("Save button not displayed");
		}
	}
	public void creditordebitoptionselect(WebDriver driver) throws InterruptedException
	{
		creditordebitoption.click();
		Thread.sleep(3000);
		savecard.click();
		Thread.sleep(6000);
		driver.switchTo().frame(iframeelement);
		cardnumber.sendKeys("1234456789");
		savecard_cancel.click();
		driver.switchTo().defaultContent();
		/*if(savecard_cancel.isDisplayed()==true)
		//{
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));
			WebElement button = wait.until(ExpectedConditions.visibilityOfElementLocated(
			    By.xpath("//div[contains(@class, 'a-spacing-top-small') and contains(@class, 'a-text-right')]//button")));
		button.click();
		//}*/
	}
	public void netbankingmethod()
	{
		netbanking.click();
		Select s=new Select(netbanking_select);
		s.selectByValue("HDF DIRECT");
	}
	public void emimethod()
	{
		emi.click();
	}
	public void cuponcodemthd()
	{
		couponcode.sendKeys("3454456");
	}
	public void applybutton()
	{
		apply_btn.click();
	}
	public AMZ_SeccureCheckout(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
