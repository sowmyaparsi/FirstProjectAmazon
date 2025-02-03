package firstpackage.Project_First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

public class AMZ_YourOrdersPage 
{
@FindBy(xpath="//select[@name='timeFilter']") WebElement selectyear;
@FindBy(xpath="//a[@id='a-autoid-8-announce']")	WebElement productreview_btn;
@FindBy(xpath="(//button[@class='ryp__star__button'])[5]") WebElement fivestarrating;

public void selectyearmthd()
{
	Select s=new Select(selectyear);
	s.selectByValue("year-2024");
}
public void productreviewmthd()
{
	productreview_btn.click();
}
public void fivestarratingmthd()
{
	fivestarrating.click();
}
public  AMZ_YourOrdersPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}

}
