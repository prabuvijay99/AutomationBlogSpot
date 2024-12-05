package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import commonMethods.BaseClass;

public class UploadFilesPage extends BaseClass {

	public WebDriverWait wait = new WebDriverWait(getDriver(), Duration.ofSeconds(10));

	public UploadFilesPage uploadSingleFile() throws InterruptedException {

		WebElement clickChoose = getDriver().findElement(By.id("singleFileInput"));
		clickChoose.sendKeys("C:\\Users\\Prabhakaran Chandran\\Documents\\test1.txt");
		getDriver().findElement(By.xpath("//button[text()='Upload Single File']")).click();
		return this;

	}

	public UploadFilesPage getStatusOFSingleFileUpload() {
		WebElement message = getDriver().findElement(By.id("singleFileStatus"));
		wait.until(ExpectedConditions.visibilityOf(message));
		boolean displayed = message.isDisplayed();
		Assert.assertTrue(displayed);
		return this;

	}

	public UploadFilesPage uploadMultipleFiles() throws InterruptedException {
		WebElement clickChoose = getDriver().findElement(By.id("multipleFilesInput"));
		String File1 = "C:\\Users\\Prabhakaran Chandran\\Documents\\test1.txt";
		String File2 = "C:\\Users\\Prabhakaran Chandran\\Documents\\test1.txt";
		clickChoose.sendKeys(File1 + "\n" + File2);

		getDriver().findElement(By.xpath("//button[text()='Upload Multiple Files']")).click();
		return this;

	}

	public UploadFilesPage verifyMultipleFilesUpload() {

		boolean displayed = getDriver().findElement(By.id("multipleFilesStatus")).isDisplayed();
		Assert.assertTrue(displayed);
		return this;

	}

}
