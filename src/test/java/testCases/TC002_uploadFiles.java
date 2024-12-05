package testCases;

import org.testng.annotations.Test;

import Pages.UploadFilesPage;
import Utils.FailRetry;
import commonMethods.BaseClass;

public class TC002_uploadFiles extends BaseClass {
	
	@Test(retryAnalyzer = FailRetry.class,invocationCount = 3)
	public void peformSingleUploadFile() throws InterruptedException {
		
		new UploadFilesPage()
		.uploadSingleFile()
		.getStatusOFSingleFileUpload();
		

	}
	
	@Test(retryAnalyzer = FailRetry.class,invocationCount = 5)
	public void performMutipleUploadFiles() throws InterruptedException {
		
		new UploadFilesPage()
		.uploadMultipleFiles()
		.verifyMultipleFilesUpload();
		

	}
	
	
	

}
