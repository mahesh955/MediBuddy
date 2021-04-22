package com.page.forms;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.utils.BaseClass;

import io.appium.java_client.android.AndroidDriver;

    public class Createaccountpage_termsandconditionsform extends BaseClass {
	public Createaccountpage_termsandconditionsform(AndroidDriver driver , ExtentTest test) {
		this.driver=driver;
		this.test=test;
		PageFactory.initElements(driver, this);
		
}
	
	@FindBy(xpath="//android.widget.TextView[@text='Terms and conditions']")
	public WebElement termsandconitionslink;
	
	@FindBy(xpath="//android.view.View[@text='Signup']")
	public WebElement signuplink_termsandconditions;
	
	@FindBy(className="//android.widget.EditText[1]")
	public WebElement nametextbox;
	
	@FindBy(xpath="(//*[@id='user-profile']/*[@class='android.widget.EditText'])[1]")
	public WebElement phonenumbertexrbox;
	
	@FindBy(className="//android.widget.EditText[2]") 
	public WebElement emailtextbox;
	
	@FindBy(className="//android.widget.EditText[3]" )
	public WebElement passwordtextbox;
	
	@FindBy(xpath="//android.widget.CheckBox[@text='Show password']")
	public WebElement clickonshowpassworbutton;
	
	@FindBy(xpath="//android.widget.FrameLayout[@text='Register']" )
	public WebElement clickonregisterbutton;
	
	@FindBy(xpath="//android.view.View[@text='Verification']")
	public WebElement verificationpage;
	
	public void verifycreteaccountpagedata (String name,String phonenumber,String email,String password) {
		try {
			
			termsandconitionslink.click();
			test.log(Status.INFO, MarkupHelper.createLabel("Clicked on termsandconitionslink", ExtentColor.BLUE));
			print("Clicked on termsandconitionslink on First Screen");
			Assert.assertTrue(signuplink_termsandconditions.isDisplayed());
			test.log(Status.INFO, MarkupHelper.createLabel("termsandconditions is Displayed", ExtentColor.BLUE));
			print("termsandconditions is Displayed once Clicked on termsandconitionslink");
			signuplink_termsandconditions.click();
			test.log(Status.INFO, MarkupHelper.createLabel("Clicked on signuplink_termsandconditions", ExtentColor.BLUE));
			print("Clicked on signuplink_termsandconditions");
			Assert.assertTrue(nametextbox.isDisplayed());
			test.log(Status.INFO, MarkupHelper.createLabel("nametextbox is Displayed so we are in registerpage", ExtentColor.BLUE));
			nametextbox.sendKeys(name);
			test.log(Status.INFO, MarkupHelper.createLabel("name is entered as "+name, ExtentColor.BLUE));
			print("name is entered as "+name);
			phonenumbertexrbox.sendKeys(phonenumber);
			test.log(Status.INFO, MarkupHelper.createLabel("phone number is entered "+phonenumber, ExtentColor.BLUE));
			print("phone number is entered "+phonenumber);
			emailtextbox.sendKeys(email);
			test.log(Status.INFO, MarkupHelper.createLabel("emial is entered "+email, ExtentColor.BLUE));
			print("emial is entered "+email);
			passwordtextbox.sendKeys(password);
			test.log(Status.INFO, MarkupHelper.createLabel("password entered "+password, ExtentColor.BLUE));
			print("password entered  "+password);
			clickonshowpassworbutton.click();
			test.log(Status.INFO, MarkupHelper.createLabel("clicked on show password button ", ExtentColor.BLUE));
			print("clicked on show password button  "+password);
			String passwordvalue=passwordtextbox.getText();
		if(passwordvalue.equalsIgnoreCase(password)) {
			test.log(Status.INFO, MarkupHelper.createLabel("get password value and entered password value is matched ", ExtentColor.BLUE));
			print("get password value and entered password value is matched ");
			
		}else {
			test.log(Status.INFO, MarkupHelper.createLabel("get password value and entered password value is not matched ", ExtentColor.BLUE));
			print("get password value and entered password value is not matched ");	
			}
		clickonregisterbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("clicked on register button ", ExtentColor.BLUE));
		print("clicked on register button  "+password);
		Assert.assertTrue(verificationpage.isDisplayed());
		test.log(Status.INFO, MarkupHelper.createLabel("verification page is Displayed", ExtentColor.BLUE));
		print("verification page is Displayed");
		
		} catch (Exception e) {
			// TODO: handle exception
		}
		
	}
       
	

}
