package com.appium.pages;

import com.appium.utils.AbstractPage;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;
import io.appium.java_client.pagefactory.AndroidFindBys;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

/**
 * Created by luongle on 10/27/16.
 */
public class SplashPage extends AbstractPage{
    @FindBy(id = "com.mservice:id/button_continue_text")
    public static WebElement btnBatdau;
//    @FindBy(className = "android.widget.TextView")
//    private static List<WebElement> textViews;


    public static void click_btnBatDau() {
        //btnBatdau = driver.findElement(By.id("com.mservice:id/button_continue_text"));
//        List<WebElement> li = driver.findElementsByClassName("android.widget.TextView");
//        for (WebElement i: li) {
//
//            System.out.println(i.getTagName());
//        }
        System.out.println(btnBatdau.getText());

        btnBatdau.click();
        PageFactory.initElements(new AppiumFieldDecorator(driver), new phonenumberPage());
    }
}
