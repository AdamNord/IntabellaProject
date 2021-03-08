package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "div#container>div:nth-of-type(2)>div>div>div:nth-of-type(2)>a")
    public WebElement createVehicleOdometerBtn;

    @FindBy(xpath = "//div[@class='btn-group pull-right']//button")
    public WebElement saveAndCloseBtn;



























}
