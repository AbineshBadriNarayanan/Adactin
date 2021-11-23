package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Logout {
	public static WebDriver D;
	@FindBy(id="logout")
	private WebElement log;

	public Logout(WebDriver d2) {
    this.D =d2;
    PageFactory.initElements(D, this);
	
	}

	public WebElement getLog() {
		return log;
	}
	

}
