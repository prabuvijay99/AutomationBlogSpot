package Pages;

import org.openqa.selenium.By;

import commonMethods.BaseClass;

public class DownLoadPFDFPage extends BaseClass {

	
	public void clickandDownLoadPDF() {
		
		getDriver().findElement(By.xpath("//a[normalize-space()='Download Files']")).click();
		
		getDriver().findElement(By.xpath("//button[text()='Download PDF File']")).click();

	}
	
}
