package org.example.home6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Catalog extends BasePage{
    private final static String LIKE_DIV_XPATH_LOCATOR = "//div[@data-widget='searchResultsV2']/div/div[@class][1]/a";

    public Catalog(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = LIKE_DIV_XPATH_LOCATOR)
    public WebElement nameGoods;

    @Step("Выбор товара")
    public Goods setNameGoods() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LIKE_DIV_XPATH_LOCATOR)));
        nameGoods.click();
        return new Goods(driver);
    }

}
