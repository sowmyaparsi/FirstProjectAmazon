package firstpackage.Project_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase6_SearchingVthFilters extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
	public void testcase6_searchingwithfilters() throws InterruptedException
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
		//lp.pricechanging();
		lpp.brands();
		lpp.technology();
		WebElement b=driver.findElement(By.xpath("(//span[@class='a-list-item'])[25]"));
		String s=b.getText();
		WebElement techn=driver.findElement(By.xpath("//span[.='5G']"));
		String s2=techn.getText();
		WebElement e=driver.findElement(By.xpath("(//div[@class='sg-col-20-of-24 s-result-item s-asin sg-col-0-of-12 sg-col-16-of-20 sg-col s-widget-spacing-small sg-col-12-of-16'])[1]"));
		String s1=e.getText();
		boolean b1=s1.contains(s);
		boolean b2=s1.contains(s2);
		Assert.assertEquals(b1, b2,"Not Correct search items are displayed");
	//Assert.assertequals(s.contains());
	}
}
