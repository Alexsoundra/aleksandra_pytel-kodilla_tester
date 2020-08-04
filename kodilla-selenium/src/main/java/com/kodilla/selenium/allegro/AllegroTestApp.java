package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");


        WebElement closeAlert = driver.findElement(By.cssSelector("div._9f0v0._jkrtd.mpof_ki_s > button._13q9y._8hkto.munh_56_m.m7er_k4.m7er_wn.m7er_56_m"));
        closeAlert.click();

        WebElement inputField = driver.findElement(By.name("string"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebElement categoryCombo = driver.findElement(By.xpath("//html/body/div/div/header/div/div/div/div/form/div/div/select"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(4);

        inputField = driver.findElement(By.xpath("//html/body/div/header/div/div/div/div/form/div/button"));
        inputField.click();
    }
}
