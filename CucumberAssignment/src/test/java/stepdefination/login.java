package stepdefination;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import hooks.hooksclass;

import org.junit.Assert;

public class login {
	WebDriver driver = hooksclass.driver;
	
//Login feature

@Given("user is on login page")
public void user_is_on_login_page() {
	
	driver.get("http://uniformm1.upskills.in/admin/");
}



@When("user enter valid username {string} and password {string}")
public void user_enter_valid_username_and_password(String username, String password) {
	driver.findElement(By.id("input-username")).sendKeys(username);
	   driver.findElement(By.id("input-password")).sendKeys(password);
}

@When("user clicks on login button")
public void user_clicks_on_login_button() {
	   driver.findElement(By.xpath("//button")).click();;

}


@Then("user navigates to homepage")
public void user_navigates_to_homepage() throws InterruptedException {
  Assert.assertTrue(driver.getTitle().contains("Dashboard"));
  Thread.sleep(2000);

}

//Cancel Button feature

@When("click on Cancel button")
public void click_on_Cancel_button() {
	   driver.findElement(By.xpath("//a[@data-original-title='Cancel']")).click();

}


//Add Product feature


@When("user click on menu")
public void user_click_on_menu() throws InterruptedException {
	   driver.findElement(By.id("button-menu")).click();
	   Thread.sleep(1000);

}

@When("click on catalog")
public void click_on_catalog() throws InterruptedException {
	   driver.findElement(By.id("catalog")).click();
	   Thread.sleep(1000);

}

@When("click on manufactures")
public void click_on_manufactures() {
	   driver.findElement(By.xpath("//li[@id='catalog']/ul/li[7]/a")).click();

}

@When("click on Add button")
public void click_on_Add_button() {
	   driver.findElement(By.xpath("//div[@class='pull-right']/a")).click();

}

@When("enter manufactures details name {string} url {string} sort {string}")
public void enter_manufactures_details_name_url_sort(String name, String url, String sort) throws InterruptedException {
	
	driver.findElement(By.id("input-name")).sendKeys(name);
	   Thread.sleep(1000);

	   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	   Thread.sleep(1000);

	   driver.findElement(By.id("input-keyword")).sendKeys(url);
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[4]/div/a/img")).click();
	   Thread.sleep(1000);

	   driver.findElement(By.id("button-image")).click();
	   Thread.sleep(6000);

	   driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[4]/div[4]/a/img")).click();
	   Thread.sleep(3000);

	   driver.findElement(By.id("input-sort-order")).sendKeys(sort);
	   Thread.sleep(1000);

	
}

@When("click on submit button")
public void click_on_submit_button() throws InterruptedException {
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/button")).click();
	   Thread.sleep(1000);

}

@Then("user is on manufacture details page")
public void user_is_on_manufacture_details_page() throws InterruptedException {
	Assert.assertTrue(driver.getTitle().contains("Manufacturers"));
	  Thread.sleep(1000);

}

@Then("user is on manufacture page with success message")
public void user_is_on_manufacture_page_with_success_message() throws InterruptedException {
	String expectedMessage = "Success: You have added manufacturers!" + '\n' + "×";
	String message = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]")).getText();
	Assert.assertEquals(message,expectedMessage);
    Thread.sleep(1000);
}

//Mandatory Field

@Then("user will get mandatory field validation")
public void user_will_get_mandatory_field_validation() {
	
	String expectedMessage = "Manufacturer Name must be between 2 and 64 characters!";
	String message = driver.findElement(By.xpath("//div[@class='text-danger']")).getText();
    Assert.assertEquals(expectedMessage, message);

}

//Edit Product


@When("user click on edit button")
public void user_click_on_edit_button() {
	   driver.findElement(By.xpath("/html/body/div[1]/div/div[2]/div/div[2]/form/div/table/tbody/tr[8]/td[4]/a")).click();

}

@When("change manufactures details name {string} url {string} sort {string}")
public void change_manufactures_details_name_url_sort(String name, String url, String sort) throws InterruptedException {
	
	   driver.findElement(By.id("input-name")).clear();
	   driver.findElement(By.id("input-name")).sendKeys(name);
	   Thread.sleep(1000);

	   driver.findElement(By.xpath("//input[@type='checkbox']")).click();
	   Thread.sleep(1000);

	   driver.findElement(By.id("input-keyword")).clear();
	   driver.findElement(By.id("input-keyword")).sendKeys(url);
	   Thread.sleep(1000);
	   
	   driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/form/div[4]/div/a/img")).click();
	   Thread.sleep(1000);

	   driver.findElement(By.id("button-image")).click();
	   Thread.sleep(10000);

	   driver.findElement(By.xpath("/html/body/div[2]/div/div/div[2]/div[4]/div[3]/a/img")).click();
	   Thread.sleep(1000);

	   driver.findElement(By.id("input-sort-order")).clear();
	   driver.findElement(By.id("input-sort-order")).sendKeys(sort);
	   Thread.sleep(1000);

}
@Then("user is on manufacture page with edited success message")
public void user_is_on_manufacture_page_with_edited_success_message() throws InterruptedException {
	
	String expectedMessage = "Success: You have modified manufacturers!" + '\n' + "×";
	String message = driver.findElement(By.xpath("//div[@class='alert alert-success']")).getText();
	System.out.println(expectedMessage);
	System.out.println(message);

	Assert.assertEquals(message,expectedMessage);
    Thread.sleep(1000);
}

//Delete Feature

@When("user select the item to delete")
public void user_select_the_item_to_delete() throws InterruptedException {

	   driver.findElement(By.xpath("//input[@value='581']")).click();
	   Thread.sleep(1000);
}

@When("user click on delete button")
public void user_click_on_delete_button() throws InterruptedException {
	driver.findElement(By.xpath("/html/body/div[1]/div/div[1]/div/div/button")).click();
	   Thread.sleep(1000);

	   Alert alert = driver.switchTo().alert();		
       Thread.sleep(1000);
       alert.accept();	
       Thread.sleep(1000);

}

@Then("user is on manufacture page with delete success message")
public void user_is_on_manufacture_page_with_delete_success_message() throws InterruptedException {
	
	String expectedMessage = "Success: You have deleted manufacturers!" + '\n' + "×";
	String message = driver.findElement(By.xpath("/html/body/div/div/div[2]/div[1]")).getText();
	Assert.assertEquals(message,expectedMessage);
    Thread.sleep(1000);
	
}





}
