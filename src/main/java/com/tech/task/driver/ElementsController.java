package com.tech.task.driver;

import org.openqa.selenium.By;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class ElementsController {

    public void clickElement(By selector){

        $(selector).shouldBe(visible).click();
    }
}
