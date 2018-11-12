package com.tech.task.pages;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;

public class BookingHotelPage {

    private By firstAccommodationFirstTypeQuantity = By.cssSelector("select.hprt-nos-select");
    private By IllReserveButton = By.xpath("//span[contains(@class,'b-button__text')][contains(text(),'Reserve')]");

    public BookingHotelPage  setQuantityForFirstAccommodationFirstTypeByIndex(int index){
        $(firstAccommodationFirstTypeQuantity).selectOption(index);

        return this;
    }

    public void clickIllReserveButton(){

        $(IllReserveButton).click();
    }
}
