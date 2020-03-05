package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest extends WebDriverSettings {

    @Test
    public void googleTitle() {
        System.out.println("LETS START");
        driver.get("https://translate.google.ru/?hl=ru&tab=rT1");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Google Переводчик")); //нормик

    }

    @Test
    public void yandexTitle() {
        System.out.println("LETS START");
        driver.get("https://translate.yandex.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Яндекс.Переводчик – словарь и онлайн перевод на английский, русский, немецкий, французский, украинский и другие языки.")); //нормик
    }

    @Test
    public void mailTitle() {
        System.out.println("LETS START");
        driver.get("https://mail.ru/");
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Mail.ru: почта, поиск в интернете, новости, игры"));

    }
    @Test
    public void polyGon() {
        System.out.println("LETS EXPERIMENT");
        driver.get("https://yahoo.com/");
        WebElement link = driver.findElementByXPath("//*[@id=\"applet_p_50000352\"]/div/div/h2/span");
        if (link.getText().equals("Trending Now")){
            driver.get("https://mail.yahoo.com/");
        }
        else {
            System.out.println("Bad guy");
        }

    }

}

    /*
    //*[@id='ybar-navigation-item-mail']/a
    System.out.println("Button title is" + link.getText());
    WebElement link = driver.findElementByLinkText("Hello"); // не обязательно применять метод, достаточно что элемент просто будет найден
    System.out.println(driver.getTitle());
    System.out.println(driver.getCurrentUrl());
    driver.navigate().back();
    driver.navigate().forward();
    driver.navigate().refresh();
    driver.manage().window().setSize(new Dimension(500,800));

    @Test
    public void yanDex() {
        System.out.println("LETS START");
        driver.get("https:ya.ru");
        driver.findElement(By.xpath(".//*[@id='text']")).sendKeys("Не яндекс, так Гугл");
        //driver.submit();
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/form/div[2]/button")).click();
        driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/form/div[2]/button2")).click(); //ошибка, не найдет такого символа
        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Delivery Club | Санкт-Петербург | Продукты, пицца, суши и другие блюда с доставкой! | Единая Система Заказов")); //другой заголовок

    }
     */
   /*
    @Test
    public void prizmbit() {
        System.out.println("LETS START");
        driver.get("https://prizmbit.com/ru");
        driver.get("https://prizmbit.com/ru/member/signin");

        driver.findElement(By.xpath(".//*[@id=\'member-sign-in-email\']")).sendKeys("a@d.ru");
        driver.findElement(By.xpath(".//*[@id=\'member-sign-in-name\']")).sendKeys(" ");
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[4]/button")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[2]/div/div/div[4]/btton")).click();
        driver.get("https://prizmbit.com/ru/user/edit-profile");
        driver.findElement(By.xpath("//*[@id=\"Capa_1\"")).click();

        //driver.findElement(By.xpath("/html/body/table/tbody/tr[2]/td/form/div[2]/button2")).click(); //ошибка, не найдет такого символа
        //String title = driver.getTitle();
        //Assert.assertTrue(title.equals("Delivery Club | Санкт-Петербург | Продукты, пицца, суши и другие блюда с доставкой! | Единая Система Заказов")); //другой заголовок
        if (!driver.findElementByXPath(("//*[@id=\"applet_p_50000352\"]/div/div/h2/span")).isDisplayed());
        driver.findElementByXPath(("//*[@id=\"applet_p_50000352\"]/div/div/h2/span")).click();

        public static void selectCheckBox(String name){
        String rXpath = "//*[@id=\\\"applet_p_50000352\\\"]/div/div/h2/span\"";
        if (!driver.findElementByXPath((String.format(rXpath, name) + "/input")).isSelected());
        driver.findElementByXPath((String.format(rXpath, name))).click();

    }

    }
*/
