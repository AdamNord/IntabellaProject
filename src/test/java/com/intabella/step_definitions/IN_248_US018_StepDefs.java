package com.intabella.step_definitions;

import com.intabella.pages.LoginPage;
import com.intabella.pages.VehicleOtometerPage;
import com.intabella.pages.vehiclepage;
import com.intabella.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class IN_248_US018_StepDefs {
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

        vehiclepage vehicle = new vehiclepage();
        vehicle.beside.click();
        BrowserUtils.waitFor(5);

        vehiclepage vehicle2 = new vehiclepage();
        //      String expected = "line52 de ne geldiyse onu yaz";
        System.out.println(vehicle2.mostview.getText());
        //    Assert.assertEquals(expected,vehicle.mostview.getText());


        vehiclepage vehicle3 = new vehiclepage();
        //vehicle.favoritesinrecent.click();
        vehicle3.favoritesinrecent.isSelected(); //???
        BrowserUtils.waitFor(5);


        //Bu kısım vehiclepage te Vehicle otomator olarakta mevcut

        vehiclepage vehicle4 = new vehiclepage();
        //    String expected = "line 70 te ne geldiyse o nu yaz";
        System.out.println("vehicle.favoritebox.getText() = " + vehicle.favoritebox.getText());
        //Yazı olarak ne diye geçiyorsa onu yazacağım

        //    Assert.assertEquals(expected, vehicle.favoritebox.getText());


    }



}
