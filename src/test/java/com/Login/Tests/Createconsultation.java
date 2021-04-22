package com.Login.Tests;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.page.forms.Consultationform;
import com.utils.BaseClass;
import com.utils.DataDriven;

public class Createconsultation extends BaseClass {
// 2 Verify if user is able to create a consultation
// women issues
	@Test(dataProvider = "data_createconsulatrion",enabled = false)
 public void Verifyifuserisabletocreateaconsultationtest(HashMap<String, String> hash) {
	test = extentReports.createTest(" Verify if user is able to create a consultation");
	Consultationform createconsultaionform = new Consultationform(driver, test);
	createconsultaionform.createconsultation(hash.get("headerValue"), hash.get("headerValue1"),hash.get("symptomsdescription"));
 }
	
//3 Verify if user is getting the clara questions
//GeneralPhysician
	
	@Test(dataProvider = "data_createconsulatrion",enabled=false)
		public void Verifyuserisgettingtheclaraquestionstest(HashMap<String, String> hash) {
			test = extentReports.createTest(" Verify if user is getting the clara questions");
			Consultationform createconsultaionform = new Consultationform(driver, test);
     createconsultaionform.Verifyifuserisgettingtheclaraquestions(hash.get("headerValue"), hash.get("headerValue1"),
    			hash.get("symptomsdescription"));
  }
// 4 Verify affinity flow
// skinproblemsButton
	
	@Test(dataProvider = "data_createconsulatrion",enabled=false)
	public void Verifyaffinityflowtesttest(HashMap<String, String> hash) {
		test = extentReports.createTest("Verify affinity flow ");
		Consultationform createconsultaionform = new Consultationform(driver, test);
		System.out.println(hash.get("entertext"));
		createconsultaionform.Verifyaffinityflow(hash.get("headerValue"), hash.get("headerValue1"),
    			hash.get("symptomsdescriptionskin"),hash.get("entertext"));
  }

// 5 Verify opting for affinity flow
// skin problems
	
	@Test(dataProvider = "data_createconsulatrion" ,enabled=false )
	public void Verifyoptingforaffinityflowtest(HashMap<String, String> hash) {
		test = extentReports.createTest(" Verify opting for affinity flow");
		Consultationform createconsultaionform = new Consultationform(driver, test);
		createconsultaionform.Verifyoptingforaffinityflow(hash.get("headerValue"), hash.get("headerValue1"),
    			hash.get("symptomsdescriptionskin"),hash.get("entertext"));
  }
	
//6 Verify not opting for affinity flow
//skin problems
	
	@Test(dataProvider = "data_createconsulatrion",enabled=false)
	public void Verifynotoptingforaffinityflowtest(HashMap<String, String> hash) {
		test = extentReports.createTest(" Verify not opting for affinity flow");
		Consultationform createconsultaionform = new Consultationform(driver, test);
		createconsultaionform.Verifynotoptingforaffinityflow(hash.get("headerValue"), hash.get("headerValue1"),
				hash.get("symptomsdescriptionskin"),hash.get("entertext"));
  }
	
//7 Verify affinity flow doctor list
//skin problems
		
		@Test(dataProvider = "data_createconsulatrion",enabled=false)
		public void Verifyaffinityflowdoctorlisttest(HashMap<String, String> hash) {
			test = extentReports.createTest(" Verify affinity flow doctor list");
			Consultationform createconsultaionform = new Consultationform(driver, test);
			createconsultaionform.Verifyaffinityflowdoctorlist(hash.get("headerValue"), hash.get("headerValue1"),
					hash.get("symptomsdescriptionskin"),hash.get("entertext"));
	  }


//8 Verify affinity flow doctor assignment
//skin problems
	@Test(dataProvider = "data_createconsulatrion",enabled=false)
	public void Verifyaffinityflowdoctorassignmenttest(HashMap<String, String> hash) {
		test = extentReports.createTest("  Verify affinity flow doctor assignment");
		Consultationform createconsultaionform = new Consultationform(driver, test);
		createconsultaionform.Verifyaffinityflowdoctorassignment(hash.get("headerValue"), hash.get("headerValue1"),
				hash.get("symptomsdescriptionskin"),hash.get("entertext"));
  }

	//9 Verify image upload flow for affinity doctor
	//GeneralPhysician
		
		@Test(dataProvider = "data_createconsulatrion",enabled=false)
			public void Verifyimageuploadflowforaffinitydoctortest(HashMap<String, String> hash) {
				test = extentReports.createTest(" Verify image upload flow for affinity doctor");
				Consultationform createconsultaionform = new Consultationform(driver, test);
	     createconsultaionform.Verifyimageuploadflowforaffinitydoctor(hash.get("headerValue"), hash.get("headerValue1"),
	    			hash.get("symptomsdescription"));
	  }	
	
	
	
//10 Verify image upload flow for currently available doctor
//skin problems	
	
	@Test(dataProvider = "data_createconsulatrion",enabled=false)
	public void Verifyimageuploadflowforcurrentlyavailabledoctortest(HashMap<String, String> hash) {
		test = extentReports.createTest(" Verify image upload flow for currently available doctor");
		Consultationform createconsultaionform = new Consultationform(driver, test);
		createconsultaionform.Verifyimageuploadflowforcurrentlyavailabledoctor(hash.get("headerValue"), hash.get("headerValue1"),
				hash.get("symptomsdescriptionskin"),hash.get("entertext"));
  }
	
//11 Verify selecting Yes for image upload flow
//skin problems	

	@Test(dataProvider = "data_createconsulatrion")
	public void VerifyselectingYesforimageuploadflowtest(HashMap<String, String> hash) {
		test = extentReports.createTest("Verify selecting Yes for image upload flow");
		Consultationform createconsultaionform = new Consultationform(driver, test);
		createconsultaionform.VerifyselectingYesforimageuploadflow(hash.get("headerValue"), hash.get("headerValue1"),
				hash.get("symptomsdescriptionskin"),hash.get("entertext"));
  }
	
// 12 Verify selecting No for image upload flow
//skin problems	
	
	@Test(dataProvider = "data_createconsulatrion",enabled=false)
	public void VerifyselectingNoforimageuploadflowtest(HashMap<String, String> hash) {
		test = extentReports.createTest(" Verify selecting No for image upload flow");
		Consultationform createconsultaionform = new Consultationform(driver, test);
		createconsultaionform.VerifyselectingNoforimageuploadflow(hash.get("headerValue"), hash.get("headerValue1"),
				hash.get("symptomsdescriptionskin"),hash.get("entertext"));
  }	

	
// 13 Verify not selecting any option in image upload flow
// skin problems	
	
	@Test(dataProvider = "data_createconsulatrion",enabled=false)
	public void Verifynotselectinganyoptioninimageuploadflowtest(HashMap<String, String> hash) {
		test = extentReports.createTest("Verify not selecting any option in image upload flow");
		Consultationform createconsultaionform = new Consultationform(driver, test);
		createconsultaionform.Verifynotselectinganyoptioninimageuploadflow(hash.get("headerValue"), hash.get("headerValue1"),
				hash.get("symptomsdescriptionskin"),hash.get("entertext"));
  }
	

	
@DataProvider
public Object[][] data_createconsulatrion() throws Exception{
return DataDriven.getData("D:\\Medibuddy\\Medibuddy\\Login.xlsx", "CreateConsulatntFlow");
	
}
}