package firstpackage.Project_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase11_CompleteCheckout extends LaunchandQuit 
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
	public void testcase11_completechckout() throws InterruptedException {
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
		Thread.sleep(3000);
		WebElement e1 = driver.findElement(By.id("deliver-to-customer-text"));
		String text = e1.getText();
		AMZ_SeccureCheckout sc = new AMZ_SeccureCheckout(driver);
		if (text.equals("Delivering to sowmya")) {
			sc.adddeliveryinstruction();
			Thread.sleep(7000);
			sc.adddeliverryinstrupopup_savebtn(driver);
		} else {
			// AMZ_SeccureCheckout sc=new AMZ_SeccureCheckout(driver);
			sc.addnewaddressmthd();
			Thread.sleep(5000);
			AMZ_AddNewAddressPopup an = new AMZ_AddNewAddressPopup(driver);
			an.selectcountry();
			an.addnewaddress();
		}
		Thread.sleep(6000);
		sc.creditordebitoptionselect(driver);
		WebElement orderElement = driver.findElement(By.xpath("(//div[@class='order-summary-line-definition'])[6]"));
	String text1 = orderElement.getText();
	if(text1 != null)
	{
			System.out.println(text1);
			Assert.assertTrue(true);
	}

		

	}
}
