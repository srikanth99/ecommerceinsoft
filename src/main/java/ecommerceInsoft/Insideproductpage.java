package ecommerceInsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Created by HEMANTH on 16/10/2014.
 */
public class Insideproductpage extends AbstractPage {

    public static void buttonwishlist(){
      driver.findElement(By.id("add-to-wishlist-button-13")).click();

    }
    public static void emailafriend(){
        driver.findElement(By.className("button-2 email-a-friend-button")).click();

    }
    public static void addtoCompareList(){
        driver.findElement(By.className("button-2 add-to-compare-list-button")).click();

    }

}
