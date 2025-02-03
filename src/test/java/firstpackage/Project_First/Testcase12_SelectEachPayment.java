package firstpackage.Project_First;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase12_SelectEachPayment extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
	public void testcase12_selectpayment() throws InterruptedException
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
		//sc.creditordebitoptionselect(driver);
		Thread.sleep(2000);
		sc.netbankingmethod();
		Thread.sleep(2000);
		sc.emimethod();
		//Assert.assertEquals(false, null);
	}
	

}
