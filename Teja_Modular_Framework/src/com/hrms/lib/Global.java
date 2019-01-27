package com.hrms.lib;

import org.openqa.selenium.WebDriver;

public class Global {
	//====================Variables Info========================
public WebDriver driver;
public String url="http://127.0.0.1/orangehrm-2.6/login.php";
public String un="admin";
public String pw="admin";
public String last_name="Selenium";
public String first_name="Teja";
public String search="00";
	//==================Objects=================================
public String txt_loginname="//input[@name='txtUserName']";
public String txt_password="txtPassword";
public String btn_login="Submit";
public String txt_wlcm="//ul[@id='option-menu']/li[1]";
public String link_logout="Logout";
public String link_pim="PIM";
public String link_addemp="Add Employee";
public String frame_id="rightMenu";
public String txt_lastname="txtEmpLastName";
public String txt_firstname="txtEmpFirstName";
public String btn_save="//input[@value='Save']";
public String link_emplist="Employee List";
public String drp_search="loc_code";
public String txt_search="loc_name";
public String btn_search="//input[@value='Search']";
public String table_1="//table[@class='data-table']";
public String btn_del="//input[@value='Delete']";


}
