package firstpackage.Project_First;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class RetryLogicClass implements IRetryAnalyzer
{
	int inital=0,finalcount=2;
	@Override
	public boolean retry(ITestResult result) 
	{
		if(inital<=finalcount)
		{
			inital++;
		return true;
	}
	return false;
	}
}



