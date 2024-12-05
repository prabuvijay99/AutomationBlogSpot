package testCases;

import org.testng.annotations.Test;

import Pages.ShadowElementPage;
import commonMethods.BaseClass;

public class TC003_ShadowDOM extends BaseClass{

	@Test
	public void performShadowDom() {
		new ShadowElementPage()
		.performActionOnshadomDOM();

	}
}
