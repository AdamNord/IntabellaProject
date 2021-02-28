package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage(){
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(css = "span.title-level-1")
    public WebElement fleetlink;

    @FindBy(xpath = "//span[contains(text(),'Vehicle Costs')]")
    public WebElement vehiclecostlink;

    @FindBy(xpath = "//span[contains(text(),'Vehicle Odometer')]")
    public WebElement vehicleodometer;

    @FindBy(xpath = "//td[@class=\"string-cell grid-cell grid-body-cell grid-body-cell-Units\"][1]")
    public WebElement miles;

    @FindBy(xpath = "(//span[@class=\"grid-header-cell__label\"])[3]")
    public WebElement date;

    //@FindBy(xpath = "//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Type'][1]")
    //public WebElement yazı;



}

