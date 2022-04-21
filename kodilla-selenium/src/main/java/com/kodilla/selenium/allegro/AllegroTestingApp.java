package com.kodilla.selenium.allegro;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AllegroTestingApp {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "/Users/jarekgawronski/Desktop/kodilla/chromedriver");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.ebay.com/");

        WebElement categorySelect = driver.findElement(
                By.xpath("//*[@id=\"gh-cat\"]"));
        Select category = new Select(categorySelect);
        category.selectByIndex(12);

        WebElement searchBar = driver.findElement(
                By.xpath("//*[@id=\"gh-ac\"]"));
        searchBar.sendKeys("Mavic mini");
        searchBar.submit();

    }
}
