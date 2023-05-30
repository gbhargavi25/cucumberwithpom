package com.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	WebDriver driver;

	public HomePage(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}

	@FindBy(xpath ="(//li[@class='dropdown'])[1]")
	private WebElement myAccountDropMenu;

	@FindBy(linkText = "Login")
	private WebElement loginOption;

	@FindBy(linkText = "Register")
	private WebElement registerOption;

	@FindBy(name = "search")
	private WebElement searchBoxField;

	@FindBy(xpath = "//button[contains(@class,'btn-default')]")
	private WebElement searchButton;

	public void clickOnMyAccount() {

		myAccountDropMenu.click();

	}

	public LoginPage selectLoginOption() {

		loginOption.click();
		return new LoginPage(driver);

	}

	public RegisterPage selectRegisterOption() {
		registerOption.click();
		return new RegisterPage(driver);

	}

	public void enterProductIntoSearchBox(String productText) {

		searchBoxField.sendKeys(productText);

	}

	public SearchResultsPage clickOnSearchButton() {

		searchButton.click();
		return new SearchResultsPage(driver);

	}

}
