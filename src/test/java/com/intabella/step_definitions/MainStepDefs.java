package com.intabella.step_definitions;

import com.intabella.pages.BasePage;
import com.intabella.pages.LoginPage;
import com.intabella.pages.MainPage;
import com.intabella.utilities.BrowserUtils;
import com.intabella.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.jsoup.Connection;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebElement;

public class MainStepDefs {
    LoginPage loginPage = new LoginPage();
    MainPage mainPage = new MainPage();

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
                break;
        }
        myButton.click();
        BrowserUtils.waitFor(4);
    }
}
