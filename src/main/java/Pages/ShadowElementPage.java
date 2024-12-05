package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;

import commonMethods.BaseClass;

public class ShadowElementPage extends BaseClass{

	
	public void performActionOnshadomDOM() {
		SearchContext shadowRoot = getDriver().findElement(By.cssSelector("#shadow_host")).getShadowRoot();
		System.out.println(shadowRoot.findElement(By.cssSelector("#shadow_content")).getText());
		WebElement element2 = shadowRoot.findElement(By.cssSelector("#nested_shadow_host"));
		WebElement element = shadowRoot.findElement(By.cssSelector("input[type='text']"));
		System.out.println(element2.getText());
		element.sendKeys("hello!!!");
		WebElement uploadfile = shadowRoot.findElement(By.cssSelector("input[type='file']"));
		uploadfile.sendKeys("C:\\Users\\Prabhakaran Chandran\\Documents\\test1.txt");
		
	}
}


