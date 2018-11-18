package com.tech.task.tests;


import com.tech.task.elements.BookingHeader;
import com.tech.task.pages.BookingToCheckoutPage;
import com.tech.task.pages.BookingHomePage;
import com.tech.task.pages.BookingHotelPage;
import org.testng.annotations.Test;

import static com.codeborne.selenide.Selenide.*;


public class BookingHotelTest {

    @Test (priority = 0, description = "Book 1 room in Los Angeles")
    public void TestBooking() {
        BookingToCheckoutPage toCheckoutPage = new BookingToCheckoutPage();
        BookingHeader pageHeader = new BookingHeader();
        BookingHomePage homePage = new BookingHomePage();
        BookingHotelPage hotelPage = new BookingHotelPage();

        int newTabFocusIndex = 1;
        int selectFirstAccommodationFirstType = 1;
        int selectFirstTitleFirstType = 1;

        String bookingPageLanguage = "English (US)";
        String bookingUrl = "https://www.booking.com";
        String city = "Los Angeles";
        String email = "BookingTestSel34@gmail.com";
        String endDate = "2019-01-30";
        String fName = "TestFirstName";
        String lName = "TestLastName";
        String startDate = "2019-01-29";

        open(bookingUrl);

        pageHeader.setPageLanguage(bookingPageLanguage);

        homePage.selectSearchPeriod(startDate, endDate)
                .selectCityToSearch(city)
                .clickSearchButton()
                .selectFirstHotel();

        // Booking.com opens hotels in new tabs
        switchTo().window(newTabFocusIndex);

        pageHeader.setPageLanguage(bookingPageLanguage);
        hotelPage.setQuantityForFirstAccommodationFirstTypeByIndex(selectFirstAccommodationFirstType)
                .clickIllReserveButton();

        toCheckoutPage.typeLastName(lName)
                .typeFirstName(fName)
                .setBookerTitleTypeByIndex(selectFirstTitleFirstType)
                .typeEmail(email)
                .typeEmailConfirm(email)
                .clickNextButtonArrow();


    }

    }

