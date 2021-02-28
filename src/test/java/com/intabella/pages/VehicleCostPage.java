package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class VehicleCostPage {

    public VehicleCostPage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(xpath = "//i[@class=\"fa-chevron-right hide-text\"]")
    public WebElement rightarrow;


    @FindBy(xpath = "(//button[@data-toggle=\"dropdown\"])[1]")
    public WebElement dropdowntablesize;

    @FindBy(xpath = "(//button[@data-toggle=\"dropdown\"])[1]")
    public WebElement selectoption;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[1]")
    public WebElement ten;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[2]")
    public WebElement twentyfive;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[3]")
    public WebElement fifty;

    @FindBy(xpath = "(//a[@class=\"dropdown-item\"])[4]")
    public WebElement hundred;

    @FindBy(xpath = "//ul@[class=\"dropdown-menu pull-right\"]")
    public List<WebElement> dropdown;

    // String str = "topright";

    @FindBy(xpath = "//div[@class='btn-group'][a]")
    public WebElement exportgrid;

    @FindBy(xpath = "//ul@[class=\"dropdown-menu\"]")
    public WebElement options;

    @FindBy(xpath = "//a[contains(@title,'CSV')]")
    public WebElement csv;

    @FindBy(xpath = "//a[contains(@title,'XLSX')]")
    public WebElement xlsx;

    @FindBy(xpath = "//td[@class=\"number-cell grid-cell grid-body-cell grid-body-cell-TotalPrice\"]")
    public WebElement number;


    @FindBy(xpath = "//span[@class=\"grid-header-cell__label\"]")
    public WebElement type;

    @FindBy(xpath = "//label[@class=\"control-label\"]")
    public WebElement viewperpage;

    @FindBy(xpath = "(//td[contains(text(),'    Road Assistance')])[1]")
    public WebElement line;


    // @FindBy(xpath = "(//td[@class='date-cell grid-cell grid-body-cell grid-body-cell-Date'])[1]")
    //public WebElement Jun30;

    @FindBy(xpath = "//i[@class='fa-chevron-left hide-text']")
    public WebElement leftarrow;

    @FindBy(xpath = "(//td[@class=\"date-cell grid-cell grid-body-cell grid-body-cell-Date\"])[1]")
    public WebElement Sep26;

    @FindBy(xpath = "(//label[@class='dib'])[1]")
    public WebElement page;

    // @FindBy(xpath = "(//ul[@class=\"dropdown-menu pull-right\"])[2]")
    //public WebElement dropdown;

    // @FindBy(xpath = "(//ul[@class='dropdown-menu'])[1]")
    //public WebElement dropdown;

    @FindBy(xpath = "(//ul[@class='dropdown-menu pull-right'])[2]")
    public WebElement menuOptions;

    //  @FindBy(xpath = "(//ul[@class='dropdown-menu pull-right'])[2]")
    //public List<WebElement> menuOptions();

    @FindBy(xpath = "(//td[@class='string-cell grid-cell grid-body-cell grid-body-cell-Type'])[2]")
    public WebElement repair;

    @FindBy(xpath = "(//ul[@class=\"dropdown-menu pull-right\"])[2]")
    public List<WebElement> table;

    @FindBy(xpath = "(//td[@class='number-cell grid-cell grid-body-cell grid-body-cell-TotalPrice'])[1]")
    public WebElement yazı;

    @FindBy(xpath = "//div[@class=\"flash-messages-holder\"]")
    public WebElement mesaj2;
    //div[@class=\"flash-messages-holder\"]
    //div[@class=\"flash-messages-holder\"]
    @FindBy(xpath = "//div[@class=\"flash-messages-holder\"]//div")
    public WebElement mesaj;

    @FindBy(xpath = "(//td[@class=\"number-cell grid-cell grid-body-cell grid-body-cell-TotalPrice\"])[1]")
    public WebElement sayı;

    @FindBy(xpath = "//table[@class='grid table-hover table table-bordered table-condensed']/tbody/tr")
    public List<WebElement> vehiclecosttable;

    public WebElement getdropdown(int size) {
        WebElement number;
        //if-switch case
        switch (size) {
            case 10:
                number = ten;
                break;
            case 25:
                number = twentyfive;
                break;
            case 50:
                number = fifty;
                break;
            case 100:
                number = hundred;
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + size);
        }
        return number;


    }
}

