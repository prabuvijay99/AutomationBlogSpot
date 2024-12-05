package Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import commonMethods.BaseClass;

public class WebTablePage extends BaseClass {	
	
	
	public WebTablePage getTableData() {
		List<WebElement> row = getDriver().findElements(By.xpath("//table[@name='BookTable']//tr"));
		List<WebElement> column = getDriver().findElements(By.xpath("//table[@name='BookTable']//tr/th"));
		
		for(int i=2;i<=row.size();i++) {
			for(int j=1;j<=column.size();j++) {
				
				WebElement tableData = getDriver().findElement(By.xpath("//table[@name='BookTable']//tr["+i+"]/td["+j+"]"));
				System.out.print(tableData.getText()+"  ");
				
			}
			System.out.println();
		}
		return this;

	}
	
	
	public WebTablePage getDynamicTable() {
		
		List<WebElement> row = getDriver().findElements(By.xpath("//table[@id='taskTable']//tr"));
		List<WebElement> column = getDriver().findElements(By.xpath("//table[@id='taskTable']//tr//th"));
		System.out.println(row.size()+"-"+column.size());
		
		for(int i=1;i<=row.size();i++) {
			for(int j=1;j<=column.size();j++) {
				
				WebElement tableData = getDriver().findElement(By.xpath("//table[@id='taskTable']//tr["+i+"]/td["+j+"]"));
				System.out.print(tableData.getText()+"  ");
				
			}
			System.out.println();
		}
		return this;

	}
	
	
	public void getPaginationTable() {
		int pageSize = getDriver().findElements(By.xpath("//ul[@id='pagination']//li")).size();
		for(int p=1;p<=pageSize;p++) {
			
			if(p>1) {
				System.out.println("page no"+p);
				WebElement currentPage = getDriver().findElement(By.xpath("//ul[@id='pagination']//li["+p+"]"));
				currentPage.click();
			}
			
			
			List<WebElement> row = getDriver().findElements(By.xpath("//table[@id='productTable']//tr"));
			List<WebElement> column = getDriver().findElements(By.xpath("//table[@id='productTable']//tr//th"));
			System.out.println(row.size()+"-"+column.size());
			
			for(int i=1;i<row.size();i++) {
				for(int j=1;j<=column.size();j++) {
					
					WebElement tableData = getDriver().findElement(By.xpath("//table[@id='productTable']//tr["+i+"]/td["+j+"]"));
					System.out.print(tableData.getText()+"  ");
					
				}
				System.out.println();
		}
		
		
		

	}

	}


}