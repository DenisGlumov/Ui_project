package org.example.home6;

import io.qameta.allure.Step;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class MainPage extends BasePage{

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//input[@placeholder='Искать на Ozon']")
    private WebElement searchField;

    @FindBy(xpath = "//form[@action]/button")
    private WebElement submitButton;

    @Step("Поиск товара")
    public Catalog search(String name){
        searchField.sendKeys(name);
        submitButton.click();
        return new Catalog(driver);

    }
}
