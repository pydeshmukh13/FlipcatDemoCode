package com.qa.flipcart.test;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.flipcart.Util.Constants;
import com.qa.flipcart.base.BaseTest;

public class LoginPageTest extends BaseTest {

	@Test
	public void verifyLoginPageTitleTest() {
		String title=loginPage.getLoginPageTitle();	
		System.out.println(title);
		Assert.assertEquals(title, Constants.LOGIN_PAGE_TITLE);
	}


	@Test
	public void verifyFlipcartLogoIsExistTest() {
		Assert.assertTrue(loginPage.getLoginPageLOGO());
	}


	@Test
	public void verifyForgotLinkExistTest() {
		Assert.assertTrue(loginPage.isForgotLinkExist());
	}
	
	@Test
	public void DoLoginTest() {
		loginPage.doLoginMethod(prop.getProperty("username"), prop.getProperty("password"));
	}
}
