package org.example.home6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class Catalog extends BasePage{

    public Catalog(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//div[@data-widget='searchResultsV2']/div/div[@class][1]/a")
    public WebElement nameGoods;

    public Goods setNameGoods() {
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@data-widget='searchResultsV2']/div/div[@class][1]/a")));
        nameGoods.click();
        return new Goods(driver);
    }

}
