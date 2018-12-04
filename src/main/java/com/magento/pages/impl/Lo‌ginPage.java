package com.magento.pages.impl;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.magento.pages.ILoginPage;
import com.magento.testbase.Hooks;
import com.magento.util.PauseUtil;

public class Lo‌ginPage implements ILoginPage {

	// initialize the Page
	public Lo‌ginPage() {

		PageFactory.initElements(Hooks.driver, this);
	}

	// OR
	@FindBy(xpath = "//span[contains(text(),'Account')]")
	private WebElement account;

	public WebElement getLinkAccount() {
		return account;
	}

	// Actions
	public void doLoginPage() {
		PauseUtil.pause(1000);
		account.click();

	}

	public WebElement getTxtUserId() {
		// TODO Auto-generated method stub
		return null;
	}

	public WebElement getTxtPassWord() {
		// TODO Auto-generated method stub
		return null;
	}

}
