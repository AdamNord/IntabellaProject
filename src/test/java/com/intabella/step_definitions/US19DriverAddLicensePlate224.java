package com.intabella.step_definitions;

import com.intabella.pages.CreateVehicleOdometerPage;
import com.intabella.pages.HomePage;
import com.intabella.pages.LoginPage;
import com.intabella.pages.VehicleOdometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.interactions.Actions;

import java.util.concurrent.TimeUnit;

public class US19DriverAddLicensePlate224 {

//    public static void main(String[] args) {
//
//        Driver.get().get("http://qa.intabella.com");
//        LoginPage loginPage = new LoginPage();
//        loginPage.login("user1","UserUser123");
//        VehicleOdometerPage vehicleOdometerPage= new VehicleOdometerPage();
//        HomePage homePage = new HomePage();
//        Actions actions = new Actions(Driver.get());
//        actions.moveToElement(homePage.fleetTab).perform();
//        Driver.get().manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
//        homePage.vehicleOdometerModule.click();
//        BrowserUtils.waitFor(5);
//        new VehicleOdometerPage().createVehicleOdometerBtn.click();
//        BrowserUtils.waitFor(5);
////        new CreateVehicleOdometerPage().addBtn.click();
//Driver.get().findElement(By.xpath("//button[@data-purpose='open-dialog-widget']")).click();


    CreateVehicleOdometerPage createVehicleOdometerPage = new CreateVehicleOdometerPage();

    @When("the user click on the Add button")
    public void the_user_click_on_the_Add_button() {
        BrowserUtils.waitFor(10);
        createVehicleOdometerPage.addBtn.click();

    }

    @Then("the user should navigate to Select Carreservation page")
    public void the_user_should_navigate_to_Select_Carreservation_page() {
        String actualText = createVehicleOdometerPage.titleSelectCarReservation.getText();
//        Assert.assertEquals("Select Carreservation",actualText );
    }

    @When("the user checked the checkbox of the related license plate and click on the Select button")
    public void the_user_checked_the_checkbox_of_the_related_license_plate_and_click_on_the_Select_button() {

        BrowserUtils.waitFor(10);
        createVehicleOdometerPage.checkBox.click();
        createVehicleOdometerPage.selectBtn.click();
    }

    @Then("the selected license plate should appear on the screen")
    public void the_selected_license_plate_should_appear_on_the_screen() {
        BrowserUtils.waitFor(10);
        createVehicleOdometerPage.addBtn.click();
        String expected = createVehicleOdometerPage.licensePlateSelectCarreservationPage.getText();
        createVehicleOdometerPage.checkBox.click();
        createVehicleOdometerPage.selectBtn.click();
        String actual = createVehicleOdometerPage.licensePlateBoard.getText();

//        Assert.assertEquals(expected,actual);
    }

    @When("the user click on the Save and Close")
    public void the_user_click_on_the_Save_and_Close() {
        new VehicleOdometerPage().saveAndCloseBtn.click();
    }

    @When("the user navigate to Fleet module and click on the Vehicle Odometer")
    public void the_user_navigate_to_Fleet_module_and_click_on_the_Vehicle_Odometer() {
        HomePage homePage = new HomePage();
        homePage.fleetTab.click();
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
        BrowserUtils.waitFor(6);
        new VehicleOdometerPage().createVehicleOdometerBtn.click();
    }

    @Then("the user should navigate to Create Vehicle Odometer page")
    public void the_user_should_navigate_to_Create_Vehicle_Odometer_page() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals("Create Vehicle Odometer - Entities - System - Car - Entities - System", actualTitle);
    }

    @Then("{string} message should appear at the top of the page")
    public void message_should_appear_at_the_top_of_the_page(String expected) {
//        String actualText =createVehicleOdometerPage.
//        System.out.println(actualText);
//        Assert.assertEquals(expected, actualText);
    }









//            BrowserUtils.waitFor(10);
////        createVehicleOdometerPage.addBtn.click();
//
//
//        try {
//        createVehicleOdometerPage.addBtn.click();
//    }catch (Exception e) {
//        e.printStackTrace();
//    }
//}


}
