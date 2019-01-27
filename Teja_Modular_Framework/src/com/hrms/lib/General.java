package com.hrms.lib;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import static org.testng.Assert.assertTrue;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.utility.Log;

import org.openqa.selenium.WebElement;

public class General extends Global{
	
	public void openapplication() throws Exception{
		Log.info("********** Started application***************");
		System.setProperty("webdriver.chrome.driver", "D:\\Testing_Teja\\Selenium_Student_SW\\Drivers\\chromedriver_win32\\chromedriver.exe");
		driver=new ChromeDriver();
		driver.get(url);
		Thread.sleep(3000);
		//Title verification
		if(driver.getTitle().equals("OrangeHRM - New Level of HR Management")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
	}
	
	public void login(String a,String b) {		//public void login(){
		Log.info("***********Login completed********");
		driver.findElement(By.xpath(txt_loginname)).sendKeys(un);
		driver.findElement(By.name(txt_password)).sendKeys(pw);
		driver.findElement(By.name(btn_login)).click();
		if(driver.getTitle().equals("OrangeHRM")) {
			System.out.println("Title matched");
		}
		else {
			System.out.println("Title not matched");
		}
		//Text Verified
		assertTrue(driver.findElement(By.xpath(txt_wlcm)).getText().matches("Welcome admin"));
	}
	public void mousseoverpim() throws Exception{
		
		Actions pim=new Actions(driver);
		WebElement pimele=driver.findElement(By.linkText(link_pim));
		pim.moveToElement(pimele).perform();
		Thread.sleep(3000);
	}
	
	public void addempl() throws Exception {
		Log.info("********************Added employees*****************");
		driver.findElement(By.linkText(link_addemp)).click();
		Thread.sleep(3000);
		driver.switchTo().frame(frame_id);
		driver.findElement(By.name(txt_lastname)).sendKeys(last_name);
		driver.findElement(By.name(txt_firstname)).sendKeys(first_name);
		driver.findElement(By.xpath(btn_save)).click();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.switchTo().defaultContent();
	}
	
	public void delempl() throws Exception{
		Log.info("**********************Deleted completed********************");
		driver.findElement(By.linkText(link_emplist)).click();
		//select search from dropdown
		driver.switchTo().frame(frame_id);
		Select sc=new Select(driver.findElement(By.name(drp_search)));
		sc.selectByVisibleText("Emp. ID");
		driver.findElement(By.name(txt_search)).sendKeys(search);
		driver.findElement(By.xpath(btn_search)).click();
		//Select checkbox
		WebElement table=driver.findElement(By.xpath(table_1));
		List<WebElement>rows=table.findElements(By.tagName("tr"));
		System.out.println(rows.size());
		for(int i=1;i<rows.size();i++) {
			driver.findElement(By.xpath("//*[@id=\'standardView\']/table/tbody/tr["+i+"]/td[1]/input")).click();
			
		}
		Thread.sleep(3000);
		driver.findElement(By.xpath(btn_del)).click();
		driver.switchTo().defaultContent();
		
	}
	
	public void logout() {
		driver.findElement(By.linkText(link_logout)).click();
	}
	public void closapplication() {
		driver.quit();
	}
}
