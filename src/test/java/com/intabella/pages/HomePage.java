package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {

    public HomePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//span[@class='title title-level-1']")
    public WebElement fleetTab;

    @FindBy(xpath = "(//span[@class='title title-level-2'])[2]")
    public WebElement vehicleOdometerModule;


    @FindBy(linkText = "Create Vehicle Odometer")
    public WebElement CreateVehOdomBtn;









}
