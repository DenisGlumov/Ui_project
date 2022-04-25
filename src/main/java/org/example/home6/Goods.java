package org.example.home6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Goods extends BasePage{
    private final static String LIKE_BUTTON_XPATH_LOCATOR = "//button[.='Добавить в корзину']";
    private final static String LIKE_SPAN_XPATH_LOCATOR = "//span[.='Перейти']";

    public Goods(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = LIKE_BUTTON_XPATH_LOCATOR)
    private WebElement addInBasket;

    @FindBy(xpath = LIKE_SPAN_XPATH_LOCATOR)
    private WebElement goToBasket;

    @Step("Добавление в корзину")
    public Basket setGoToBasket() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LIKE_BUTTON_XPATH_LOCATOR)));
        addInBasket.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LIKE_SPAN_XPATH_LOCATOR)));
        goToBasket.click();
        return new Basket(driver);
    }


}
