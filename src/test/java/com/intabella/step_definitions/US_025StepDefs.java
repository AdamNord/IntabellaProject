package com.intabella.step_definitions;

import com.intabella.pages.VehicleOdometerPage;
import com.intabella.pages.VehicleCostPage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

import java.util.List;

public class US_025StepDefs {

    //US-025 Truck driver can see vehicle costs informations once navigate to vehicle page

    @When("the user navigated to  {string} and {string} sees")
    public void the_user_navigated_to_and_sees(String string, String string2) {

        VehicleOdometerPage navigate = new VehicleOdometerPage();
        navigate.fleetlink.click();
        BrowserUtils.waitFor(3); //expilicit wait


        navigate.vehiclecostlink.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the user verify that  {string} informations  page openned.")
    public void the_user_verify_that_informations_page_openned(String string) {

        VehicleOdometerPage navigate = new VehicleOdometerPage();
        String expected ="DATE";
        //System.out.println(navigate.date.getText());
        Assert.assertEquals(expected,navigate.date.getText());
        //vehicle cost ınspectden gettext den yap

    }

    //US-025 Truck driver can change page number for getting following vehicle costs informations

    @When("the user clicks the right arrow")
    public void the_user_clicks_the_right_arrow() {

        BrowserUtils.waitFor(15);
        VehicleCostPage vehiclecost = new VehicleCostPage();
        vehiclecost.rightarrow.click();
        BrowserUtils.waitFor(10);

    }

    @Then("the user verify sees the page number changed to two")
    public void the_user_verify_sees_the_page_number_changed_to_two() {
        BrowserUtils.waitFor(10);//expilicit wait yap
        VehicleCostPage vehiclecost = new VehicleCostPage();
        vehiclecost.rightarrow.click();

        System.out.println("the user verify sees the page number changed to two");

        String expected="$2,123.00";
        // System.out.println(vehiclecost.yazı.getText());

        Assert.assertEquals(expected,vehiclecost.yazı.getText());

    }

    @Then("the user verify sees the page number changed to three")
    public void the_user_verify_sees_the_page_number_changed_to_three() {

        BrowserUtils.waitFor(3);
        //System.out.println("the user verify sees the page number changed to three");
        VehicleCostPage vehiclecost = new VehicleCostPage();

        String expected ="$10,000,000.00"; //2-1 i assert et.
        //System.out.println(vehiclecost.sayı.getText());
        Assert.assertEquals(expected,vehiclecost.sayı.getText());
    }

   //US-025 Truck driver can change the entity number by clicking the View Per Page dropdown(10,25,50,100)

    @When("the user clicks {string} on the top right of the page")
    public void the_user_clicks_on_the_top_right_of_the_page(String string) {


        VehicleCostPage vehiclecost = new VehicleCostPage();
        BrowserUtils.waitFor(3);
        vehiclecost.dropdowntablesize.click();


    }

    @When("the user select {int} forum options")
    public void the_user_select_forum_options(Integer int1) {


        VehicleCostPage vehiclecost =new VehicleCostPage();

        if (int1!=10){
            vehiclecost.dropdowntablesize.click();

        }

        vehiclecost.getdropdown(int1).click();
        BrowserUtils.waitFor(3);



    }

    @Then("verify row number on the table declared {int}")
    public void verify_row_number_on_the_table_declared(Integer int1) {

        VehicleCostPage vehiclecost =new VehicleCostPage();
        int tablesize = vehiclecost.vehiclecosttable.size();
        System.out.println("tablesize = " + tablesize);

        if (int1==tablesize){
            Assert.assertTrue("tablesize",int1==tablesize);
        } else {
            Assert.assertTrue("tablesize",int1==Integer.parseInt(vehiclecost.dropdowntablesize.getText()));

        }


    }

    @Then("the user sees View per page options appear {string},{string},{string},{string}")
    public void the_user_sees_View_per_page_options_appear(String string, String string2, String string3, String string4) {

        VehicleCostPage change = new VehicleCostPage();
        for (WebElement option : change.table) {
            System.out.println(option.getText());

        }

        for (WebElement option : change.table) {
            System.out.println(option.getAttribute("data-size"));

        }

        BrowserUtils.waitFor(5);


    }
    @Then("the user sees View per page options appear {double}")
    public void the_user_sees_View_per_page_options_appear(Double double1) {



    }



   //US-025 Truck driver can get all informations to her/his own email address by using Export Grid button in csv and xlsx formats

    @When("the user clicks {string} button in the upper left corner of the page")
    public void the_user_clicks_button_in_the_upper_left_corner_of_the_page(String string) {

        VehicleCostPage vehiclecost = new VehicleCostPage();
        vehiclecost.exportgrid.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the user sees options appear csv and xlsx formats")
    public void the_user_sees_options_appear_csv_and_xlsx_formats() {

        VehicleCostPage options = new VehicleCostPage();
        options.type.isDisplayed();
        BrowserUtils.waitFor(3);

    }

    @When("the user click {string} view forum options")
    public void the_user_click_view_forum_options(String string) {

        VehicleCostPage vehiclecost = new VehicleCostPage();

        vehiclecost.csv.click();
        BrowserUtils.waitFor(3);

        vehiclecost.exportgrid.click();
        BrowserUtils.waitFor(3);

    }

    @Then("the user verify export started successfully")
    public void the_user_verify_export_started_successfully() {

        //    System.out.println("the user verify export started successfully");
        VehicleCostPage vehiclecost = new VehicleCostPage();
        vehiclecost.xlsx.click();
        BrowserUtils.waitFor(3);


        // String expected ="Export started successfully. You will receive email notification upon completion.";
        System.out.println(vehiclecost.mesaj2.getText()); //xpath tekrar bak

        //Assert.assertEquals(expected,vehiclecost.mesaj2.getText());

     /*   Alert alert= Driver.get().switchTo().alert();
        System.out.println("alert.getText() = " + alert.getText());
        String expected="Export started successfully. You will receive email notification upon completion.";
        Assert.assertEquals(expected,alert.getText());
*/
    }

}
