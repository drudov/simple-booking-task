package com.tech.task.pages;

import com.tech.task.driver.ElementsController;
import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;

public class BookingHomePage {

    private ElementsController elementsController = new ElementsController();

    private By dateSelector = By.cssSelector("div[class='xp__dates-inner']");
    private By calendarNextMonth = By.cssSelector("div[class='bui-calendar__control bui-calendar__control--next']");
    private By searchCity = By.cssSelector("input[type='search']");
    private By searchButton = By.cssSelector(".xp__button");

    private String dateTemplate = "td[data-date='%s']";



    @Step("Choose date")
    public BookingHomePage selectSearchPeriod(String startDate, String endDate) {
        startDate = String.format(dateTemplate, startDate);
        endDate = String.format(dateTemplate, endDate);

        elementsController.clickElement(dateSelector);
        elementsController.clickElement(calendarNextMonth);
        elementsController.clickElement(By.cssSelector(startDate));
        elementsController.clickElement(By.cssSelector(endDate));

        return this;
    }
    @Step("Type to the search field")
    public BookingHomePage selectCityToSearch(String cityName){
        $(searchCity).sendKeys(cityName);

        return this;
    }

    @Step("Click search")
    public BookingSearchResultsPage clickSearchButton(){
        elementsController.clickElement(searchButton);

        return new BookingSearchResultsPage();
    }
}
