package org.iit.mmp.tests;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScheduleAppointment {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("http://96.84.175.78/MMP-Release2-Integrated-Build.6.8.000/portal/login.php");
		driver.findElement(By.id("username")).sendKeys("ria1");
		driver.findElement(By.id("password")).sendKeys("Ria12345");
		driver.findElement(By.name("submit")).submit();
		driver.findElement(By.xpath("//a/span[contains(text(),'Schedule')]")).click();
		driver.findElement(By.xpath("//input[@value='Create new appointment']")).click();
		//For Selecting the doctor
		//use xpath axes locator-sibling,parentchild
		//setting a doctor/date/time and symptoms
		  String doc="Dr.Charlie";
		  String year="2018";
		  String month="June";
		  String day="10";
		  String time="10Am";
		  String symp="Fever";

		  //login
		  driver.findElement(By.id("username")).sendKeys("ria1");
		  driver.findElement(By.id("password")).sendKeys("Ria12345");
		  driver.findElement(By.name("submit")).click();;

		  //Schedule Appointment
		  driver.findElement(By.xpath("//span[contains(text(),'Schedule Appointment')]")).click();
		  driver.findElement(By.xpath("//input[@type='submit']")).click();

		  //make an appointment
		  driver.findElement(By.xpath("//h4[text()='"+doc+"']/../../following-sibling::button")).click();

		  
		  
		  
		 driver.switchTo().frame("myframe");
		 String expDate="January 2019";
		 
		 String actDate = driver.findElement(By.className("ui-datepicker-title")).getText();
		 
		 while(!(expDate.equals(actDate)))
		{
			 driver.findElement(By.className("ui-icon ui-icon-circle-triangle-e")).click();
			 actDate = driver.findElement(By.className("ui-datepicker-year")).getText();
			 
			 										
		}
		 
		 String date="20";
		 List<WebElement> list = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td/a"));
		 for(int i = 0 ;i<list.size();i++)
		 {
			 if(list.get(i).getText().equals(date))
			 {
				 
			 }
		 }
		 
		 int a = 5,b=10;
		 while(a!=b)
		 {
			 System.out.println("in while");
			 a=10;
		 }
		 
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  

	}

}
