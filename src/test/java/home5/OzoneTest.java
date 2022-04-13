package home5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class OzoneTest {
    WebDriver driver;
    WebDriverWait webDriverWait;
    private final static String OZON_BASE_URL = "https://www.ozon.ru/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void setupDriver() {
        driver = new ChromeDriver();
        webDriverWait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.get(OZON_BASE_URL);
    }

    @Test
    void findBookAddBookAndDeleteFromBasket() throws InterruptedException {
        driver.findElement(By.xpath("//input[@placeholder='Искать на Ozon']")).
                sendKeys("\"Колесо времени Книга 2\"");
        //Thread.sleep(5000);
        synchronized (webDriverWait) {
            try {
                webDriverWait.wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("//button[@class=\"z5s\"]")).click();
        synchronized (webDriverWait) {
            try {
                webDriverWait.wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        driver.findElement(By.xpath("(//a[@class='im5 tile-hover-target'])[1]")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[.='Добавить в корзину']")));
        driver.findElement(By.xpath("//button[.='Добавить в корзину']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Перейти']")));
        driver.findElement(By.xpath("//span[.='Перейти']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class='bz5 ui-c7']")));
        driver.findElement(By.xpath("//div[@class='bz5 ui-c7']")).click();
        synchronized (webDriverWait) {
            try {
                webDriverWait.wait(3000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        //webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='a7k ka7']")));
        driver.findElement(By.xpath("//span[@class='a7k ka7']")).click();
        webDriverWait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[.='Удалить']/ancestor::button")));
        driver.findElement(By.xpath("//span[.='Удалить']/ancestor::button")).click();
        }


    @AfterEach
    void tearDown() {
        driver.quit();
    }

}
