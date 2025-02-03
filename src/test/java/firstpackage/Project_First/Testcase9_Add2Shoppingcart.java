package firstpackage.Project_First;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase9_Add2Shoppingcart extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
public void testcase9_addshoppingcart() throws InterruptedException
{
	AMZHomePage hp=new AMZHomePage(driver);
	hp.account();
	hp.signacct();
	AMZLoginPage lp=new AMZLoginPage(driver);
	lp.username();
	lp.countinue_btton();
	lp.password();
	lp.sign_btn();
	//AMZHomePage hp=new AMZHomePage(driver);
	hp.Searching_product("mobiles");
	AMZ_ListOfProductPage lpp=new AMZ_ListOfProductPage(driver);
	lpp.addingtocart();
	hp.addtocarthomepage();
	String producctdescription=lpp.product1();
	AMZ_ShoppingCartPage sp=new AMZ_ShoppingCartPage(driver);
	String productdescrcart=sp.productincart();
	if(producctdescription.equals(productdescrcart))
		Assert.assertTrue(true);
	
}
}
