package com.intabella.step_definitions;

import com.intabella.pages.VehicleOtometerPage;
import com.intabella.pages.vehiclepage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IN_247_US018_StepDefs {


    @Then("opening vehicles page")
    public void opening_vehicles_page() {
        vehiclepage vehicle = new vehiclepage();
        vehicle.fleetlink.click();
        BrowserUtils.waitFor(5);
        vehicle.vehicle.click();
        BrowserUtils.waitFor(5);
    }
    @When("Click the {string} icon on the right side of the page.")
    public void click_the_icon_on_the_right_side_of_the_page(String string) {
        vehiclepage vehicle = new vehiclepage();
        vehicle.favorıtebutton.click();
        BrowserUtils.waitFor(5);
    }
    @Then("{string} icon turned yellow.")
    public void icon_turned_yellow(String string) {
    /*    vehiclepage vehicle = new vehiclepage();
        vehicle.yellowfavorıte.click();
        BrowserUtils.waitFor(5);
     */
        vehiclepage yellow=new vehiclepage();
        yellow.yellowfavorıte.isDisplayed();
        BrowserUtils.waitFor(5);

    }
    @When("Click {string} icon\\(right side on the page) usernames's beside")
    public void click_icon_right_side_on_the_page_usernames_s_beside(String string) {
        vehiclepage vehicle = new vehiclepage();
        vehicle.beside.click();
        BrowserUtils.waitFor(5);
    }
    @Then("opened the pop-up page\\(include {string} options)")
    public void opened_the_pop_up_page_include_options(String options) {
       vehiclepage vehicle = new vehiclepage();
  /*      String expected = "Most Viewed";
        Assert.assertEquals(expected,vehicle.mostview.getText());
        //verify ediyoruz burada sayfadan değişmeyecek birşeyin konumu ile
*/


  //      String expected = "line52 de ne geldiyse onu yaz";
        System.out.println(vehicle.mostview.getText());
    //    Assert.assertEquals(expected,vehicle.mostview.getText());



    }
    @When("select the {string} option")
    public void select_the_option(String string) {
        vehiclepage vehicle = new vehiclepage();
        //vehicle.favoritesinrecent.click();
        vehicle.favoritesinrecent.isSelected(); //???
        BrowserUtils.waitFor(5);
    }

    @Then("Verify your page is under favorite list")
    public void verify_your_page_is_under_favorite_list() {
        vehiclepage vehicle = new vehiclepage();

      /*  String expected = "Car - Entities - System - Car - Entities - System";
        Assert.assertEquals(expected,vehicle.favoritebox.getText());
        */

//-------------------------------------------------------------------------------------------

    //    String expected = "line 70 te ne geldiyse o nu yaz";
        System.out.println("vehicle.favoritebox.getText() = " + vehicle.favoritebox.getText());//Yazı olarak ne diye geçiyorsa onu yazacağım
    //    Assert.assertEquals(expected, vehicle.favoritebox.getText());

//--------------------------------------------------------------------------------------------



    }
}



