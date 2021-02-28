package com.intabella.pages;

import com.intabella.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;


public class VehicleOtometerPage {  //locasyonlar burada pagelerde tanımla
    //step defnitionslarda methodlar vasıtasıyla kodlarımızı yazarak çağırıyoruz(page lerde tanımladığımız locasyonları kullanıyoruz)

    public VehicleOtometerPage() { //ctrl+alt+l
        PageFactory.initElements(Driver.get(), this);
    }

    //US_018  US_022

    @FindBy(css = "span.title-level-1") //fleet
    public WebElement menuOptions;


    @FindBy(xpath = "//span[contains(text(),'Vehicle Odometer')]")
    public WebElement vehicleodometer;

    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    public WebElement vehicle;

    @FindBy(xpath = "//a[@title=\"Car - Entities - System - Car - Entities - System\"]")
    public WebElement pinyellowmessage;

    @FindBy(xpath = "//a[contains(text(),'Learn how to use this space')]")
    public WebElement beforeclickpinmessage;


    @FindBy(xpath = "//i[@class=\"fa-thumb-tack hide-text\"]")
    public WebElement pinsign;

    @FindBy(xpath = "//button[@class=\"btn minimize-button gold-icon\"]")
    public WebElement pinyellow;

    @FindBy(xpath = "//button[@class='sidebar__add-widget']")
    public WebElement plussign;


    //for box
    @FindBy(xpath = "//div[@class='modal oro-modal-normal widget-picker-modal in']") //box ın tamamı
    public WebElement sidebarbox;


    @FindBy(xpath = "(//a[@class='btn widget-picker-add-btn btn-primary'])[1]")
    public WebElement recent_email_addition;

    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    public WebElement recent_email_increasing;

    @FindBy(xpath = "//span[contains(text(),'(3)')]")
    public WebElement recent_email_increasing3;

    @FindBy(xpath = "(//span[@class='added'])[1]")
    public WebElement addedtextinpopupforMail;


    @FindBy(xpath = "(//a[@class='btn widget-picker-add-btn btn-primary'])[2]")
    public WebElement sticky_note_addition;
    //span[contains(text(),'(2)')]???

    @FindBy(xpath = "//span[contains(text(),'(1)')]")
    public WebElement sticky_note_increasing;

    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    public WebElement sticky_note_increasing2;


    @FindBy(xpath = "//a[@class='btn widget-picker-add-btn btn-primary'])[3]")
    public WebElement task_list_addition;

    @FindBy(xpath = "//span[contains(text(),'(1)')]")
    public WebElement task_list_increasing;

    @FindBy(xpath = "//span[contains(text(),'(2)')]")
    public WebElement task_list_increasing2;

    @FindBy(xpath = "//a[contains(text(),'Close')]")
    public WebElement closebutton;

    @FindBy(xpath = "(//i[@title='Sticky Note'])[1]")
    public WebElement forverificationSTİCKYNOTE;

    @FindBy(xpath = "(//i[@title='Task list'])[1]")
    public WebElement forverificationTASKLİST;

    @FindBy(xpath = "(//i[@title='Recent emails'])[1]")
    public WebElement forverificationRECENTEMAİL;

    @FindBy(xpath = "(//td[@class=\"number-cell grid-cell grid-body-cell grid-body-cell-OdometerValue\"])[1]")
    public WebElement invehicleodometer;


    @FindBy(xpath = "//a[@class='dropdown-toggle']")
    public WebElement usernameFOR_LOG_OUT;

    @FindBy(xpath = "//a[contains(text(),'Logout')]")
    public WebElement LogOutButton;


    @FindBy(css = "span.title-level-1")
    public WebElement fleetlink;
    @FindBy(xpath = "//span[contains(text(),'Vehicles')]")
    public WebElement vehiclee;
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


    @FindBy(xpath = "(//a[contains(text(),'Vehicle Odometer - Entities - System - Car - Entities - System')])[10]")
    public WebElement favoriteboxFORVEHİCLE_OTOMETER_PAGE;


    public int getsidebarcount(String text) {
        //vehicleOtometerPage.addedtextinpopup.getText() = Added (6)
        int firstp = text.indexOf('(');
        int secondp = text.indexOf(')');
        String result = text.substring(firstp + 1, secondp);
        return Integer.parseInt(result);


    }


    public WebElement widgetadder(String widgetname) {

        WebElement widget;


        switch (widgetname) {
            case "Recent emails":
                widget = recent_email_addition;
                break;
            case "Sticky Note":
                widget = sticky_note_addition;
                break;
            case "Task list":
                widget = task_list_addition;
                break;

            default:
                throw new IllegalStateException("Unexpected value: " + widgetname);
        }
        return widget;

    }

}