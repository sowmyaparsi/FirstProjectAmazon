package firstpackage.Project_First;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(ListenerClass.class)

public class Testcase1_SuuccessfulRegister extends LaunchandQuit {
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
	public void Testcase1_registerintoaccount() throws InterruptedException {
		AMZHomePage hp = new AMZHomePage(driver);
		hp.account();
		hp.newcustomerregistration();
		AMZCreateAccount c = new AMZCreateAccount(driver);
		c.cstmname();
		c.countryCode();
		c.mobileNumber();
		c.pwd();
		c.verifyMobileNumber();
		WebElement e = driver.findElement(By.xpath("//span[@class='a-list-item']"));
		String s = e.getText();
		if (s.contains(" You indicated you are a new customer") == true)
			Assert.assertTrue(true, "Registeration is not successful");
	}
}
