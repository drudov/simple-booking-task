package com.tech.task.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BookingHotelPage {

    private By firstAccommodationFirstTypeQuantity = By.cssSelector("select.hprt-nos-select");
    private By IllReserveButton = By.xpath("//span[contains(@class,'b-button__text')][contains(text(),'Reserve')]");

    @Step("Select 1 room in hotel")
    public BookingHotelPage  setQuantityForFirstAccommodationFirstTypeByIndex(int index){
        $(firstAccommodationFirstTypeQuantity).selectOption(index);

        return this;
    }
    @Step("Click I wll reserve button")
    public void clickIllReserveButton(){

        $(IllReserveButton).click();
    }
}
