package com.tech.task.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BookingToCheckoutPage {
    private By nextButtonArrow = By.cssSelector(".submit-button__arrow");
    private By fieldEmail = By.cssSelector("#email");
    private By fieldEmailConfirm = By.cssSelector("#email_confirm");
    private By firstName = By.cssSelector("#firstname");
    private By lastName = By.cssSelector("#lastname");
    private By bookerTitleId = By.cssSelector("#booker_title");

    @Step("Type Last Name")
    public BookingToCheckoutPage typeLastName (String lName){
    $(lastName).sendKeys(lName);

        return this;
    }

    @Step("Type First Name")
    public BookingToCheckoutPage typeFirstName (String fName){
        $(firstName).sendKeys(fName);

        return this;
    }

    @Step("Select booker title")
    public BookingToCheckoutPage setBookerTitleTypeByIndex(int index){
        $(bookerTitleId).selectOption(index);

        return this;
    }

    @Step("Type Email")
    public BookingToCheckoutPage typeEmail (String typeEmailField){
        $(fieldEmail).sendKeys(typeEmailField);

        return this;
    }

    @Step("Type Email confirm")
    public BookingToCheckoutPage typeEmailConfirm (String typeEmailField){
        $(fieldEmailConfirm).sendKeys(typeEmailField);

        return this;
    }

    @Step("Click next button")
    public void clickNextButtonArrow() {

        $(nextButtonArrow).click();
    }

}

