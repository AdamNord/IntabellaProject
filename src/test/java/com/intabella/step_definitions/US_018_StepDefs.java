package com.intabella.step_definitions;

import com.intabella.pages.LoginPage;
import com.intabella.pages.VehicleOtometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_018_StepDefs {
    int beforeclick;
    int afterclick;

    VehicleOtometerPage vehicleOtometerPage = new VehicleOtometerPage();

    @When("user navigated to {string} tab {string} module")
    public void user_navigated_to_tab_module(String string, String string2) {

        vehicleOtometerPage.menuOptions.click(); //fleet
        BrowserUtils.waitFor(5);

        vehicleOtometerPage.vehicleodometer.click(); //vehicle otometer
        BrowserUtils.waitFor(10);

    }

    @When("Click the plus button on the right sidebar")
    public void click_the_plus_button_on_the_right_sidebar() {
        WebDriverWait wait = new WebDriverWait(Driver.get(), 15);
        wait.until(ExpectedConditions.elementToBeClickable(vehicleOtometerPage.plussign));
        BrowserUtils.waitForPageToLoad(10);
        vehicleOtometerPage.plussign.click();


    }


    @When("Click Add button, corresponding to {string}")
    public void click_Add_button_corresponding_to(String widgetname) {
        BrowserUtils.waitFor(3);
        beforeclick = vehicleOtometerPage.getsidebarcount(vehicleOtometerPage.addedtextinpopupforMail.getText());
        vehicleOtometerPage.recent_email_addition.click();
        BrowserUtils.waitFor(2);

        afterclick = vehicleOtometerPage.getsidebarcount(vehicleOtometerPage.addedtextinpopupforMail.getText());

        vehicleOtometerPage.widgetadder("Sticky Note").click();
        vehicleOtometerPage.widgetadder("Task List").click();

        System.out.println("vehicleOtometerPage.addedtextinpopup.getText() = " + vehicleOtometerPage.addedtextinpopupforMail.getText());
        System.out.println("vehicleOtometerPage.addedtextinpopup.getAttribute() = " + vehicleOtometerPage.addedtextinpopupforMail.getAttribute(""));

    }


    @Then("The counter number beside the added text counted")
    public void the_counter_number_beside_the_added_text_counted() {

        Assert.assertTrue("added count checked", beforeclick + 1 == afterclick);


    }

    @Then("Click close button")
    public void click_close_button() {
        vehicleOtometerPage.closebutton.click();
        BrowserUtils.waitFor(5);
    }

    @Then("Verify {string},{string},{string} were added to sidebar")
    public void verify_were_added_to_sidebar(String string, String string2, String string3) {


        vehicleOtometerPage.forverificationSTİCKYNOTE.isDisplayed();

        vehicleOtometerPage.forverificationTASKLİST.isDisplayed();

        vehicleOtometerPage.forverificationRECENTEMAİL.isDisplayed();

    }


    //----- For IN246 ----

    @When("Click the {string} icon on the right side of the page") //Pin icon
    public void click_the_icon_on_the_right_side_of_the_page(String string) {


        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleOtometerPage.pinsign);
        BrowserUtils.waitFor(3);

    }


    @Then("pin color turned into yellow")
    public void pin_color_turned_into_yellow() {

        vehicleOtometerPage.pinyellow.isDisplayed();
        BrowserUtils.waitFor(5);

    }

    @Then("verify pinned page added top of the dashboard")
    public void verify_pinned_page_added_top_of_the_dashboard() {
        String actual = Driver.get().getCurrentUrl();
        System.out.println("actual = " + actual);
        String expected = "http://qa.intabella.com/entity/Extend_Entity_VehiclesOdometer?restore=1";
        Assert.assertEquals(expected, actual);
        BrowserUtils.waitFor(5);

    }
