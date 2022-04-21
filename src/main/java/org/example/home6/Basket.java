package org.example.home6;

import io.qameta.allure.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Basket extends BasePage{
    private final static String LIKE_BUTTON_CLOSE_XPATH_LOCATOR = "//div[@data-widget='alertPopup']//button[.='']";

    public Basket(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = LIKE_BUTTON_CLOSE_XPATH_LOCATOR)
    private WebElement closeWindow;

    @FindBy(xpath = "//div[@data-widget='column']/div[@class]/span")
    private WebElement deleteSelectGoods;

    @FindBy(xpath = "(//span[.='Удалить']/ancestor::button)[2]")
    private WebElement deteteGoods;

    @Step("Работа с корзиной")
    public void setDeleteSelectGoods(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(LIKE_BUTTON_CLOSE_XPATH_LOCATOR)));
        closeWindow.click();
        deleteSelectGoods.click();
        deteteGoods.click();
        synchronized (webDriverWait) {
            try {
                webDriverWait.wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
