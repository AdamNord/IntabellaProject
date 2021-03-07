package com.intabella.step_definitions;

import com.intabella.pages.VehicleOtometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class US_022_StepDefs {
    VehicleOtometerPage vehicleOtometerPage = new VehicleOtometerPage();

    @When("user navigate to {string} tab {string} module")
    public void user_navigate_to_tab_module(String string, String string2) {
        BrowserUtils.waitFor(10);
        vehicleOtometerPage.navigateToModule("Fleet", "Vehicle Odometer");


    }

    @When("Select top of the  vehicle odometer on the vehicle odometerlist")
    public void select_top_of_the_vehicle_odometer_on_the_vehicle_odometerlist() {

        BrowserUtils.waitForClickablility(vehicleOtometerPage.one,30);
        vehicleOtometerPage.one.click();
        BrowserUtils.waitFor(3);

    }


    @When("click to {string}  button")
    public void click_to_button(String string) {

        BrowserUtils.waitForClickablility(vehicleOtometerPage.delete, 10);
        vehicleOtometerPage.delete.click();
        System.out.println("Delete clicked");

    }

    /*  @Then("opened the\"delete confirmation\" pop-up window page")
      public void opened_the_delete_confirmation_pop_up_window_page() {

          vehicleOtometerPage.deleteconfirmation.isDisplayed();
          BrowserUtils.waitFor(3);

      }
  */
    @When("click the {string} option on the {string} pop-up window page")
    public void click_the_option_on_the_pop_up_window_page(String string, String string2) {
        vehicleOtometerPage.yes.click();
        BrowserUtils.waitFor(3);
    }
/*
    @Then("Verify selected vehicle odometer's line is deleted")
    public void verify_selected_vehicle_odometer_s_line_is_deleted() { //satırın yok olmasını göstermeye çalıştım

        String xpath = "//*[@id='entity-pagination']/div/div";
        String fullword = Driver.get().findElement(By.xpath(xpath)).getText();
        int numBeforeDelete = Integer.parseInt(fullword.substring(3, 5));
        BrowserUtils.waitFor(3);
        int numAfterDelete = VehicleOtometerPage.getNumberOfRecords();
        Assert.assertTrue(numBeforeDelete == numAfterDelete + 1);
        Assert.assertFalse(vehicleOtometerPage.one.isDisplayed());
    }
*/
    @Then("Verify seen {string} message top of and middle of the page, after selected vehicle odometer's line is deleted")
    public void verify_seen_message_top_of_and_middle_of_the_page_after_selected_vehicle_odometer_s_line_is_deleted(String string) {
        // String expected ="Export started successfully. You will receive email notification upon completion.";
        System.out.println(vehicleOtometerPage.message.getText()); //xpath tekrar bak
        Assert.assertEquals("Vehicle Odometer deleted", vehicleOtometerPage.message.getText());

    }


}
