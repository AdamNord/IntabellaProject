package com.intabella.step_definitions;

import com.intabella.pages.HomePage;
import com.intabella.pages.VehicleOdometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.ConfigurationReader;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Wait;

import java.util.concurrent.TimeUnit;

public class US19TDCreateOdometerStepDefs {

    @When("the user navigate to Fleet module and click on the Vehicle Odometer")
    public void the_user_navigate_to_Fleet_module_and_click_on_the_Vehicle_Odometer() throws InterruptedException {
        HomePage homePage = new HomePage();
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(homePage.fleetTab).perform();
        Driver.get().manage().timeouts().implicitlyWait(2, TimeUnit.SECONDS);
        homePage.vehicleOdometerModule.click();
        System.out.println("the user navigate to Fleet module and click on the Vehicle Odometer");

    }

    @Then("the user should navigate to Vehicles Odometers page")
    public void the_User_Should_Navigate_To_Vehicles_Odometers_Page() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Vehicle Odometer - Entities - System - Car - Entities - System", actualTitle);
    }

    @When("the user click on the Create Vehicle Odometer")
    public void the_User_Click_On_The_Create_Vehicle_Odometer() {
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.createVehicleOdometerBtn.click();
    }

    @Then("the user should navigate to Create Vehicle Odometer page")
    public void the_user_should_navigate_to_Create_Vehicle_Odometer_page() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Create Vehicle Odometer - Entities - System - Car - Entities - System", actualTitle);
    }

    @When("the user updated the values and click on the Save and Close")
    public void the_user_updated_the_values_and_click_on_the_Save_and_Click() {
        new VehicleOdometerPage().saveAndCloseBtn.click();

    }

//    @Then("Entity saved should appear at the top of the page")
//    public void entity_saved_should_appear_at_the_top_of_the_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new io.cucumber.java.PendingException();
//    }


}
