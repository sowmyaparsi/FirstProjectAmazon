package firstpackage.Project_First;

import org.testng.Assert;
import org.testng.annotations.Test;

public class TestCase7_ReviewProductDetails extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
public void TestCase7_reviewproduct() throws InterruptedException
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
	//lpp.product1();
	lpp.product_first();
	AMZ_SelectedProductPage spp=new AMZ_SelectedProductPage(driver);
	boolean title=spp.product_title(driver);
	boolean price=spp.product_price();
	boolean description=spp.product_description();
	boolean ratings=spp.product_rating();
	System.out.println(price +" "+ ratings+" "+ description+" "+ratings);
	if(title && price && description && ratings)
		Assert.assertTrue(true,"Details not displayed properly");
	
	
	
	
	
	
	
}
}
