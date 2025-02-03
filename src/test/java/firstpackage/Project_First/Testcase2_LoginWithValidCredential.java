package firstpackage.Project_First;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase2_LoginWithValidCredential extends LaunchandQuit
{
	
	@Test(retryAnalyzer=firstpackage.Project_First.RetryLogicClass.class)
	public void Testcase2_loginwithvalidcred() throws InterruptedException
	{
	AMZHomePage hp=new AMZHomePage(driver);
	hp.account();
	hp.signacct();
	AMZLoginPage lp=new AMZLoginPage(driver);
	lp.username();
	lp.countinue_btton();
	lp.password();
	lp.sign_btn();
	WebElement e=driver.findElement(By.id("twotabsearchtextbox"));
	Assert.assertEquals(e.isDisplayed(), true ,"Sorry,login is not successful");
	}

}
