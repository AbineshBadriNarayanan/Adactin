package com.StepDef;

import org.openqa.selenium.WebDriver;

import com.Adactin.BaseClass;
import com.sdp.Adactinsdp;

import cucumber.api.java.en.*;
//import cucumber.api.java.en.Then;
//import cucumber.api.java.en.When;

public class Stepdefinition extends BaseClass {
	public static WebDriver D = browser("chrome");
	public static Adactinsdp ads = new Adactinsdp(D);
	
	@Given("^User Launch the Adactin Application$")
	public void user_Launch_the_Adactin_Application() throws Throwable {
		get("http://adactinhotelapp.com/index.php");
	}

	@When("^User Enter the \"([^\"]*)\" in the Username field$")
	public void user_Enter_the_in_the_Username_field(String username) throws Throwable {
		sendkey(ads.getLp().getUn(), username);
	}

	@When("^User Enter the \"([^\"]*)\" in the Password field$")
	public void user_Enter_the_in_the_Password_field(String password) throws Throwable {
		sendkey(ads.getLp().getPw(), password);
	}

	@Then("^User Click on the Login Button and it Navigates to the Search Hotel page$")
	public void user_Click_on_the_Login_Button_and_it_Navigates_to_the_Search_Hotel_page() throws Throwable {
		click(ads.getLp().getLg());
	}
	@When("^User select the locations$")
	public void user_select_the_locations() throws Throwable {
		Drop_Down(ads.getSea().getLoc(), "byvisibletext", "New York");
	}

	@When("^User select the hotels$")
	public void user_select_the_hotels() throws Throwable {
		Drop_Down(ads.getSea().getHot(), "byvisibletext", "Hotel Hervey");
	}

	@When("^User select the room type$")
	public void user_select_the_room_type() throws Throwable {
		Drop_Down(ads.getSea().getRt(), "byvisibletext", "Super Deluxe");
	}

	@When("^User select the number of rooms$")
	public void user_select_the_number_of_rooms() throws Throwable {
		Drop_Down(ads.getSea().getRo(), "byvalue", "2");
	}

	@When("^User enter the check in date$")
	public void user_enter_the_check_in_date() throws Throwable {
		sendkey(ads.getSea().getDi(), "05/11/2021");
	}

	@When("^User enter the check out date$")
	public void user_enter_the_check_out_date() throws Throwable {
		sendkey(ads.getSea().getDpo(), "06/11/2021");
	}

	@When("^User select the number of adults$")
	public void user_select_the_number_of_adults() throws Throwable {
		Drop_Down(ads.getSea().getAr(), "byvalue", "2");
	}

	@When("^User select the number of childrens$")
	public void user_select_the_number_of_childrens() throws Throwable {
		Drop_Down(ads.getSea().getCr(), "byvalue", "2");
	}

	@Then("^user Click the Search button and it Navigates to Select hotel page$")
	public void user_Click_the_Search_button_and_it_Navigates_to_Select_hotel_page() throws Throwable {
		click(ads.getSea().getSub());
	}

	@When("^user select the ratio button$")
	public void user_select_the_ratio_button() throws Throwable {
		click(ads.getSh().getRb());
		
	}

	@Then("^user click the Continue button and it navigates to Book A Hotel page$")
	public void user_click_the_Continue_button_and_it_navigates_to_Book_A_Hotel_page() throws Throwable {
		click(ads.getSh().getCo());
		}

}
