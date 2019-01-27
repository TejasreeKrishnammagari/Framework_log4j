package com.hrms.TestScripts;
import com.hrms.lib.*;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;


public class TC_102_Add_NewEmp {
	@Test
	public void addemployee() throws Exception {
		DOMConfigurator.configure("log4j.xml");
		General g=new General();
		g.openapplication();
		g.login("admin","admin");	//g.login();
		g.mousseoverpim();
		g.addempl();
		g.logout();
		g.closapplication();
		
		
	}

}
