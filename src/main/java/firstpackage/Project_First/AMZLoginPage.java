package firstpackage.Project_First;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.apache.poi.ss.util.NumberToTextConverter;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AMZLoginPage 
{
	WebDriver driver;
	@FindBy(id="ap_email")
	WebElement un ;

	@FindBy(xpath="//span[@id='continue']")
	WebElement continue1;
	
	@FindBy(id="ap_password")
	WebElement pwd ;

	@FindBy(xpath="//span[@id='auth-signin-button']")
	WebElement loginsign;
	
	public void username()
	{
		un.sendKeys("+17472268271");
	}
	public void username1()
	{
		un.sendKeys("rahul25.srjavadev@gmail.com");
	}
	public void countinue_btton()
	{
		continue1.click();
	}
	public void password() throws InterruptedException
	{
		Thread.sleep(2000);
		pwd.sendKeys("Humaninterface@123");
		//pwd.sendKeys("Abhi@232501PV");
	}
	public void password1() throws InterruptedException
	{
		Thread.sleep(2000);
		pwd.sendKeys("Abhi@232501PV");
	}
	public void invalidUsername() throws EncryptedDocumentException, IOException
	{
		FileInputStream f=new FileInputStream("C:\\Users\\hp230\\eclipse-workspace\\Project_First\\ExcelSheets\\logindetails.xlsx");
		Workbook w=WorkbookFactory.create(f);
		String uname=NumberToTextConverter.toText(w.getSheet("invaliddetails").getRow(1).getCell(0).getNumericCellValue());
		un.sendKeys(uname);
	}
	public void invalidPassword() throws EncryptedDocumentException, IOException 
	{
		FileInputStream f=new FileInputStream("C:\\Users\\hp230\\eclipse-workspace\\Project_First\\ExcelSheets\\logindetails.xlsx");
		Workbook w=WorkbookFactory.create(f);
		String pass=w.getSheet("invaliddetails").getRow(1).getCell(1).getStringCellValue();
		pwd.sendKeys(pass);	
	}
	public void sign_btn() throws InterruptedException
	{
		Thread.sleep(3000);
		loginsign.click();
	}
	public  AMZLoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
