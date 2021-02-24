package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class VehicleOdometerPage {

    public VehicleOdometerPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//*[@id=\"container\"]/div[2]/div/div/div[2]/a")
    public WebElement createVehicleOdometerBtn;

    @FindBy(xpath = "//*[@id=\"custom_entity_type-uid-6036d89edff07\"]/div[1]/div/div/div[2]/div[1]/div[2]/div/button")
    public WebElement saveAndCloseBtn;







}
