package com.hrms.TestScripts;



import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

import com.hrms.lib.*;
import com.utility.Log;

public class TC_101_VerifyingLogin {
@Test(		groups="Regression")
	public void verifying_login() throws Exception {//no need of main method in testng framework but we need to create any method
	DOMConfigurator.configure("log4j.xml");
	General g=new General();
	g.openapplication();
	g.login("admin","admin");	//g.login();
	g.logout();
	g.closapplication();

	}

}
