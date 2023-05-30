package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AccountPage {
	WebDriver driver;

	public AccountPage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath="//ul[@class='list-unstyled']/li/a[contains(text(),'Edit your account information')]")
	private WebElement editYourAccountInformationOption;

	public boolean displayStatusOfEditYourAccountInformationOption() throws InterruptedException {
		Thread.sleep(1000);
		return editYourAccountInformationOption.isDisplayed();

	}

}
