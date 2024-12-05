package Utils;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class FailRetry implements IRetryAnalyzer {
	
	int retryCount=0;
	@Override
	public boolean retry(ITestResult result) {
		
		if(!result.isSuccess() && retryCount<2) {
			retryCount++;
			System.out.println("retryCount: "+retryCount);
			return true;
		}
		
		return false;
	}

}


