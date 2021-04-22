package com.Login.Tests;

import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.forms.Createaccountpage_termsandconditionsform;
import com.utils.BaseClass;
import com.utils.DataDriven;

public class CreateaccountpageTestCase extends BaseClass {

    @Test(dataProvider = "data_register" )
    
    public  void login(HashMap<String, String> hash) throws Exception {
    test = extentReports.createTest("Medibudy register valid data Test Case");
    Createaccountpage_termsandconditionsform createaccount= new Createaccountpage_termsandconditionsform(driver, test);
    createaccount.verifycreteaccountpagedata(hash.get("Name"), hash.get("Phonenumber"), hash.get("Email"), hash.get("Password"));
	
}
   @DataProvider
   public  Object[][] data_register() throws Exception {
		return DataDriven.getData("D:\\Medibuddy\\Login.xlsx", "Create Account In Terms and con");
	}
	
	}
