package com.intabella.step_definitions;

import com.intabella.pages.VehicleOdometerPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US19DriverAddLicensePlate224 {

    @When("the user click on the Add button")
    public void the_user_click_on_the_Add_button() {
        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        vehicleOdometerPage.addBtn.click();

    }

//    @Then("the user should navigate to Select Carreservation page")
//    public void the_user_should_navigate_to_Select_Carreservation_page() {
//        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
//        String actualTitle = vehicleOdometerPage.titleSelectCarReservation.getText();
//        Assert.assertEquals("Select Carreservation",actualTitle);
//        System.out.println("Correct title");
//    }
//
//    @When("the user checked the checkbox of the related license plate and click on the Select button")
//    public void the_user_checked_the_checkbox_of_the_related_license_plate_and_click_on_the_Select_button() {
//        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
//        vehicleOdometerPage.checkBox.click();
//        Assert.assertTrue(vehicleOdometerPage.checkBox.isSelected());
//        vehicleOdometerPage.selectBtn.click();
//    }

    @Then("the selected license plate should appear on the screen")
    public void the_selected_license_plate_should_appear_on_the_screen() {


    }

    @When("the user click on the Save and Click")
    public void the_user_click_on_the_Save_and_Click() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
