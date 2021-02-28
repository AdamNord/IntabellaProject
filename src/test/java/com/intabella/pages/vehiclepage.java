package com.intabella.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class vehiclepage {

    @FindBy(css = "span.title-level-1")
    public WebElement fleetlink;
    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    public WebElement vehicle;
    @FindBy(xpath = "//i[@class=\"fa-star hide-text\"]")
    public WebElement favorıtebutton;
    @FindBy(xpath = "/button[@class=\"btn favorite-button gold-icon\"]")
    public WebElement yellowfavorıte;
    @FindBy(xpath = "//i[@class=\"fa-bars\"]")
    public WebElement beside;
    @FindBy(xpath = "//a[@href=\"#mostviewed-content\"]")
    public WebElement mostview;
    @FindBy(xpath = "//i[@class=\"fa-flag menu-icon\"]")
    public WebElement mostviewFlagicon;
    @FindBy(xpath = "//i[@class=\"fa-star-o menu-icon\"]")
    public WebElement favoritesinrecent;
    @FindBy(xpath = "((//a[contains(text(),'Car - Entities - System - Car - Entities - System')])[3]")
    public WebElement favoritebox;

  /*
    @FindBy(xpath = "(//a[contains(text(),'Vehicle Odometer - Entities - System - Car - Entities - System')])[10]")
    public WebElement favoriteboxFORVEHİCLE_OTOMETER_PAGE
            //:) :) :) :) :)

    //BU LOCATE LERİN HEPSİ AYNI. VEHİCLE otometer page ile


   */
}