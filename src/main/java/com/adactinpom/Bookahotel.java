package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Bookahotel {
	public static WebDriver D;
	@FindBy(id="first_name")
	private WebElement fn;
	@FindBy(id="last_name")
	private WebElement ln;
	@FindBy(id="address")
	private WebElement add;
	@FindBy(id="cc_num")
	private WebElement cc;
	@FindBy(id="cc_type")
	private WebElement ct;
	@FindBy(id="cc_exp_month")
	private WebElement em;
	@FindBy(id="cc_exp_year")
	private WebElement ey;
	@FindBy(id="cc_cvv")
	private WebElement cvv;
	@FindBy(id="book_now")
	private WebElement bn;
	public Bookahotel(WebDriver d2) {
    this.D=d2;
    PageFactory.initElements(D, this);
	}
	public WebElement getFn() {
		return fn;
	}
	public WebElement getLn() {
		return ln;
	}
	public WebElement getAdd() {
		return add;
	}
	public WebElement getCc() {
		return cc;
	}
	public WebElement getCt() {
		return ct;
	}
	public WebElement getEm() {
		return em;
	}
	public WebElement getEy() {
		return ey;
	}
	public WebElement getCvv() {
		return cvv;
	}
	public WebElement getBn() {
		return bn;
	}
	
}
