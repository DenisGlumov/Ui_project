package home6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.home6.MainPage;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import static org.hamcrest.MatcherAssert.assertThat;
import static ru.yandex.qatools.htmlelements.matchers.WebElementMatchers.isDisplayed;

public class OzoneTest2 {
    WebDriver driver;
    WebDriverWait webDriverWait;
    Actions actions;
    private final static String OZON_BASE_URL = "https://www.ozon.ru/";

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }

    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
    }

    @Test
    void findBookAddBookAndDeleteFromBasket() throws InterruptedException {
        driver.get(OZON_BASE_URL);
        new MainPage(driver)
                .search("Колесо времени Книга 2")
                .setNameGoods()
                .setGoToBasket().
                setDeleteSelectGoods();

        assertThat(driver.findElement(By.xpath("//h1[@class][1]")), isDisplayed());
    }

    @AfterEach
    void tearDown() {
        driver.quit();
    }
}
