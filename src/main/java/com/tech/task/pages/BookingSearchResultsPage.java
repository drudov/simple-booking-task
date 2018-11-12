package com.tech.task.pages;

import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class BookingSearchResultsPage {

    private By allHotels = By.cssSelector(".sr-hotel__name");

    public void selectFirstHotel() {

        $$(allHotels).first().click();
    }

}
