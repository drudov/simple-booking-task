package com.tech.task.elements;

import com.codeborne.selenide.Condition;
import org.openqa.selenium.By;

import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selenide.$;

public class BookingHeader {

    private By currentAccount = By.cssSelector("#current_account");
    private By selectLanguageLi = By.cssSelector(".js-uc-language");

    private String languageTemplate= "//span[contains(@class,'seldescription')][contains(text(),'%s')]";

    public void setPageLanguage(String language){
        languageTemplate = String.format(languageTemplate, language);

        $(selectLanguageLi).click();
        $(By.xpath(languageTemplate)).shouldBe(Condition.visible).click();
        $(currentAccount).shouldBe(visible);
    }

}