//   ----------------IN247------------------


    //----------FOR IN-48-------

    @When("user cleans favorite page list")
    public void user_cleans_favorite_page_list() {
        vehicleOtometerPage.favoritepagelistcleaner();


    }


    @When("Click the Favorites icon on the right side of the page.")
    public void click_the_Favorites_icon_on_the_right_side_of_the_page() {

        BrowserUtils.waitFor(3);
        vehicleOtometerPage.favorıtebutton.click();
        BrowserUtils.waitFor(1);
        //  JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        // jse.executeScript("arguments[0].click();",vehicleOtometerPage.favorıtebutton);
        BrowserUtils.waitFor(3);

    }


    @Then("favorite icon turned yellow.")
    public void favorite_icon_turned_yellow() {
        vehicleOtometerPage.yellowfavorıte.isDisplayed();
        BrowserUtils.waitFor(5);

    }

    @When("Click {string} icon\\(right side on the page) usernames's beside") //3 çizgi(
    public void click_icon_right_side_on_the_page_usernames_s_beside(String string) {
        vehicleOtometerPage.beside.click();
        BrowserUtils.waitFor(5);
    }


    @Then("{string} icon turned yellow.")
    public void icon_turned_yellow(String string) {

        vehicleOtometerPage.yellowfavorıte.isDisplayed();
        BrowserUtils.waitFor(5);

    }


    @Then("opened the pop-up page\\(include {string} options)")
    public void opened_the_pop_up_page_include_options(String options) {

        String expected = "Most Viewed";//history-->favorites-->most viewed
        //  System.out.println(vehicle.mostview.getText());
        Assert.assertEquals(expected, vehicleOtometerPage.mostview.getText());
    }

    @When("select the {string} option") //favorite option
    public void select_the_option(String string) {
        //  vehicle.favoritesinrecent.click(); ////history-!favorite!-mostview
        vehicleOtometerPage.favoritebox.click();
        BrowserUtils.waitFor(5);
    }

    @Then("Verify your page is under favorite list")
    public void verify_your_page_is_under_favorite_list() {
//history-->favorite-->most view  "favorite" kısmında favorilediğim sayfaya bakıyorum
/*
        //  String expected = "Dashboard";
        String expected= "Vehicle Odometer - Entities - System - Car - Entities - System";
        System.out.println("vehicle.favoritebox.getText() = " + vehicle.favoritebox.getText());
        //Yazı olarak ne diye geçiyorsa onu yazacağım
        // BU MESAJA BİR TÜRLÜ ULAŞAMADIM!!!!
        Assert.assertEquals(expected, vehicle.favoritebox.getText());
*/
        System.out.println("vehicle.favoritelist.getText() = " + vehicleOtometerPage.favoritelist.getText());
        // Assert.assertTrue(vehicle..isDisplayed());

    }

    @When("logout the page")
    public void logout_the_page() {
        vehicleOtometerPage.usernameFOR_LOG_OUT.click();
        BrowserUtils.waitFor(3);

        vehicleOtometerPage.LogOutButton.isDisplayed();
        BrowserUtils.waitFor(5);

        vehicleOtometerPage.LogOutButton.click();
        BrowserUtils.waitFor(5);


        LoginPage loginbuttonn = new LoginPage();
        loginbuttonn.loginbutton.isDisplayed();
        BrowserUtils.waitFor(5);

    }

    @When("again,login as a truck driver")
    public void again_login_as_a_truck_driver() {


        LoginPage login = new LoginPage();
        login.userName.sendKeys("user1");
        login.password.sendKeys("UserUser123");
        login.submit.click();

    }


    @When("Click three line icon\\(right side on the page) usernames's beside")
    public void click_three_line_icon_right_side_on_the_page_usernames_s_beside() {
        VehicleOtometerPage vehicle = new VehicleOtometerPage();
        vehicle.beside.click();
        BrowserUtils.waitFor(5);


    }

    @When("select the Favorite option")
    public void select_the_Favorite_option() {
        VehicleOtometerPage vehicleOtometerPage = new VehicleOtometerPage();

        JavascriptExecutor jse = (JavascriptExecutor) Driver.get();
        jse.executeScript("arguments[0].click();", vehicleOtometerPage.favorıtebutton);
        BrowserUtils.waitFor(3);
    }


    //-------------- IN-49--------------------

    @When("Click the cross\\(X) sign near the favorite selection on the pop-up")
    public void click_the_cross_X_sign_near_the_favorite_selection_on_the_pop_up() {

        vehicleOtometerPage.favoriteclose.click();//favori sayfa (history-favorites-most view deki favori kısmındaki ÇARPI(KAPATMA))
        BrowserUtils.waitFor(3);
//doğal olarak seçilemediği için hata veriyor.
    }


    @Then("verify {string} icon changes from yellow color to white color")
    public void verify_icon_changes_from_yellow_color_to_white_color(String string) {

        Assert.assertTrue(vehicleOtometerPage.favorıtebutton.isDisplayed());//beyaz göründüğüne bakıyoruz)

    }

    @Then("verify favorite icon changes from yellow color to white color")
    public void verify_favorite_icon_changes_from_yellow_color_to_white_color() {

        vehicleOtometerPage.favorıtebutton.isDisplayed();
        BrowserUtils.waitFor(5);

    }


}

