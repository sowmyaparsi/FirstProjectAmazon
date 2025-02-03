package firstpackage.Project_First;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Testcase5_SearchingItem extends LaunchandQuit
{
@DataProvider(name="product")
public Object[][] listitems()
{
	Object l[][]=new Object[4][1];
		l[0][0]="handbags";
		l[1][0]="dresses";
		l[2][0]="watches";
		l[3][0]="mobiles";
		return l;
}
@Test(dataProvider="product", retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
public void testcase5_searching(String product) throws InterruptedException
{
	AMZHomePage hp=new AMZHomePage(driver);
	hp.account();
	hp.signacct();
	AMZLoginPage lp=new AMZLoginPage(driver);
	lp.username();
	lp.countinue_btton();
	lp.password();
	lp.sign_btn();
	hp.Searching_product(product);
	Thread.sleep(3000);
	String title=driver.getTitle();
	Assert.assertTrue(title.contains(product));
}

}

