package firstpackage.Project_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase13_CouponCode extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
	public void testcase13_applycouponcode() throws InterruptedException
	{
		AMZHomePage hp = new AMZHomePage(driver);
		hp.account();
		hp.signacct();
		AMZLoginPage lp = new AMZLoginPage(driver);
		lp.username();
		lp.countinue_btton();
		lp.password();
		lp.sign_btn();
		hp.Searching_product("mobiles");
		AMZ_ListOfProductPage lpp = new AMZ_ListOfProductPage(driver);
		lpp.addingtocart();
		hp.addtocarthomepage();
		AMZ_ShoppingCartPage sp = new AMZ_ShoppingCartPage(driver);
		sp.proceedtobuy();
		AMZ_SeccureCheckout sc=new AMZ_SeccureCheckout(driver);
		sc.cuponcodemthd();
		sc.applybutton();
		Thread.sleep(3000);
		WebElement e=driver.findElement(By.xpath("//*[@id='pmts-claim-code-error-messages']/div[2]/div/div/div/p"));
		String text=e.getText();
		Assert.assertEquals(text, "The promotional code you entered is not valid.");
	}

}
