package com.intabella.step_definitions;

import com.intabella.pages.LoginPage;
import com.intabella.pages.VehicleOtometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class US_018_StepDefs {
    int beforeclick;
    int afterclick;

    @When("user navigated to {string} tab {string} module")
    public void user_navigated_to_tab_module(String string, String string2) {
        VehicleOtometerPage vehicleOtometerPage = new VehicleOtometerPage();

        vehicleOtometerPage.menuOptions.click(); //fleet
        BrowserUtils.waitFor(5);

        vehicleOtometerPage.vehicleodometer.click(); //vehicle otometer
        BrowserUtils.waitFor(5); //explicit wait sanırım?

    }

    @When("Click the plus button on the right sidebar")
    public void click_the_plus_button_on_the_right_sidebar() {
        VehicleOtometerPage clickplus = new VehicleOtometerPage();
        clickplus.plussign.click();


    }


    @When("Click Add button, corresponding to {string}")
    public void click_Add_button_corresponding_to(String widgetname) {
        VehicleOtometerPage vehicleOtometerPage = new VehicleOtometerPage();
        beforeclick = vehicleOtometerPage.getsidebarcount(vehicleOtometerPage.addedtextinpopupforMail.getText());
        vehicleOtometerPage.recent_email_addition.click();
        BrowserUtils.waitFor(2);

        afterclick = vehicleOtometerPage.getsidebarcount(vehicleOtometerPage.addedtextinpopupforMail.getText());

        vehicleOtometerPage.widgetadder("Sticky Note").click();
        vehicleOtometerPage.widgetadder("Task list").click();

        System.out.println("vehicleOtometerPage.addedtextinpopup.getText() = " + vehicleOtometerPage.addedtextinpopupforMail.getText());
        System.out.println("vehicleOtometerPage.addedtextinpopup.getAttribute() = " + vehicleOtometerPage.addedtextinpopupforMail.getAttribute(""));

    }


    @Then("The counter number beside the added text counted")
    public void the_counter_number_beside_the_added_text_counted() {

        Assert.assertTrue("added count checked", beforeclick + 1 == afterclick);


    }

    @Then("Click close button")
    public void click_close_button() {
        VehicleOtometerPage closebutton = new VehicleOtometerPage();
        closebutton.closebutton.click();
        BrowserUtils.waitFor(5);
    }

    @Then("Verify {string},{string},{string} were added to sidebar")
    public void verify_were_added_to_sidebar(String string, String string2, String string3) {

        //?????????

        VehicleOtometerPage stickynotes = new VehicleOtometerPage();
        stickynotes.forverificationSTİCKYNOTE.isDisplayed();


        VehicleOtometerPage tasklist = new VehicleOtometerPage();
        tasklist.forverificationTASKLİST.isDisplayed();

        VehicleOtometerPage recentemail = new VehicleOtometerPage();
        recentemail.forverificationRECENTEMAİL.isDisplayed();

    }


    @Then("opening Vehicle information page \\({string} page) open")
    public void opening_Vehicle_information_page_page_open(String string) {

    }





        //Burada direk "then " den başlıyor önünde ki when yok.Genelde mi böyle acaba?

        @Then("Opening vehicle odometer list")
        public void opening_vehicle_odometer_list () {
        VehicleOtometerPage vehicleOtometerPage = new VehicleOtometerPage();

        vehicleOtometerPage.menuOptions.click(); //fleet
        BrowserUtils.waitFor(5);

        vehicleOtometerPage.vehicleodometer.click(); //vehicle otometer
        BrowserUtils.waitFor(5); //explicit wait sanırım?

        VehicleOtometerPage line = new VehicleOtometerPage();
        line.invehicleodometer.isDisplayed();
        BrowserUtils.waitFor(5);

    }


        @When("Click the {string} icon on the right side of the page")
        public void click_the_icon_on_the_right_side_of_the_page (String string){

        VehicleOtometerPage pin = new VehicleOtometerPage();
        pin.pinsign.click();
        BrowserUtils.waitFor(5);


    }

        @Then("top of the dashboard {string} text turn to {string} button")
        public void top_of_the_dashboard_text_turn_to_button (String string, String string2){
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
        VehicleOtometerPage expectt = new VehicleOtometerPage();
        VehicleOtometerPage actuall = new VehicleOtometerPage();

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
        public void pin_color_turned_into_yellow () {
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


            VehicleOtometerPage pincolor = new VehicleOtometerPage();
            pincolor.pinyellow.isDisplayed();
            BrowserUtils.waitFor(5);
//???SOR
//or

//-------------------------------------------------------------------------------------------------

        }

        @Then("verify pinned page added top of the dashboard")
        public void verify_pinned_page_added_top_of_the_dashboard () {
        String actual = Driver.get().getTitle();
        String expected = "http://qa.intabella.com/entity/Extend_Entity_VehiclesOdometer?restore=1";
        Assert.assertEquals(actual, expected);
        BrowserUtils.waitFor(5);

//?????


    }


    @Then("opening vehicles page")
    public void opening_vehicles_page() {
        VehicleOtometerPage vehicle = new VehicleOtometerPage();
        vehicle.fleetlink.click();
        BrowserUtils.waitFor(5);
        vehicle.vehicle.click();
        BrowserUtils.waitFor(5);
    }

    @Then("{string} icon turned yellow.")
    public void icon_turned_yellow(String string) {
    /*    vehiclepage vehicle = new vehiclepage();
        vehicle.yellowfavorıte.click();
        BrowserUtils.waitFor(5);
     */
        VehicleOtometerPage vehicle = new VehicleOtometerPage();
        vehicle.yellowfavorıte.isDisplayed();
        BrowserUtils.waitFor(5);

    }
    @When("Click {string} icon\\(right side on the page) usernames's beside")
    public void click_icon_right_side_on_the_page_usernames_s_beside(String string) {
        VehicleOtometerPage vehicle = new VehicleOtometerPage();
        vehicle.beside.click();
        BrowserUtils.waitFor(5);
    }
    @Then("opened the pop-up page\\(include {string} options)")
    public void opened_the_pop_up_page_include_options(String options) {
        VehicleOtometerPage vehicle = new VehicleOtometerPage();
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
        VehicleOtometerPage vehicle = new VehicleOtometerPage();
        //vehicle.favoritesinrecent.click();
        vehicle.favoritesinrecent.isSelected(); //???
        BrowserUtils.waitFor(5);
    }

    @Then("Verify your page is under favorite list")
    public void verify_your_page_is_under_favorite_list() {
        VehicleOtometerPage vehicle = new VehicleOtometerPage();
      /*  String expected = "Car - Entities - System - Car - Entities - System";
        Assert.assertEquals(expected,vehicle.favoritebox.getText());
        */

//-------------------------------------------------------------------------------------------

        //    String expected = "line 70 te ne geldiyse o nu yaz";
        System.out.println("vehicle.favoritebox.getText() = " + vehicle.favoritebox.getText());//Yazı olarak ne diye geçiyorsa onu yazacağım
        //    Assert.assertEquals(expected, vehicle.favoritebox.getText());

//--------------------------------------------------------------------------------------------



    }
    @When("logout the page")
    public void logout_the_page() {
        VehicleOtometerPage vehicleOtometerPage=new VehicleOtometerPage();
        vehicleOtometerPage.usernameFOR_LOG_OUT.click();
        BrowserUtils.waitFor(3);

        VehicleOtometerPage list=new VehicleOtometerPage();
        list.LogOutButton.isDisplayed();
        BrowserUtils.waitFor(5);

        list.LogOutButton.click();
        BrowserUtils.waitFor(5);

        //???? Bu olur mu?
        LoginPage loginbuttonn=new LoginPage();
        loginbuttonn.loginbutton.isDisplayed();
        BrowserUtils.waitFor(5);

          /* İlhami abi yöntem
        LoginPage loginbuttonn=new LoginPage();
      //  String expect="line 26 da ne varsa o"
        System.out.println(loginbuttonn.loginbutton.getText());
    //    Assert.assertEquals(expect,loginbuttonn.loginbutton.getText());
*/


    }

    @When("again,login as a truck driver")
    public void again_login_as_a_truck_driver() {

        //Burada logini tekrar nasıl çağırabilirim KISAYOL

        LoginPage login=new LoginPage();
        login.userName.sendKeys("user1");
        login.password.sendKeys("UserUser123");
        login.submit.click();


    }

    @Then("Verify {string} icon on the right side of the page is still choosen with yellow color")
    public void verify_icon_on_the_right_side_of_the_page_is_still_choosen_with_yellow_color(String string) {

        //Bu kısmı 47 den elde ettim

        VehicleOtometerPage vehicle = new VehicleOtometerPage();
        vehicle.beside.click();
        BrowserUtils.waitFor(5);


        //      String expected = "line52 de ne geldiyse onu yaz";
        System.out.println(vehicle.mostview.getText());
        //    Assert.assertEquals(expected,vehicle.mostview.getText());


        //vehicle.favoritesinrecent.click();
        vehicle.favoritesinrecent.isSelected(); //???
        BrowserUtils.waitFor(5);


        //Bu kısım vehiclepage te Vehicle otomator olarakta mevcut


        //    String expected = "line 70 te ne geldiyse o nu yaz";
        System.out.println("vehicle.favoritebox.getText() = " + vehicle.favoritebox.getText());
        //Yazı olarak ne diye geçiyorsa onu yazacağım

        //    Assert.assertEquals(expected, vehicle.favoritebox.getText());


    }
    @When("Click the cross\\(X) sign near the favorite selection on the pop-up")
    public void click_the_cross_X_sign_near_the_favorite_selection_on_the_pop_up() {


    }


    @Then("verify {string} icon changes from yellow color to white color")
    public void verify_icon_changes_from_yellow_color_to_white_color(String string) {


    }



    @When("Click the Favorites icon on the right side of the page.")
    public void click_the_Favorites_icon_on_the_right_side_of_the_page() {
        VehicleOtometerPage vehicle = new VehicleOtometerPage();
        vehicle.favorıtebutton.click();
        BrowserUtils.waitFor(5);
    }




    @Then("Favorite icon turned yellow.")
    public void favorite_icon_turned_yellow() {

    }
    @When("Click three line icon\\(right side on the page) usernames's beside")
    public void click_three_line_icon_right_side_on_the_page_usernames_s_beside() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("opened the pop-up page\\(include History,Favorite,Most Viewed options)")
    public void opened_the_pop_up_page_include_History_Favorite_Most_Viewed_options() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @When("select the Favorite option")
    public void select_the_Favorite_option() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Then("verify favorite icon changes from yellow color to white color")
    public void verify_favorite_icon_changes_from_yellow_color_to_white_color() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }





}

