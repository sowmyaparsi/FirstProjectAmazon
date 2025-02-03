package firstpackage.Project_First;

import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase15_CartWithoutLogin extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
public void testcase15_cartwoutlogin() throws InterruptedException
{
		AMZHomePage hp=new AMZHomePage(driver);
		hp.Searching_product("mobiles");
		AMZ_ListOfProductPage lp=new AMZ_ListOfProductPage(driver);
		lp.addingtocart();
		Thread.sleep(2000);
		hp.addtocarthomepage();
		String producctdescription=lp.product1();
		AMZ_ShoppingCartPage sp=new AMZ_ShoppingCartPage(driver);
		String productdescrcart=sp.productincart();
		if(producctdescription.equals(productdescrcart))
			Assert.assertTrue(true);
}
}
