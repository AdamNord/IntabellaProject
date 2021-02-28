package com.intabella.step_definitions;

import com.intabella.pages.VehicleOtometerPage;
import com.intabella.pages.vehiclepage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class IN_246_US018_StepDefs {


    //Burada direk "then " den başlıyor önünde ki when yok.Genelde mi böyle acaba?

    @Then("Opening vehicle odometer list")
    public void opening_vehicle_odometer_list() {
        VehicleOtometerPage vehicleOtometerPage=new VehicleOtometerPage();

        vehicleOtometerPage.menuOptions.click(); //fleet
        BrowserUtils.waitFor(5);

        vehicleOtometerPage.vehicleodometer.click(); //vehicle otometer
        BrowserUtils.waitFor(5); //explicit wait sanırım?

        VehicleOtometerPage line=new VehicleOtometerPage();
        line.invehicleodometer.isDisplayed();
        BrowserUtils.waitFor(5);

    }


    @When("Click the {string} icon on the right side of the page")
    public void click_the_icon_on_the_right_side_of_the_page(String string) {

        VehicleOtometerPage pin=new VehicleOtometerPage();
        pin.pinsign.click();
        BrowserUtils.waitFor(5);



    }

    @Then("top of the dashboard {string} text turn to {string} button")
    public void top_of_the_dashboard_text_turn_to_button(String string, String string2) {
/*
        VehicleOtometerPage  expectt = new VehicleOtometerPage();
        VehicleOtometerPage actuall=new VehicleOtometerPage();
//AMACIM MESAJ  "-------" Bu idi, "--------" Bu oldu DEMEK. tek satırda birinden öbürüne geçti demem mümkün mü?
        //BURADA BEİM BİLE KAFAM KARIŞTI :))
 /*       String message1="Learn how to use this space";
        String actual=actuall.beforeclickpinmessage.getText();
        Assert.assertEquals(message1,actual);

        String message2="Car - Entities - System";
        String expect= expectt.pinyellowmessage.getText();
        Assert.assertEquals(message2,expect);
   */



//-------------------------------------------------------------------------------------
        VehicleOtometerPage  expectt = new VehicleOtometerPage();
        VehicleOtometerPage actuall=new VehicleOtometerPage();

      //  String expected="line 64 te ne çıkmışsa";
        System.out.println("expectt.pinyellowmessage.getText() = " + expectt.pinyellowmessage.getText());
      //  Assert.assertEquals(expected,actuall.pinyellowmessage.getText());
//----------------------------------------------------------------------------------------



        //BURADA KARŞILAŞTIRMA YAPILMADAN DİREK OLUŞUYOR.."learn..." yerine "car entities.." göründü diyemeyiz"...
        //DOĞRU  mu?

    //??? Assert.assertTrue(new VehicleOtometerPage().pinyellowmessage.isDisplayed()); //?????


    }






    /*
    @When("Click the {pin} icon on the right side of the page")
    public void click_the_icon_on_the_right_side_of_the_page(String pinsign) {

        VehicleOtometerPage pin=new VehicleOtometerPage();
        pin.pinsign.click();

     }
 */
/*
    @Then("top of the dashboard {String} text turn to {String} button")
    public void top_of_the_dashboard_text_turn_to_button(String expected, String actual) {
        VehicleOtometerPage  expectt = new VehicleOtometerPage();
        VehicleOtometerPage actuall=new VehicleOtometerPage();


        String message1="Learn how to use this space";
        String expect=expectt.beforeclickpinmessage.getText();
        Assert.assertEquals(message1,expect);

        String message2="Car - Entities - System";
        String actualll= actuall.pinyellowmessage.getText();
        Assert.assertEquals(message2,actualll);


    }
*/

    @Then("pin color turned into yellow")
    public void pin_color_turned_into_yellow() {
 /*       VehicleOtometerPage yellowpin = new VehicleOtometerPage();
       String favoriteColor= yellowpin.pinyellow.getCssValue("gold-icon");

       VehicleOtometerPage pinsign=new VehicleOtometerPage();
       String pinsignn=pinsign.pinsign.getCssValue("hide-text");
*/

//get atribute?
        //getCssvalue??
/*
        String buttonTextColor = driver.findElement(By.name("submit")).getCssValue("color");
        System.out.println("Button color: " + buttonColor);
        System.out.println("Text color " + buttonTextColor);
*/
//----------------------------------------------------------------------------------------------


        VehicleOtometerPage pincolor=new VehicleOtometerPage();
        pincolor.pinyellow.isDisplayed();
        BrowserUtils.waitFor(5);
//???SOR
//or

//-------------------------------------------------------------------------------------------------

    }

    @Then("verify pinned page added top of the dashboard")
    public void verify_pinned_page_added_top_of_the_dashboard() {
        String actual=Driver.get().getTitle();
        String expect="http://qa.intabella.com/entity/Extend_Entity_VehiclesOdometer?restore=1";
        Assert.assertEquals(actual,expect);
        BrowserUtils.waitFor(5);

//?????



    }

}
