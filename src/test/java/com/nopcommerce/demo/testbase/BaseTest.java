package com.nopcommerce.demo.testbase;

import com.nopcommerce.demo.propertyreader.PropertyManager;
import com.nopcommerce.demo.utilities.Utility;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Sagar Goswami
 */
public class BaseTest extends Utility {

    String browser = PropertyManager.getInstance().getBrowser();

    @BeforeMethod
    public void setUp() {
        selectBrowser(browser);
    }

    @AfterMethod
    public void tearDown() {
        closeBrowser();
    }

}
