package firstpackage.Project_First;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AMZCreateAccount {

	WebDriver driver;

	@FindBy(id = "ap_customer_name")
	WebElement customername;

	@FindBy(name = "countryCode")
	WebElement countrycode;

	@FindBy(id = "ap_phone_number")
	WebElement mobileno;

	@FindBy(id = "ap_password")
	WebElement password;

	@FindBy(xpath = "//div[@class='a-section a-spacing-extra-large ap_mobile_number_fields']")
	WebElement verifymobile;

	public AMZCreateAccount(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	public void cstmname() {
		customername.sendKeys("Sowmya");
	}

	public void countryCode() {
		Select s = new Select(countrycode);
		s.selectByValue("US");

		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		wait.until(ExpectedConditions.elementToBeClickable(countrycode));

		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		WebElement mobileNumberLabel = driver.findElement(By.cssSelector("label[for='ap_phone_number']"));
		mobileNumberLabel.click();
	}

	public void mobileNumber() {
		WebDriverWait wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
		WebElement mobileNumberField = wait
				.until(ExpectedConditions.visibilityOfElementLocated(By.id("ap_phone_number")));
		mobileNumberField.sendKeys("7472268271");

		WebElement bodyElement = driver.findElement(By.tagName("body"));
		bodyElement.click();
	}

	public void pwd() {
		password.sendKeys("Humaninterface@123");
	}

	public void verifyMobileNumber() {
		verifymobile.click();
	}

}
