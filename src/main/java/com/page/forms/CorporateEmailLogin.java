package com.page.forms;

import org.apache.xmlbeans.impl.xb.xsdschema.Public;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.utils.BaseClass;

import bsh.This;
import io.appium.java_client.android.AndroidDriver;

  public class CorporateEmailLogin extends BaseClass{

  public CorporateEmailLogin(AndroidDriver driver, ExtentTest test) {
      this.driver = driver;
      this.test = test;
     PageFactory.initElements(driver, this); 
  }
 
   @FindBy(id = "tvLoginWithCorporate")
   public static WebElement corporteaccountlink;
   
   @FindBy(id = "textinput_placeholder")
   public static WebElement registeremail_emailtextbox;
   
   @FindBy(id = "btnSignIn")
   public static WebElement clickonproceedbutton;
   
   @FindBy(xpath = "//android.widget.TextView[@text='Log In']")
   public static WebElement Loginpage;
   
   @FindBy(id = "etPassword")
   public static WebElement enterpassword_passwordtextbox;
   
   @FindBy(id="cbValidatedFields")
   public static WebElement checkckeckbox;
   
   @FindBy(id = "btnSignIn")
   public static WebElement clickonsigninbutton;
   
   @FindBy(id = "customMediBuddyTextView")
   public static WebElement exclusivebenifitspage;
   
   public void verifyingcorporateemaillogin(String email, String password) {
	   try {
		   
		corporteaccountlink.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on corporteaccountlink", ExtentColor.BLUE));
		print("Clicked on corporteaccountlink on First Screen");
		Assert.assertTrue(registeremail_emailtextbox.isDisplayed());
		test.log(Status.INFO, MarkupHelper.createLabel("entervalidemail_emailtextbox is Displayed", ExtentColor.BLUE));
		registeremail_emailtextbox.sendKeys(email);
		print("Email is entered");
		clickonproceedbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on proceedbutton", ExtentColor.BLUE));
		print("Clicked on proceed button on second screen");
		Assert.assertTrue(Loginpage.isDisplayed());
		enterpassword_passwordtextbox.sendKeys(password);  
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on passwordtextbox", ExtentColor.BLUE));
		print("Passwor entered");
		checkckeckbox.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on checkckeckbox", ExtentColor.BLUE));
		clickonsigninbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on clickonsigninbutton", ExtentColor.BLUE));
		Assert.assertTrue(exclusivebenifitspage.isDisplayed()); 
		test.log(Status.INFO, MarkupHelper.createLabel("exclusive benifits page is Displayed", ExtentColor.BLUE));
		print("exclusive benifits page page is Displayed");
		
  } catch (Exception e) {
		// TODO: handle exception
	}





   }
}
