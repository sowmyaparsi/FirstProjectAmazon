package firstpackage.Project_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase8_SortingSearchproduct extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
public void testcase8_sortingsearch() throws InterruptedException 
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
	lpp.sortinglowtohigh();
	Thread.sleep(3000);
	WebElement e=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[1]"));
	Thread.sleep(2000);
	String value=e.getText();
	int number1 = Integer.parseInt(value);
	System.out.println(value);
	WebElement e1=driver.findElement(By.xpath("(//span[@class='a-price-whole'])[2]"));
	Thread.sleep(2000);
	String value1=e.getText();
	System.out.println(value1);
	int number2 = Integer.parseInt(value1);
	if(number1<=number2)
		Assert.assertTrue(true);
	
	
	
}
}
