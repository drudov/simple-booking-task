package com.tech.task.pages;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import static com.codeborne.selenide.Selenide.*;

public class BookingSearchResultsPage {

    private By allHotels = By.cssSelector(".sr-hotel__name");

    @Step("Open first hotel")
    public void selectFirstHotel() {

        $$(allHotels).first().click();
    }

}
