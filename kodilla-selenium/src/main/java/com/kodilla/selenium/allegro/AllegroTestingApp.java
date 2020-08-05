package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.List;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "c:\\selenium-drivers\\chrome\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://allegro.pl");


        WebElement closeAlert = driver.findElement(By.cssSelector("div._9f0v0._jkrtd.mpof_ki_s > button._13q9y._8hkto.munh_56_m.m7er_k4.m7er_wn.m7er_56_m"));
        closeAlert.click();

        WebDriverWait wait = new WebDriverWait(driver, 10);
        wait.until(ExpectedConditions.invisibilityOfElementLocated((By.id("#dialog-content"))));

        WebElement inputField = driver.findElement(By.cssSelector("form > input"));
        inputField.sendKeys("Mavic mini");
        inputField.submit();

        WebElement categoryCombo = driver.findElement(By.cssSelector("div > select.mr3m_1 m7er_k4 m7er_k4 m7er_wn _k70df mgn2_14 mgn2_14 mgn2_jk mp0t_0a mqu1_21 mgmw_wo mli8_k4 _d25db_an94v"));
        Select categorySelect = new Select(categoryCombo);
        categorySelect.selectByIndex(3);

       List<WebElement> elements = driver.findElements(By.cssSelector("section > article._9c44d_3pyzl"));
        elements.get(0).getText();
    }
}
