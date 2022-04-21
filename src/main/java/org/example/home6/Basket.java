package org.example.home6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Basket extends BasePage{

    public Basket(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//span[@class=\'ui-b4 ui-c5 ui-e8\']")
    private WebElement closeWindow;

    @FindBy(xpath = "//div[@data-widget='column']/div[@class]/span")
    private WebElement deleteSelectGoods;

    @FindBy(xpath = "(//span[.='Удалить']/ancestor::button)[2]")
    private WebElement deteteGoods;

    public void setDeleteSelectGoods(){
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class=\'ui-b4 ui-c5 ui-e8\']")));
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
