package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookcon {
	public static WebDriver D;
	@FindBy(id="my_itinerary")
	private WebElement my;

	public Bookcon(WebDriver d2) {
    this.D=d2;
    PageFactory.initElements(D, this);
	
	}

	public WebElement getMy() {
		return my;
	}
}
