package com.appium.pages;

import com.appium.utils.AbstractPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.SystemClock;

import java.io.Console;

/**
 * Created by luongle on 10/25/16.
 */
public class phonenumberPage extends AbstractPage {

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.LinearLayout[2]/android.widget.EditText[1]")
    private static WebElement tboxSDT;

    @FindBy(xpath = "//android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.LinearLayout[1]/android.widget.FrameLayout[1]/android.widget.FrameLayout[1]/android.widget.ScrollView[1]/android.widget.LinearLayout[1]/android.widget.Button[1]")
    private static WebElement btnTiepTuc;

    public static void click_btnTiepTuc() {

        tboxSDT.sendKeys("01231231236");
        btnTiepTuc.click();
    }
}
