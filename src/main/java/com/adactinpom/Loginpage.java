package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
	public static WebDriver D;
	
	@FindBy(id="username")
	private WebElement un;
	@FindBy(id="password")
	private WebElement pw;
	@FindBy(id="login")
	private WebElement lg;
	
	public Loginpage(WebDriver d2) {
		this.D=d2;
		PageFactory.initElements(D, this);
	}
	
	public WebElement getUn() {
		return un;
	}
	public WebElement getPw() {
		return pw;
	}
	public WebElement getLg() {
		return lg;
	}
}