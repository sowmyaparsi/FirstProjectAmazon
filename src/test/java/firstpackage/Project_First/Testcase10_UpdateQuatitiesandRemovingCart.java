package firstpackage.Project_First;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase10_UpdateQuatitiesandRemovingCart extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
public void testcase10_updateandremoveincart() throws InterruptedException
{
	AMZHomePage hp=new AMZHomePage(driver);
	hp.account();
	hp.signacct();
	AMZLoginPage lp=new AMZLoginPage(driver);
	lp.username();
	lp.countinue_btton();
	lp.password();
	lp.sign_btn();
	hp.Searching_product("mobiles");
	AMZ_ListOfProductPage lpp=new AMZ_ListOfProductPage(driver);
	lpp.addingtocart();
	hp.addtocarthomepage();
	Thread.sleep(3000);
	AMZ_ShoppingCartPage sp=new AMZ_ShoppingCartPage(driver);
	sp.increment();
	Thread.sleep(3000);
	sp.deleteproduct();
	Thread.sleep(5000);
	String text1=sp.deletetextafter();
	System.out.println(text1);
	Assert.assertTrue(text1.contains("was removed from Shopping Cart."));
	
}
}
