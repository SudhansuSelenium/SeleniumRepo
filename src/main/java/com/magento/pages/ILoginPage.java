package com.magento.pages;

import org.openqa.selenium.WebElement;

public interface ILoginPage {

	void doLoginPage();
	WebElement getLinkAccount();
	WebElement getTxtUserId();
	WebElement getTxtPassWord();

}
