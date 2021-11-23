package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Selecthotel {
	public static WebDriver D;
	@FindBy(id="radiobutton_0")
	private WebElement rb;
	@FindBy(id="continue")
	private WebElement co;
	public Selecthotel(WebDriver d2) {
   this.D=d2;
   PageFactory.initElements(D, this);
	}
	public WebElement getRb() {
		return rb;
	}
	public WebElement getCo() {
		return co;
	}
	

}
