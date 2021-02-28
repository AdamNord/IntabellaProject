package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(id = "prependedInput")
    public WebElement userName;

    @FindBy(id = "prependedInput2")
    public WebElement password;

    @FindBy(name = "_submit")
    public WebElement submit;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    public WebElement loginbutton; //FOR IN-248-StepDefs


    public void login(String userNameStr, String passwordStr) {
        userName.sendKeys(userNameStr);
        password.sendKeys(passwordStr);
        submit.click();
        // verification that we logged
    }

    //BREAK UNTIL 12:10
    //deneme added
    // 17:18 itibariyle degistirdim.

}