package com.hrms.TestScripts;
import com.hrms.lib.*;

import org.apache.log4j.xml.DOMConfigurator;
import org.testng.annotations.Test;

public class TC_103_Del_Emp {
	@Test
	public void deleteemployee() throws Exception{
		DOMConfigurator.configure("log4j.xml");
		General g=new General();
		g.openapplication();
		g.login("admin","admin");	//g.login();
		g.mousseoverpim();
		g.delempl();
		g.logout();
		g.closapplication();
		
		
	}

}
