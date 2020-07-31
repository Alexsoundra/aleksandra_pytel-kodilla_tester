package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");

//        driver.switchTo().alert().accept();

        WebElement closeAlert = driver.findElement(By.xpath("//html/body/div/div/div/div/div/div/button[2]"));
        closeAlert.submit();

        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebElement categoryCombo = driver.findElement(By.xpath("//*[@id=\"mgn2_14 mgn2_14 mgn2_jk mp0t_0a mqu1_21 mgmw_wo mli8_k4 _1vx3o mp7g_f6 mj7u_0 mq1m_0 mqm6_0 mg9e_8 mj7a_8 _d25db_1umH4\"]/div/select[1]"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(4);

        inputField = driver.findElement(By.xpath("//html/body/div/header/div/div/div/div/form/div/button"));
        inputField.submit();
    }
}
