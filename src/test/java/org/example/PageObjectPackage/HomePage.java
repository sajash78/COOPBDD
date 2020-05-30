package org.example.PageObjectPackage;

import org.example.BaseClassPackage.DriverFactory;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage extends DriverFactory {
    @FindBy (id = "siteSearch")
    WebElement searchbox;

    public void policy(){
        searchbox.sendKeys("insurance");
        searchbox.sendKeys(Keys.ENTER);
    }

}
