package testCases;

import org.testng.annotations.Test;

import Pages.DownLoadPFDFPage;
import commonMethods.BaseClass;

public class TC004_DownloadPDF extends BaseClass{

	@Test
	public void performDownlOAd() {

		new DownLoadPFDFPage()
		.clickandDownLoadPDF();
	}
}
