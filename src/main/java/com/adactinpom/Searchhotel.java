package com.adactinpom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Searchhotel {
	public static WebDriver D;
	@FindBy(id="location")
	private WebElement loc;
	@FindBy(id="hotels")
	private WebElement hot;
	@FindBy(id="room_type")
	private WebElement rt;
	@FindBy(id="room_nos")
	private WebElement ro;
	@FindBy(id="datepick_in")
	private WebElement di;
	@FindBy(id="datepick_out")
	private WebElement dpo;
	@FindBy(id="adult_room")
	private WebElement ar;
	@FindBy(id="child_room")
	private WebElement cr;
	@FindBy(id="Submit")
	private WebElement sub;
	public Searchhotel(WebDriver d2) {
    this.D=d2;
    PageFactory.initElements(D,this);
	}
	public WebElement getLoc() {
		return loc;
	}
	public WebElement getHot() {
		return hot;
	}
	public WebElement getRt() {
		return rt;
	}
	public WebElement getRo() {
		return ro;
	}
	public WebElement getDi() {
		return di;
	}
	public WebElement getDpo() {
		return dpo;
	}
	public WebElement getAr() {
		return ar;
	}
	public WebElement getCr() {
		return cr;
	}
	public WebElement getSub() {
		return sub;
	}
	
	
	
}
