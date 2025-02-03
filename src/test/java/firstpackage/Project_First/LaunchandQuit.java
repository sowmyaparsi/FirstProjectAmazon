package firstpackage.Project_First;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class LaunchandQuit extends ListenerClass
{

	@BeforeMethod
	@Parameters("browser")
	public void launch(String browsername) throws InterruptedException 
	{
		switch(browsername) 
		{
		case "chrome":
			driver=new ChromeDriver();
			break;
		case "edge":
			driver=new EdgeDriver();
			break;
		case "firefox":
			driver=new FirefoxDriver();
			break;
		}	
		driver.get("https://www.amazon.in");
		Thread.sleep(3000);
		driver.manage().window().maximize();
	}

	@AfterMethod
	public void quit() {
		//driver.close();
	}
}
