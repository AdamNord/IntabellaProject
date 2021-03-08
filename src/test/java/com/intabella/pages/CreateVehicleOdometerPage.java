package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateVehicleOdometerPage extends BasePage{

    public CreateVehicleOdometerPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//button[contains(@class,'btn btn-medium')]")
    public WebElement addBtn;

    @FindBy(xpath = "//span[text()='Select Carreservation']")
    public WebElement titleSelectCarReservation;

    @FindBy(xpath = "(//input[@type='checkbox'])[3]")
    public WebElement checkBox;

    @FindBy(xpath = "//button[text()='Select']")
    public WebElement selectBtn;

    @FindBy(xpath = " //button[@type='submit']")
    public WebElement saveAndCloseBtn2;

    @FindBy(xpath = "(//div[@class='message'])[2]" )
    public WebElement dontHavePermissionWarning;

    @FindBy(xpath = "(//div[@class='message'])" )
    public WebElement dontHavePermissionFirstWarningMessage;

    @FindBy(xpath = "" )
    public WebElement EntitySavedMessage;

    @FindBy(xpath = " (//div[@class='pull-left']//a)[3]" )
    public WebElement licensePlateBoard;

    @FindBy(xpath = "//td[text()='try001']" )
    public WebElement licensePlateSelectCarreservationPage;








}
