package ecommerceInsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by HEMANTH on 16/10/2014.
 */
public class Shoppingcartlist extends AbstractPage{
    //you have to add atleast one item to shopping card then only you can see page with following elements
    private static WebElement element = null;



    public static void updateshoppingcart(){
        element = driver.findElement(By.className("button-2 update-cart-button"));


    }
    public static void continueshopping(){
         driver.findElement(By.className("button-2 continue-shopping-button"));

    }
    public static void couponcodetextbox(){
         driver.findElement(By.className("discount-coupon-code")) ;

    }
    public static void buttonapplycoupon(){
       driver.findElement(By.className("discount-coupon-code"));

    }
    public static void typeGiftCardCode(){
        driver.findElement(By.className("gift-card-coupon-code")) ;

    }
    public static void buttonAddGiftcard()  {
        driver.findElement(By.className("button-2 apply-gift-card-coupon-code-button")) ;

    }
    public static void selectCountry(){
         driver.findElement(By.id("CountryId"));


    }
    public static void stateORprovinance(){
         driver.findElement(By.id("StateProvinceId"));


    }
    public static void checkboxTermsNConditions(){
         driver.findElement(By.id("termsofservice"));


    }
    public static void buttonnCheckout(){
       driver.findElement(By.id("checkout"));


    }
}
