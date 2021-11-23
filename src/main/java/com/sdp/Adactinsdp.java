package com.sdp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import com.adactinpom.Bookahotel;
import com.adactinpom.Bookcon;
import com.adactinpom.Loginpage;
import com.adactinpom.Logout;
import com.adactinpom.Searchhotel;
import com.adactinpom.Selecthotel;

public class Adactinsdp {
	public static WebDriver D;
	private Loginpage lp;
	private Searchhotel sea;
	private Selecthotel sh;
	private Bookahotel bak;
	private Bookcon bc;
	private Logout lg;
	public Adactinsdp(WebDriver d2) {
    this.D=d2;
    PageFactory.initElements(D, this);
	
	}
	public Loginpage getLp() {
		lp = new Loginpage(D);
		return lp;
	}
	public Searchhotel getSea() {
		sea= new Searchhotel(D);
		return sea;
	}
	public Selecthotel getSh() {
		sh=new Selecthotel(D);
		return sh;
	}
	public Bookahotel getBak() {
		bak = new Bookahotel(D);
		return bak;
	}
	public Bookcon getBc() {
		 bc = new Bookcon(D);
		return bc;
	}
	public Logout getLg() {
		lg = new Logout(D);
		return lg;
	}
	

}
