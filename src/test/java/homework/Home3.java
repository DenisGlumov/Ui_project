package homework;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class Home3 {
    public static void main (String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
        WebDriver cdriver = new ChromeDriver();
        cdriver.get("https://www.ozon.ru/");
        cdriver.findElement(By.xpath("//input[@placeholder='Искать на Ozon']")).
                sendKeys("Колесо времени Книга 2");
        Thread.sleep(3000);
        cdriver.findElement(By.xpath("//a[@search-text='Колесо времени Книга 2'][1]")).click();
        //Не смог придумать как найти элемент без номера
        cdriver.findElement(By.xpath("(//a[contains(@href, 'product/koleso-vremeni-kniga-2-velikaya-ohota')])[2]")).click();
        Thread.sleep(3000);
        cdriver.findElement(By.xpath("//button[.='Добавить в корзину']")).click();
        Thread.sleep(2000);
        cdriver.findElement(By.xpath("//span[.='Перейти']")).click();
        Thread.sleep(2000);
        cdriver.findElement(By.xpath("//div[@class='ce ui-b1']")).click();
        //не смог понять, почему локатор не проходит..
        cdriver.findElement(By.xpath("//span[.='Удалить выбранные']")).click();


        Thread.sleep(3000);
        cdriver.quit();

    }
}
