package firstpackage.Project_First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZ_YourAccountPage
{
@FindBy(xpath="(//span[@class='a-list-item'])[24]") WebElement shopingpreference;


public void shoppingpreference() throws InterruptedException
{
	shopingpreference.click();
	Thread.sleep(3000);
}
public AMZ_YourAccountPage(WebDriver driver)
{
	PageFactory.initElements(driver, this);
}
}
