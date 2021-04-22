package com.Login.Tests;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReporter;
import com.page.forms.CorporateEmailLogin;
import com.utils.BaseClass;
import com.utils.DataDriven;

public class CorporateEmailLoginTestcase extends BaseClass{
	
	@Test(dataProvider = "data_login")
	
	public  void login(HashMap<String, String> hash) throws Exception {
try {
	
	test = extentReports.createTest("Medibuddy Login With Invalid Otp Test Case");
    CorporateEmailLogin corporateaccount= new CorporateEmailLogin(driver, test);
    corporateaccount.verifyingcorporateemaillogin(hash.get("email"), hash.get("password"));
	} catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
	}
	}
    
	@DataProvider
    public  Object[][] data_register() throws Exception {
 		return DataDriven.getData("D:\\Medibuddy\\Medibuddy\\Login.xlsx", "Corporate Account");
 	}
	}
