package firstpackage.Project_First;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Testcase3_LoginwithInvalidCredential extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
	public void Testcase3_loginwithinvalid() throws InterruptedException, EncryptedDocumentException, IOException
	{
	AMZHomePage hp=new AMZHomePage(driver);
	hp.account();
	hp.signacct();
	AMZLoginPage lp=new AMZLoginPage(driver);
	lp.invalidUsername();
	lp.countinue_btton();
	lp.invalidPassword();
	lp.sign_btn();
	WebElement e=driver.findElement(By.id("auth-error-message-box"));
	String s=e.getText();
	Assert.assertTrue(s.contains("There was a problem"));    
	
    }

}