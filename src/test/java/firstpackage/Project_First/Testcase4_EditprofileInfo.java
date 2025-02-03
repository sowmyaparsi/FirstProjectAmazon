package firstpackage.Project_First;

import org.testng.annotations.Test;

public class Testcase4_EditprofileInfo extends LaunchandQuit
{
	@Test(retryAnalyzer = firstpackage.Project_First.RetryLogicClass.class)
	public void Testcase4_changeprofile() throws InterruptedException
	{
		AMZHomePage hp=new AMZHomePage(driver);
		hp.account();
		hp.accountprofile();
		AMZ_YourAccountPage accp=new AMZ_YourAccountPage(driver);
		accp.shoppingpreference();
		AMZLoginPage lp=new AMZLoginPage(driver);
		lp.username();
		lp.countinue_btton();
		lp.password();
		lp.sign_btn();
		AMZ_YourProfilePage pp=new AMZ_YourProfilePage(driver);
		pp.profilenamesclick();
		pp.changename();
		pp.continuebutton();
		pp.preferreddepartment();
		//pp.addbutton();
	}

}
