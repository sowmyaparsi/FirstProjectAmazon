package firstpackage.Project_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase14_GiveRatings extends LaunchandQuit
{
	
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
	public void testcase14_givingrating() throws InterruptedException
	{
	AMZHomePage hp=new AMZHomePage(driver);
	hp.account();
	hp.signacct();
	AMZLoginPage lp=new AMZLoginPage(driver);
	lp.username1();
	lp.countinue_btton();
	lp.password1();
	lp.sign_btn();
	hp.account();
	hp.yourorders();
	AMZ_YourOrdersPage op=new AMZ_YourOrdersPage(driver);
	op.selectyearmthd();
	op.productreviewmthd();
	Thread.sleep(3000);
	op.fivestarratingmthd();
	WebElement e1=driver.findElement(By.xpath("//span[.='Review Your Purchases']"));
	String text=e1.getText();
	Assert.assertEquals(text,"Review Your Purchases");
	}
}

