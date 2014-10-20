package ecommerceInsoft;

import org.junit.Assert;
import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by HEMANTH on 18/10/2014.
 */
public class RegisterUser extends AbstractPage{
    public void registeruser(String gender,String firstname,String lastname,String email,String password,String confirmpassword){
        driver.findElement(By.id(gender)).click();
        driver.findElement(By.id("FirstName")).sendKeys(firstname);
        driver.findElement(By.id("LastName")).sendKeys(lastname);
        AbstractPage bc =new AbstractPage();
        bc.dropdownmenu(By.name("DateOfBirthDay"),"1");
        bc.dropdownmenu(By.name("DateOfBirthMonth"),"January");
        bc.dropdownmenu(By.name("DateOfBirthYear"),"1970");
        driver.findElement(By.id("Email")).sendKeys(email);
        driver.findElement(By.id("Password")).sendKeys(password);
        driver.findElement(By.id("ConfirmPassword")).sendKeys(confirmpassword);
        driver.findElement(By.id("register-button")).click();
        driver.manage().timeouts().implicitlyWait(40, TimeUnit.SECONDS);


    }
}
