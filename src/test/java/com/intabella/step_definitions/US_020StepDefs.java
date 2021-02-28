package com.intabella.step_definitions;

import com.intabella.pages.VehicleOdometerPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_020StepDefs {

/*   @Given("the user is on the login page")
    public void the_user_is_on_the_login_page() {
        String url = ConfigurationReader.get("url");
        //WebDriver driver = Driver.get();
        Driver.get().get(url);
    }

    @When("the user enters the driver information")
    public void the_user_enters_the_driver_information() {
        String username = ConfigurationReader.get("driver_username");
        String password = ConfigurationReader.get("driver_password");

        LoginPage loginPage = new LoginPage();
        loginPage.login(username,password);

    }

    @Then("the user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(3);
        String actualTitle = Driver.get().getTitle();
        // Assert.assertEquals("Vehicle",actualTitle);

    }
*/
    //US-020 Truck Driver can see all informations about specific vehicle odometer.

    @When("the user navigated to {string} and \"Vehicle Odometers\"sees")
    public void the_user_navigated_to_and_Vehicle_Odometers_sees(String string) {

        VehicleOdometerPage navigate = new VehicleOdometerPage();
        navigate.fleetlink.click();
        BrowserUtils.waitFor(3);


        navigate.vehicleodometer.click();
        BrowserUtils.waitFor(3);
    }

    @Then("the user verify sees all informations about specific {string} page.")
    public void the_user_verify_sees_all_informations_about_specific_page(String string) {

        VehicleOdometerPage vehicleOdometerPage = new VehicleOdometerPage();
        String expected="miles";
        // System.out.println(navigatePage.miles.getText());
        Assert.assertEquals(expected, vehicleOdometerPage.miles.getText());

    }

}
