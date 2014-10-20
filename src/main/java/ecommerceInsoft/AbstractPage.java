package ecommerceInsoft;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Select;

/**
 * Created by HEMANTH on 20/10/2014.
 */
public class AbstractPage extends BaseClass {
    public  void login(){
        driver.findElement(By.linkText("Log in")).click();


    }
    public  void  logout(){
        driver.findElement(By.linkText("Log out")).click();

    }
    public void dropdownmenu(By by,String text){
        Select select = new Select(driver.findElement(by));

        select.selectByVisibleText(text);

    }
    public void registeruser(){
        driver.findElement(By.linkText("Register")).click() ;


    }
    public void shoppingcartlist(){
        driver.findElement(By.linkText("Shopping cart")).click();

    }
    public  void wishlist(){
        driver.findElement(By.linkText("Wishlist"));

    }
    public  void searchbox(){
        driver.findElement(By.id("small-searchterms")) ;

    }
    public  void btnSearch(){
        driver.findElement(By.className("button-1 search-box-button")) ;

    }
    public   void currencydollaroreuro(){
        driver.findElement(By.id("customerCurrency"));


    }
    public static void books(String text ){
        driver.findElement(By.linkText(text)).click() ;

    }
    public  void computers(){
        driver.findElement(By.linkText("Computers")) ;

    }
    public  void electronics(){
        driver.findElement(By.linkText("Electronics")) ;

    }
    public   void apparelandshoes(WebDriver driver){
        driver.findElement(By.linkText("Apparel & Shoes"));

    }
    public  void  digitaldownloads(WebDriver driver){
        driver.findElement(By.linkText("Digital downloads"))  ;

    }
    public  void jewellery(WebDriver driver){
        driver.findElement(By.linkText("Jewelry"));

    }
    public  void giftcards(WebDriver driver){
        driver.findElement(By.linkText("Gift Cards"));

    }
    public  void addToCart(WebDriver driver){
        driver.findElement(By.id("add-to-cart-button-13")) ;


    }

}
