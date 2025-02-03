package firstpackage.Project_First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.RemoteWebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZ_YourProfilePage {

	@FindBy(xpath = "//button[@class='edit-pencil-icon-button']")
	WebElement profilename;

	@FindBy(id = "editProfileNameInputId")
	WebElement changenametxtfld;

	@FindBy(xpath = "(//input[@class='a-button-input'])[3]")
	WebElement continuebtn;

	@FindBy(xpath = "//button[@class='edit-profile-cancel-button-wrapper']")
	WebElement cancelbtn;

	@FindBy(xpath = "(//div[@class='accordion-trigger-content desktop'])[1]")
	WebElement preferreddeprt;

	@FindBy(xpath = "(//div[@class='accordion-content']//button[text()='Add'])[1]")
	WebElement addbtn;

	@FindBy(xpath = "//button[.='Women']")
	WebElement womenbtn;

	@FindBy(xpath = "//span[@class='a-button a-button-normal a-button-primary button']")
	WebElement savebtn;

	@FindBy(xpath = "(//div[@class='accordion-trigger-content desktop'])[2]")
	WebElement heightandweight;

	@FindBy(xpath = "(//button[@class='attribute-action'])[3]")
	WebElement addbtn2;

	@FindBy(xpath = "(//button[@class='attribute-action'])[2]")
	WebElement clearbtn;

	@FindBy(xpath = "//span[@class=\"a-button clear-confirmation-button desktop\"]")
	WebElement yesclear_btn;

	public void profilenamesclick() throws InterruptedException {
		profilename.click();
		Thread.sleep(2000);
	}

	public void changename() throws InterruptedException {
		changenametxtfld.clear();
		Thread.sleep(3000);
		changenametxtfld.sendKeys("sowmya parsi");
	}

	public void continuebutton() {
		continuebtn.click();
	}

	public void cancelbtn() {
		cancelbtn.click();
	}

	public void preferreddepartment() throws InterruptedException {
		Thread.sleep(2000);
		preferreddeprt.click();
	}

	public void addbutton() throws InterruptedException {
		Thread.sleep(3000);
		System.out.println("Enter thr add method");
		if (addbtn.isDisplayed()) {
			System.out.println("Add button is displayed");
			addbtn.click();
			Thread.sleep(2000);
			womenbtn.click();
			savebtn.click();
		} else {
			System.out.println("Add button is not displayed");
			clearbtn.click();
			Thread.sleep(3000);
			yesclear_btn.click();
		}
	}

	public AMZ_YourProfilePage(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
}
