package org.example.home6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Goods extends BasePage{

    public Goods(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//button[.='Добавить в корзину']")
    private WebElement addInBasket;

    @FindBy(xpath = "//span[.='Перейти']")
    private WebElement goToBasket;

    public Basket setGoToBasket() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Добавить в корзину']")));
        addInBasket.click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Перейти']")));
        goToBasket.click();
        return new Basket(driver);
    }


}
