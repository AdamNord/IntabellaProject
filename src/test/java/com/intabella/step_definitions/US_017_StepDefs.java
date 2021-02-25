package com.intabella.step_definitions;

import com.intabella.pages.LoginPage;
import com.intabella.pages.VehicleOdometerPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;

public class US_017_StepDefs {
    LoginPage loginPage = new LoginPage();
    VehicleOdometerPage mainPage = new VehicleOdometerPage();

    @And("the user selects demanded columns")
    public void theUserSelectsDemandedColumns() {
    }

    @And("the user navigates to {string} , {string}")
    public void theUserNavigatesTo(String arg0, String arg1) {
        mainPage.navigateToModule(arg0,arg1);
    }

    @Then("the user should be able to see the page {string}")
    public void theUserShouldBeAbleToSeeThePage(String expectedTitle) {
        BrowserUtils.waitFor(3);
        System.out.println("Driver.get().getTitle() = " + Driver.get().getTitle());
        System.out.println("expectedTitle = " + expectedTitle);
        Assert.assertTrue(Driver.get().getTitle().contains(expectedTitle));
    }

    @When("the user clicks {string} button")
    public void theUserClicksButton(String buttonName) {
        WebElement myButton = null;

        BrowserUtils.waitForPageToLoad(30);

        switch (buttonName) {
            case "Grid Settings":
                myButton = mainPage.gridSettingsButton;
                System.out.println("switch girdi");
                break;
        }
        myButton.click();
        BrowserUtils.waitFor(4);
    }
}
