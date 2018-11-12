package com.tech.task.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BookingToCheckoutPage {
    private By nextButtonArrow = By.cssSelector(".submit-button__arrow");
    private By fieldEmail = By.cssSelector("#email");
    private By fieldEmailConfirm = By.cssSelector("#email_confirm");
    private By firstName = By.cssSelector("#firstname");
    private By lastName = By.cssSelector("#lastname");
    private By bookerTitleId = By.cssSelector("#booker_title");

    public BookingToCheckoutPage typeLastName (String lName){
    $(lastName).sendKeys(lName);

        return this;
    }

    public BookingToCheckoutPage typeFirstName (String fName){
        $(firstName).sendKeys(fName);

        return this;
    }

    public BookingToCheckoutPage setBookerTitleTypeByIndex(int index){
        $(bookerTitleId).selectOption(index);

        return this;
    }

    public BookingToCheckoutPage typeEmail (String typeEmailField){
        $(fieldEmail).sendKeys(typeEmailField);

        return this;
    }

    public BookingToCheckoutPage typeEmailConfirm (String typeEmailField){
        $(fieldEmailConfirm).sendKeys(typeEmailField);

        return this;
    }

    public void clickNextButtonArrow() {

        $(nextButtonArrow).click();
    }

}

