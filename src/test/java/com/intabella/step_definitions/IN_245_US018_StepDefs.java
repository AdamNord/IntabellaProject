package com.intabella.step_definitions;

import com.intabella.pages.VehicleOtometerPage;
import com.intabella.pages.vehiclepage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IN_245_US018_StepDefs {

    @When("user navigated to {string} tab {string} module")
    public void user_navigated_to_tab_module(String string, String string2) {
        VehicleOtometerPage vehicleOtometerPage=new VehicleOtometerPage();

        vehicleOtometerPage.menuOptions.click(); //fleet
        BrowserUtils.waitFor(5);

        vehicleOtometerPage.vehicleodometer.click(); //vehicle otometer
        BrowserUtils.waitFor(5); //explicit wait sanırım?

    }

    @When("Click the plus button on the right sidebar")
    public void click_the_plus_button_on_the_right_sidebar() {
        VehicleOtometerPage clickplus=new VehicleOtometerPage();
        BrowserUtils.waitFor(5);
        clickplus.plussign.click();


    }

    @Then("opening {string} box")
    public void opening_box(String string) {
//???"görünür" de ne ile assert edilir

      VehicleOtometerPage sidebarboxx=new VehicleOtometerPage();
      sidebarboxx.sidebarbox.isDisplayed();
        BrowserUtils.waitFor(5);


    }

    //???Burada birtane algılamış,genellemiş.Halbuki 3 tane var. scenerioya bakınca görünür.Burada ne yapacağız?
    @When("Click {string} button, corresponding to {string}")
    public void click_button_corresponding_to(String string, String string2) {
        VehicleOtometerPage adition=new VehicleOtometerPage();
        adition.recent_email_addition.click();
        BrowserUtils.waitFor(5);

    }

    //???bunu da herbirine uygulayacak.Halbuki herbiri farklı artıyor.(2 den 3---3den 4e---1den 2 ye gibi)
    @Then("The counter number beside the added text counted")
    public void the_counter_number_beside_the_added_text_counted() {
        //??????????????
    }

    @Then("Click close button")
    public void click_close_button() {
    VehicleOtometerPage closebutton=new VehicleOtometerPage();
    closebutton.closebutton.click();
    BrowserUtils.waitFor(5);
    }

    @Then("Verify {string},{string},{string} were added to sidebar")
    public void verify_were_added_to_sidebar(String string, String string2, String string3) {

        //?????????

        VehicleOtometerPage stickynotes=new VehicleOtometerPage();
        stickynotes.forverificationSTİCKYNOTE.isDisplayed();


        VehicleOtometerPage tasklist=new VehicleOtometerPage();
        tasklist.forverificationTASKLİST.isDisplayed();

        VehicleOtometerPage recentemail=new VehicleOtometerPage();
        recentemail.forverificationRECENTEMAİL.isDisplayed();

    }

}
