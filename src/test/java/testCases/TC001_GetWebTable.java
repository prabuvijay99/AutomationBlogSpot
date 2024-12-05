package testCases;

import org.testng.annotations.Test;

import Pages.WebTablePage;
import Utils.FailRetry;
import commonMethods.BaseClass;

public class TC001_GetWebTable extends BaseClass {
		
		@Test(retryAnalyzer = FailRetry.class,invocationCount = 3)
		public void performStaticWebTable() {
			
			new WebTablePage()
			.getTableData();

		}
		
		
		@Test(retryAnalyzer = FailRetry.class,invocationCount = 2)
		public void performDyanmicWebTable() {
			
			new WebTablePage()
			.getDynamicTable();

		}
		
		
		@Test(retryAnalyzer = FailRetry.class,invocationCount = 5)
		public void performPaginationWebTable() {
			
			new WebTablePage()
			.getPaginationTable();

		}
	

}
