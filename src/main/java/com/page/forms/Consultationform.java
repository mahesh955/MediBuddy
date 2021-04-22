package com.page.forms;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.utils.BaseClass;
import com.utils.loginOtp;

import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

public class Consultationform extends BaseClass {
	public Boolean flag;
	public Consultationform(AndroidDriver driver, ExtentTest test) {
		this.driver = driver;
		this.test = test;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//*[@resource-id='com.google.android.gms:id/cancel']")
	public static WebElement phoneNumberPicklayout;

	@FindBy(id = "iv_home")
	public static WebElement homeButton_PatientDetailsPage;

	@FindBy(xpath = "//android.widget.TextView[@text='Talk to Doctor\n']")
	public static WebElement click_talktodoctor;

	@FindBy(id = "tv_toolbar_title")
	public static WebElement gettext_toolbartitle;

	@FindBy(id = "femaleImage")
	public static WebElement select_femaleimage;

	@FindBy(id = "btn_next")
	public static WebElement clicked_nextbutton;

	@FindBy(id = "tv_select_health_problem")
	public static WebElement gettext_headbartitle;

	@FindBy(xpath = "(//android.widget.TextView)[7]")
	public static WebElement clicked_womenissues;

	@FindBy(id = "query")
	public static WebElement entertext_description;

	@FindBy(id = "btn_start_consultation")
	public static WebElement clicked_startconsultationbutton;

	@FindBy(id = "video_container")
	public static WebElement select_vedioconsult;

	@FindBy(id = "tv_video_permissions_confirm")
	public static WebElement confirm_consultationtype;

	@FindBy(id = "rv_chat")
	public static WebElement chatpage_displayed;

	@FindBy(xpath = "//android.widget.TextView[@text ='Enter Mobile Number']")
	public static WebElement phoneNumber_EntryField;

	@FindBy(id = "tvGetOtp")
	public static WebElement getOtp_button;

	@FindBy(id = "edMobile")
	public static WebElement phoneNumber_EntryTxtbox;

	@FindBy(id = "clEnterOtp")
	public static WebElement otp_Layout;

	@FindBy(id = "edDig1")
	public static WebElement otp_Entry1;

	@FindBy(id = "tvVerify")
	public static WebElement otp_VerifyButton;

	// 3 verify if user is getting the clara questions
	// General physician

	@FindBy(xpath = "//*[@text='General Physician']")
	public static WebElement clicked_GeneralPhysicianButton;
//
//	@FindBy(id = "query")
//	public static WebElement Entertext_description;

	@FindBy(id = "btn_start_consultation")
	public static WebElement cliked_startconsultationButton;

	@FindBy(id = "video_container")
	public static WebElement select_videocontainer;

	@FindBy(id = "tv_video_permissions_confirm")
	public static WebElement click_confirm;

	@FindBy(id = "rv_chat")
	public static WebElement chatpageisdisplayed;

	@FindBy(xpath =" //*[@text='No']")
	public static WebElement details_hasitbeentherefor2weeksormore;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement click_submit;

	@FindBy(xpath = "//*[@text='Neither']")
	public static WebElement details_ihave;
	
	@FindBy(xpath = "(//android.widget.CheckBox[@text='Neither']")
	public static WebElement details_ihave2;

	@FindBy(xpath = "//*[@text='SUBMIT' and (./preceding-sibling::* | ./following-sibling::*)[@text='Cough and Cold']]")
	public static WebElement clickonsubmit;

	@FindBy(xpath = "(//*[@id='ll_dynamic_message']/*[@class='android.widget.CheckBox'])[3]")
	public static WebElement details_ihave3q;
	
	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement submit_ihave;
	
	@FindBy(xpath = "//*[@text='No, my problem does not require an image/report']")
	public static WebElement clicked_Nomyproblemdoesnotrequireanimagereport;
	
	@FindBy(xpath = "//*[@text='Doctor who is available in next 30 minutes']")
	public static WebElement selection_DoctorPreference;
	
	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement submitButton_selection_DoctorPreference;

	@FindBy(xpath = "//*[@text='SUBMIT' and (./preceding-sibling::* | ./following-sibling::*)[@text='Do you have an image/lab report which you want to share with the doctor?']]")
	public static WebElement clickon_submit;
	
	@FindBy(xpath = "//*[@id='offer_section_container']")
	public static WebElement doctorcardvisible;
	
	@FindBy(xpath ="//*[@class='android.widget.LinearLayout' and ./*[@id='txtVw_docName']]")
	public static WebElement Doctorcardisisplayed;

	// 4 verify affinity flow
	// skin problems

	@FindBy(xpath  = "//android.widget.TextView[@text='Skin problems']")
	public static WebElement clickon_skinproblemsButton;

	@FindBy(xpath  = "//*[@text='Enter Patient Details']")
	public static WebElement healthproblemspageisdisplayed;

//
//	@FindBy(xpath  = "//android.widget.EditText[@text='itching on the legs']")
//	public static WebElement entertext_description;

	@FindBy(xpath  = "//*[@text='Start Consultation']")
	public static WebElement clickonstartconsultation;

	@FindBy(id = "video_container")
	public static WebElement clickonvideoconsult;

	@FindBy(xpath  = "//*[@text='Confirm']")
	public static WebElement clickonconfirm;

	@FindBy(id = "tv_title_single_line_toolbar")
	public static WebElement Dermatologypagedisplayed;

	@FindBy(xpath  = "//*[@text='Other Issues']")
	public static WebElement clickonotherissues;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement clickonsubmitbutton;
	
//	@FindBy(xpath = "(//android.widget.ImageView[@resource-id = 'in.medibuddy:id/iv_status'])[1]")
//	public static WebElement answersttus ;
	
//	@FindBy(xpath = "(//*[@id='rv_chat']/*/*/*/*/*/*[@id='iv_status'])[2]")
	
	@FindBy(xpath = "//android.widget.EditText[@text='Enter Here']")
	public static WebElement enterherebutton;
	
	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement clickonsubmitButton;
	
	@FindBy(xpath = "//*[@text='No']")
	public static WebElement clickonnonButton;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement clickonsubmitbutton2;

	@FindBy(xpath = "//*[@text='No']")
	public static WebElement clickonnooption;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement clickonsubmitbutton3;
	
	@FindBy(xpath = "(//android.widget.CheckBox[@text='No'])[2]")
	public static WebElement clickonnobuttonotherproblems;

	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
	public static WebElement clickonsubmitbutton4;
	
	

	@FindBy(id = "tv_toolbar_title")
	public static WebElement Doctorcardisdisplayed;

	// 5 verify opting for affinity flow
	// skin problems

//	@FindBy(xpath  = "//android.widget.TextView[@text='Skin problems']")
//	public static WebElement clickonskinproblemsButton;
//
//	@FindBy(id = "tv_select_health_problem")
//	public static WebElement Healthproblemspageisdisplayed;
	
//	@FindBy(id = "query")
//	public static WebElement entertext_description;

//	@FindBy(xpath  = "//*[@id='query']")
//	public static WebElement Enterthe_symptoms;
//
//	@FindBy(id = "btn_start_consultation")
//	public static WebElement Clickonstartconsultation;

//	@FindBy(id = "video_container")
//	public static WebElement clickon_videoconsult;

//	@FindBy(id = "tv_video_permissions_confirm")
//	public static WebElement clickon_confirm;

//	@FindBy(id = "tv_title_single_line_toolbar")
//	public static WebElement Dermatologypage_displayed;
//
//	@FindBy(id = "tv_clara_symptom")
//	public static WebElement clickonother_issues;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickonsubmit_button;
//
//	@FindBy(xpath = "//*[@text='No']")
//	public static WebElement clickonnon_Button;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickonsubmit_button2;
//
//	@FindBy(xpath = "//*[@text='No']")
//	public static WebElement clickon_nooption;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickonsubmit_button3;
//
//	@FindBy(xpath = "//*[@text='No' and (./preceding-sibling::* | ./following-sibling::*)[@text='Do you have any other health problems?']]")
//	public static WebElement clickonnobutton_otherproblems;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickonsubmit_button4;
	@FindBy(xpath = "//android.widget.CheckBox[@text='No, my problem does not require an image']")
	public static WebElement selectnoimageButton;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement ClickonSubmit;

	@FindBy(id = "tv_toolbar_title")
	public static WebElement Doctorcallyoupagedisplayed;


	// 6 Verify not opting for affinity flow
	// skin problems

//	@FindBy(id = "//android.widget.TextView[@text='Skin problems']")
//	public static WebElement clickonskinproblems;
//
//	@FindBy(id = "tv_select_health_problem")
//	public static WebElement Healthproblemspagedisplayed;

//	@FindBy(id = "query")
//	public static WebElement Enterthesymptomsinthebox;

//	@FindBy(id = "btn_start_consultation")
//	public static WebElement Clickonstartconsultationbutton;
//
//	@FindBy(id = "video_container")
//	public static WebElement clickonvideoconsultationbutton;
//
//	@FindBy(id = "tv_video_permissions_confirm")
//	public static WebElement clickon_confirmbutton;
//
//	@FindBy(id = "tv_title_single_line_toolbar")
//	public static WebElement Dermatologypage_isdisplayed;

//	@FindBy(id = "tv_clara_symptom")
//	public static WebElement clickonotherissuesbutton;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickon_submitbutton;

//	@FindBy(xpath = "//[@class='android.widget.EditText' and ./parent::[@id='ll_dynamic_message']]")
//	public static WebElement clickonnosubmitButton;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement clickonsubmitButton2;

	@FindBy(xpath = "//*[@text='No']")
	public static WebElement clickonno_option;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement clickonsubmit_Button3;

	@FindBy(xpath = "//android.widget.CheckBox[@text=' Consult another doctor now - Dr. Sandip Agrawal,with 8 years of experience(available in 30 mins).']")
	public static WebElement clickon30minavailableDr;

	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
	public static WebElement clickonsubmitbutton_avalableDr;

	@FindBy(xpath = "//*[@text='No, my problem does not require an image']")
	public static WebElement selectnoimagebutton;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement Clickonsubmit;

	@FindBy(id = "tv_title_single_line_toolbar")
	public static WebElement Doctorcardpageisdisplayed;
	

	//8 Verify affinity flow doctor assignment
	//skin problems
//	
//	@FindBy(id="(//*[@id='rv_speciality_list']/*[@id='cv_speciality_item'])[4]")
//	public static WebElement clickonskinproblems_DrAssignment;
//	
//	@FindBy(id="query")
//	public static WebElement entertext_DrAssignment;
//	
//	@FindBy(id="btn_start_consultation")
//	public static WebElement clickonstartconsultation_DrAssignment;
//	
//	@FindBy(xpath = "//android.widget.TextView[@text='Video Consult']")
//	public static WebElement clickonvideoconsultbutton_DrAssignment;
//	
//	@FindBy(id="tv_video_permissions_confirm")
//	public static WebElement clickonconfirmbutton_DrAssignment;
//	
//	@FindBy(id="tv_title_single_line_toolbar")
//    public static WebElement Dermatologyissuespageisdisplayed_DrAssignment;
//	
//	@FindBy(id="tv_clara_symptom")
//	public static WebElement clickonotherissues_DrAssignment;
//	
//	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
//	public static WebElement clickonsubmitbutton_DrAssignment;
	
//	@FindBy(xpath = "//android.widget.EditText[@text='Enter Here']")
//	public static WebElement clickonenterheretextbox_DrAssignment;
//	
//	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
//	public static WebElement clickonsubmitbuttondays_DrAssignment;
	
//	@FindBy(xpath = "//android.widget.CheckBox[@text='No']")
//	public static WebElement clickonnotreatment_DrAssignment;
//	
//	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
//	public static WebElement clickonsubmitbuttontreatment_DrAssignment;
	
	@FindBy(xpath = "//android.widget.CheckBox[@text='No, my problem does not require an image']")
	public static WebElement clickonnobutton_DrAssignment;
	
	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
	public static WebElement clickonSubmitbutton_DrAssignment;
	
	@FindBy(id = "txtVw_docName")
	public static WebElement Drcardisdisplayed_DrAssignment;
	
	
	//10 Verify image upload flow for currently available doctor
	// skin problems

//	@FindBy(id="text_view_speciality")
//	public static WebElement clickonskinproblems_currentlyavailableDr;
//	
//	@FindBy(id="query")
//	public static WebElement entertext_currentlyavailableDr;
//	
//	@FindBy(id="btn_start_consultation")
//	public static WebElement clickonstartconsultation_currentlyavailableDr;
//	
//	@FindBy(xpath = "//android.widget.TextView[@text='Video Consult']")
//	public static WebElement clickonvideoconsultbutton_currentlyavailableDr;
//	
//	@FindBy(id="tv_video_permissions_confirm")
//	public static WebElement clickonconfirmbutton_currentlyavailableDr;
//	
//	@FindBy(id="tv_title_single_line_toolbar")
//    public static WebElement Dermatologyissuespageisdisplayed_currentlyavailableDr;
//	
//	@FindBy(id="tv_clara_symptom")
//	public static WebElement clickonotherissues_currentlyavailableDr;
//	
//	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
//	public static WebElement clickonsubmitbutton_currentlyavailableDr;
//	
//	@FindBy(xpath = "//android.widget.EditText[@text='Enter Here']")
//	public static WebElement clickonenterheretextbox_currentlyavailableDr;
//	
//	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
//	public static WebElement clickonsubmitbuttondays_currentlyavailableDr;
//	
//	@FindBy(xpath = "//android.widget.CheckBox[@text='No']")
//	public static WebElement clickonnotreatment_currentlyavailableDr;
//	
//	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
//	public static WebElement clickonsubmitbuttontreatment_currentlyavailableDr;
//	
	@FindBy(id = "ll_chat_message")
	public static WebElement imageuploadboxisdisplayed_currentlyavailableDr;
	
	@FindBy(id="txtVw_docName")
	public static WebElement Doctorcardisdisplayed_currentlyavailableDr;
//	
	
	// 11 Verify selecting Yes for image upload flow
	// skin problems

//	@FindBy(id = "iv_speciality")
//	public static WebElement clickonskinproblems_imageuploadflow;
//
//	@FindBy(id = "tv_select_health_problem")
//	public static WebElement Healthproblemspagedisplayed_imageuploadflow;
//
//	@FindBy(id = "query")
//	public static WebElement Enterthesymptomsinthebox_imageuploadflow;
//
//	@FindBy(id = "btn_start_consultation")
//	public static WebElement Clickonstartconsultationbutton_imageuploadflow;
//
//	@FindBy(id = "video_container")
//	public static WebElement clickonvideoconsultationbutton_imageuploadflow;
//
//	@FindBy(id = "tv_video_permissions_confirm")
//	public static WebElement clickon_confirmbutton_imageuploadflow;
//
//	@FindBy(id = "tv_title_single_line_toolbar")
//	public static WebElement Dermatologypage_isdisplayed_imageuploadflow;
//
//	@FindBy(id = "tv_clara_symptom")
//	public static WebElement clickonotherissuesbutton_imageuploadflow;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickon_submitbutton_imageuploadflow;
//
	@FindBy(xpath = "//*[@text='No']")
	public static WebElement clickonnosubmitButton_imageuploadflow;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement clickonsubmitButton_imageuploadflow;

	@FindBy(xpath = "//*[@text='No']")
	public static WebElement clickonno_option_imageuploadflow;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement clickonsubmit_Button_imageuploadflow;

	@FindBy(xpath = "//android.widget.CheckBox[@text='Yes, I will upload an image now']")
	public static WebElement clickonyesimageuploadbutton_imageuploadflow;

	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
	public static WebElement clickonsubmitbutton_imageuploadflow;

	@FindBy(xpath = "//android.widget.Button[@text='UPLOAD IMAGE OF AFFECTED AREA']")
	public static WebElement clickonuploadimageofaffectedarea_imageuploadflow;
	
	@FindBy(xpath  = "//android.widget.TextView[@text='Camera']")
	public static WebElement clickonCamera_imageuploadflow;
	
	@FindBy(xpath = "//*[@text='While using the app']")
	public static WebElement clickonwhileusingtheapp ;
	
	@FindBy(xpath = "//*[@text='Allow']")
	public static WebElement clickonallowbutton ;
	

	

//	@FindBy(id = "mode_options_overlay")
//	public static WebElement cameraisopen_imageuploadflow; 

	@FindBy(xpath = "(//android.widget.ImageButton)[9]")
	public static WebElement clickoncamerasymbol_imageuploadflow;

	@FindBy(xpath = "//android.widget.Button[@text='OK']")
	public static WebElement clickonokbutton_imageuploadflow;

	@FindBy(xpath = "//android.widget.TextView[@text='Upload Record']")
	public static WebElement clickonuploadrecordbutton_imageuploadflow;

	@FindBy(xpath = "//android.widget.Button[@text='YES']")
	public static WebElement clickonyesbutton_correctphoto_imageuploadflow;

	@FindBy(id = "iv_chat")
	public static WebElement imageisdisplayed_imageuploadflow;

	@FindBy(xpath = "(//android.widget.TextView)[1]")
	public static WebElement Doctorcardisdisplayed_imageuploadflow;
	
   // 12 Verify selecting No for image upload flow
	// skin problems

//	@FindBy(id = "iv_speciality")
//	public static WebElement clickonskinproblems_CurrentlyDr;
//
//	@FindBy(id = "tv_select_health_problem")
//	public static WebElement Healthproblemspagedisplayed_CurrentlyDr;
//
//	@FindBy(id = "query")
//	public static WebElement Enterthesymptomsinthebox_CurrentlyDr;
//
//	@FindBy(id = "btn_start_consultation")
//	public static WebElement Clickonstartconsultationbutton_CurrentlyDr;
//
//	@FindBy(id = "video_container")
//	public static WebElement clickonvideoconsultationbutton_CurrentlyDr;
//
//	@FindBy(id = "tv_video_permissions_confirm")
//	public static WebElement clickon_confirmbutton_CurrentlyDr;
//
//	@FindBy(id = "tv_title_single_line_toolbar")
//	public static WebElement Dermatologypage_isdisplayed_CurrentlyDr;
//
//	@FindBy(id = "tv_clara_symptom")
//	public static WebElement clickonotherissuesbutton_CurrentlyDr;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickon_submitbutton_CurrentlyDr;
//
//	@FindBy(xpath = "//[@class='android.widget.EditText' and ./parent::[@id='ll_dynamic_message']]")
//	public static WebElement clickonnosubmitButton_CurrentlyDr;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickonsubmitButton_CurrentlyDr;
//
//	@FindBy(xpath = "//*[@text='No']")
//	public static WebElement clickonno_option_CurrentlyDr;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickonsubmit_Button_CurrentlyDr;
//
//	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
//	public static WebElement clickonsubmitbutton_avalableDr_CurrentlyDr;

	@FindBy(xpath = "//*[@text='No, my problem does not require an image']")
	public static WebElement selectnoimagebutton_CurrentlyDr;

	@FindBy(xpath = "//*[@text='SUBMIT']")
	public static WebElement Clickonsubmit_CurrentlyDr;

	@FindBy(id = "txtVw_docName")
	public static WebElement DoctorCardisdisplayed;

	// 13 Verify not selecting any option in image upload flow
	// skin problems

//	@FindBy(id = "iv_speciality")
//	public static WebElement clickonskinproblems_drcardin5min;
//
//	@FindBy(id = "tv_select_health_problem")
//	public static WebElement Healthproblemspagedisplayed_drcardin5min;
//
//	@FindBy(id = "query")
//	public static WebElement Enterthesymptomsinthebox_drcardin5min;
//
//	@FindBy(id = "btn_start_consultation")
//	public static WebElement Clickonstartconsultationbutton_drcardin5min;
//
//	@FindBy(id = "video_container")
//	public static WebElement clickonvideoconsultationbutton_drcardin5min;
//
//	@FindBy(id = "tv_video_permissions_confirm")
//	public static WebElement clickon_confirmbutton_drcardin5min;
//
//	@FindBy(id = "tv_title_single_line_toolbar")
//	public static WebElement Dermatologypage_isdisplayed_drcardin5min;
//
//	@FindBy(id = "tv_clara_symptom")
//	public static WebElement clickonotherissuesbutton_drcardin5min;
//
//	@FindBy(id = "//*[@text='SUBMIT']")
//	public static WebElement clickon_submitbutton_drcardin5min;
//
//	@FindBy(xpath = "//[@class='android.widget.EditText' and ./parent::[@id='ll_dynamic_message']]")
//	public static WebElement clickonnosubmitButton_drcardin5min;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickonsubmitButton_drcardin5min;
//
//	@FindBy(xpath = "//*[@text='No']")
//	public static WebElement clickonno_option_drcardin5min;
//
//	@FindBy(xpath = "//*[@text='SUBMIT']")
//	public static WebElement clickonsubmit_Button_drcardin5min;
//
	@FindBy(xpath = "//android.widget.Button[@text='SUBMIT']")
	public static WebElement clickonsubmitbutton_drcardin5min;

	@FindBy(xpath  = "//*[@id='txtVw_docName']")
	public static WebElement Doctorcardisdisplayed_drcardin5min;
	
	@FindBy(id = "in.medibuddy:id/tvMobile")
	public static WebElement phoneNumber_Entry_TxtBox;
	
	public void wait(WebElement element) {
		WebDriverWait wait = new WebDriverWait(driver, 60);
		wait.until(ExpectedConditions.visibilityOf(element));
	}

	public void login(String number) throws Exception {

		try {

			System.out.println("Started phone number login test...");
			wait(phoneNumber_Entry_TxtBox);
			phoneNumber_Entry_TxtBox.click();
			print("Clicked on Phone Number Entry Text Box");
			if (phoneNumberPicklayout.isDisplayed()) {
				phoneNumberPicklayout.click();
				print("Clicked on Non of the above Phone Number Layout ");
			} else if (!phoneNumberPicklayout.isDisplayed()) {
				print("Not Clicked on Non of above Phone Numbers because it is an emulator");
			}
			// If phoneNumber is changed here, it should be changed in the query in the
			// loginOtp class as well.
			// Gold: 5599776699, 5599776612, 1234512345, 5599773377
			// Non Gold: 7978565379, 9102049987
			Actions phoneNumber = new Actions(driver);
			Thread.sleep(10000);
			phoneNumber.sendKeys(number);
			phoneNumber.perform();
			test.log(Status.INFO, MarkupHelper.createLabel("Phone Number Entered as :"+number, ExtentColor.BLUE));
			print("Phone Number Entered as :"+number);
			driver.findElement(By.id("in.medibuddy:id/tvGetOtp")).click();
			String newOTP = loginOtp.getLoginOTP(number);
			Thread.sleep(10000);
			Actions OTP = new Actions(driver);
			OTP.sendKeys(newOTP);
			OTP.perform();
			driver.findElement(By.id("in.medibuddy:id/tvVerify")).click();
		} catch (InterruptedException e) {
			print("Unable to login ");
			e.printStackTrace();
		}
	}

//	// 2 Verify if user is able to create a consultation
//	// women issues
	public void createconsultation(String headerValue, String headervalue1, String symptomsdescription) {
		try {
	login("5599773377");
	wait(gettext_toolbartitle);
	print("waited for click to talkdoctor option");
//	click_talktodoctor.click();
//	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//	print("Clicked on Talk to Doctor");
	gettext_toolbartitle.isDisplayed();
	print("Element is displayed");
	String header = gettext_toolbartitle.getText();
	if (header.equalsIgnoreCase(headerValue)) {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue,ExtentColor.BLUE));
	print("Expected Title Value is Matched as :" + headerValue);
	} else {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue,ExtentColor.RED));
	print("Expected Title Value is not Matched as " + headerValue);
		}

	select_femaleimage.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
	print("Selected Female Gender Image");
	clicked_nextbutton.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
	print("Clicked on Next button");
	gettext_headbartitle.isDisplayed();
	print("Element is Displayed");
	String header2 = gettext_headbartitle.getText();
	if (header2.equalsIgnoreCase(headervalue1)) {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
	print("Expected Title value is Displayed: " + headervalue1);
	} else {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1,ExtentColor.RED));
	print("Expected Title value is not displayed" + headervalue1);
			}
	clicked_womenissues.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Women issues", ExtentColor.BLUE));
	print("Clicked on Women Issues");
	entertext_description.sendKeys(symptomsdescription);
	test.log(Status.INFO,MarkupHelper.createLabel("health Issues details enter in Text Box query", ExtentColor.BLUE));
	print("health Issues details enter in Text Box query");
	driver.hideKeyboard();
	clicked_startconsultationbutton.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Start Consultation Button", ExtentColor.BLUE));
	print("Clicked on Start Consultation Button");
//	select_vedioconsult.click();
//	test.log(Status.INFO, MarkupHelper.createLabel("Selected Video  Consult Button", ExtentColor.BLUE));
//	print("Selected Video  Consult Button");
	confirm_consultationtype.click();
	test.log(Status.INFO,MarkupHelper.createLabel("Clicked on Video  Consult Confirmation Button", ExtentColor.BLUE));
	print("Clicked on Video  Consultation Button");
	wait(chatpage_displayed);
	chatpage_displayed.isDisplayed();
	Thread.sleep(20000);
	test.log(Status.INFO, MarkupHelper.createLabel("Chat Page Displayed", ExtentColor.BLUE));
	print("Chat Page is Displayed");
	
	
	
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			driver.closeApp();
		}
	}
//3 Verify if user is getting the clara questions
//GeneralPhysician
	public void Verifyifuserisgettingtheclaraquestions(String headerValue, String headervalue1,
			String symptomsdescription) {

try {
   login("1234512345");
   wait(gettext_toolbartitle);
//   test.log(Status.INFO, MarkupHelper.createLabel("Logged in Successful", ExtentColor.BLUE));
//   print("Logged in successful");
//   click_talktodoctor.click();
//   test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//   print("Clicked on Talk to Doctor");
   gettext_toolbartitle.isDisplayed();
   print("Element is displayed");
   String header=gettext_toolbartitle.getText();	  
    if (header.equalsIgnoreCase(headerValue)) {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.BLUE));
	print("Expected Header Value is Matched as :" + headerValue);
	} else {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.RED));
	print("Expected Hearder Value is not Matched as " + headerValue);
	}
    select_femaleimage.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
	print("Selected Female Gender Image");
	
	clicked_nextbutton.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
	print("Clicked on Next button");
	gettext_headbartitle.isDisplayed();
	print("Element is Displayed");
	String header2=gettext_headbartitle.getText();
	if (header2.equalsIgnoreCase(headervalue1)) {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
	print("Expected Header value is Displayed: " + headervalue1);
	} else {
	test.log(Status.INFO,MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1, ExtentColor.RED));
	print("Expected header value is not displayed" + headervalue1);
	}
	wait(clicked_GeneralPhysicianButton);
	clicked_GeneralPhysicianButton.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on General Physician", ExtentColor.BLUE));
	print("Clicked on General Physician");
	entertext_description.sendKeys(symptomsdescription);
	test.log(Status.INFO, MarkupHelper.createLabel("health Issues details enter in Text Box query", ExtentColor.BLUE));
	print("health Issues details enter in Text Box query");
	driver.hideKeyboard();
	
    clicked_startconsultationbutton.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Start Consultation Button", ExtentColor.BLUE));
	print("Clicked on Start Consultation Button");
	select_vedioconsult.click();
//	test.log(Status.INFO, MarkupHelper.createLabel("Selected Video  Consult Button", ExtentColor.BLUE));
//	print("Selected Video  Consult Button");
//	wait(confirm_consultationtype);
    confirm_consultationtype.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Video  Consult Confirmation Button", ExtentColor.BLUE));
	print("Clicked on Video  Consultation Button");
	wait(chatpageisdisplayed);
	chatpageisdisplayed.isDisplayed();
	print("Element is Displayed");
	wait(details_hasitbeentherefor2weeksormore);
	details_hasitbeentherefor2weeksormore.click();
    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on check box has it been there for 2weeks or more", ExtentColor.BLUE));
	print("Clicked on check box has it been there for 2weeks or more");
	
	click_submit.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on submit button", ExtentColor.BLUE));
	print("Clicked on submit button");
	
	
	details_ihave.click();
    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on no option ", ExtentColor.BLUE));
	print("Clicked on no option");
	
	
    clickonsubmit.click();
    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on submit button", ExtentColor.BLUE));
	print("Clicked on submit button");
	Thread.sleep(12000);	
	details_ihave.click();
    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on no option ", ExtentColor.BLUE));
	print("Clicked on no option second time");
	
	
	submit_ihave.click();
    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on submit button", ExtentColor.BLUE));
	print("Clicked on submit button second time");
	
	if(selection_DoctorPreference.isDisplayed()) {
	selection_DoctorPreference.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Seleceted Doctor Preference", ExtentColor.BLUE));
	print("Seleceted Doctor Preference");
	
	submitButton_selection_DoctorPreference.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Submit Button on Selection of Doctor Preference", ExtentColor.BLUE));
	print("Clicked on Submit Button on Selection of Doctor Preference");
	}else {
		flag = true;
		test.log(Status.INFO, MarkupHelper.createLabel("Element not Visible", ExtentColor.BLUE));
		print(" Selection of Doctor Preference element is not visible ");
	}
	wait(clicked_Nomyproblemdoesnotrequireanimagereport);
	clicked_Nomyproblemdoesnotrequireanimagereport.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Neither option in no my problem does not require image report", ExtentColor.BLUE));
	print("Clicked on Neither option in no my problem does not require image report");
	
	clickon_submit.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Submited  Neither option in no my problem does not require image report", ExtentColor.BLUE));
	print("Submited Neither option in no my problem does not require image report");
	
	test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed", ExtentColor.BLUE));
	print("Doctor card is displayed");
	wait(Doctorcardisisplayed);
	String doctorName =Doctorcardisisplayed.getText();
	test.log(Status.INFO, MarkupHelper.createLabel("Assigned Doctor Name is :"+doctorName, ExtentColor.BLUE));
	print("Assigned Doctor Name is :"+doctorName);
	Thread.sleep(20000);
	
	
} catch (Exception e) {
	// TODO: handle exception
  e.printStackTrace();
}
} 

//4 Verify affinity flow
//skin problems 
    public void Verifyaffinityflow(String headerValue, String headervalue1, String symptomsdescriptionskin, String entertext) {
try {
	   login("5599776612");
	   Thread.sleep(20000);
	   print("waited for click to talkdoctor option");
//       click_talktodoctor.click();
//       test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//       print("Clicked on Talk to Doctor");
       wait(gettext_toolbartitle);
       gettext_toolbartitle.isDisplayed();
       print("Element is displayed");
       String header = gettext_toolbartitle.getText();
	    if (header.equalsIgnoreCase(headerValue)) {
		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.BLUE));
		print("Expected Header Value is Matched as :" + headerValue);
		} else {
		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.RED));
		print("Expected Hearder Value is not Matched as " + headerValue);
		}
        select_femaleimage.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
		print("Selected Female Gender Image");
		clicked_nextbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
		print("Clicked on Next button");
	    gettext_headbartitle.isDisplayed();
		print("Element is Displayed");
		String header2 = gettext_headbartitle.getText();
		if (header2.equalsIgnoreCase(headervalue1)) {
		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
		print("Expected Title value is Displayed: " + headervalue1);
		} else {
		test.log(Status.INFO,MarkupHelper.createLabel("Expected header value is not displayed:" + headervalue1, ExtentColor.RED));
		print("Expected Title value is not displayed" + headervalue1);
		}
     	wait(clickon_skinproblemsButton);
     	clickon_skinproblemsButton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on skin problems", ExtentColor.BLUE));
		print("Clicked on skin problems");
		
		healthproblemspageisdisplayed.isDisplayed();
		print("skin problems page is displayed");
		test.log(Status.INFO, MarkupHelper.createLabel("skin problems page is displayed", ExtentColor.BLUE));
		
		wait(entertext_description);
		entertext_description.sendKeys(symptomsdescriptionskin);
		test.log(Status.INFO,MarkupHelper.createLabel("health Issues details enter in Text Box query", ExtentColor.BLUE));
		print("health Issues details enter in Text Box query");
		driver.hideKeyboard();
		
//		entertext_description.sendKeys(symptomsdescription);
//		test.log(Status.INFO, MarkupHelper.createLabel("health Issues details enter in Text Box query", ExtentColor.BLUE));
//		print("health Issues details enter in Text Box query");
//		driver.hideKeyboard();
		
		wait(clickonstartconsultation);
		clickonstartconsultation.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on start consultation button", ExtentColor.BLUE));
		print("click on start consultation button");
		
//		clickonvideoconsult.click();
//		test.log(Status.INFO, MarkupHelper.createLabel("click on video consultation button", ExtentColor.BLUE));
//		print("click on video consultation button");
		
		clickonconfirm.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on confirm button", ExtentColor.BLUE));
		print("cclick on confirm button");
		
		wait(Dermatologypagedisplayed);
		Dermatologypagedisplayed.isDisplayed();
		test.log(Status.INFO, MarkupHelper.createLabel("Dermatology paged is displayed", ExtentColor.BLUE));
		print("Dermatology paged is displayed");
		Thread.sleep(6000);
		
		wait(clickonotherissues);
		clickonotherissues.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on other issues button", ExtentColor.BLUE));
		print("click on other issues button");
		
		wait(clickonsubmitbutton);
		clickonsubmitbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button", ExtentColor.BLUE));
		print("click on submit button");
		
		wait(enterherebutton);
		enterherebutton.sendKeys(entertext);
		test.log(Status.INFO, MarkupHelper.createLabel("value entered", ExtentColor.BLUE));
		print("value entered");
		
		clickonsubmitbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("clicked on submit button", ExtentColor.BLUE));
		print("clicked on submit button");
		
		clickonnonButton.click();	
		test.log(Status.INFO, MarkupHelper.createLabel("click on no submit button", ExtentColor.BLUE));
		print("click on no submit button");
		
		clickonsubmitbutton2.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button2", ExtentColor.BLUE));
		print("click on  submit button2");
		
		clickonnooption.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on no option", ExtentColor.BLUE));
		print("click on no option");
		
		clickonsubmitbutton3.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button3", ExtentColor.BLUE));
		print("click on submit Button3");
		
		clickonnobuttonotherproblems.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on no button other problems", ExtentColor.BLUE));
		print("click on no button other problems");
		
		clickonsubmitbutton4.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button4", ExtentColor.BLUE));
		print("click on submit button4");
		wait(Doctorcardisdisplayed);
		
		Doctorcardisdisplayed.isDisplayed();
		test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed", ExtentColor.BLUE));
		print("Doctor card is displayed");
		Thread.sleep(20000);
		
	
		
		} catch (Exception e) {
			// TODO: handle exception
		     e.printStackTrace();
		}
}
	// 5 Verify opting for affinity flow
	// skin problems

    public void Verifyoptingforaffinityflow(String headerValue, String headervalue1, String symptomsdescriptionskin, String entertext) {
try {
	login("5599773377");
    Thread.sleep(20000);
	print("waited for click to talkdoctor option");
//    click_talktodoctor.click();
//    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//    print("Clicked on Talk to Doctor");
	wait(gettext_toolbartitle);
    gettext_toolbartitle.isDisplayed();
    print("Element is displayed");
    String header= gettext_toolbartitle.getText();
    if (header.equalsIgnoreCase(headerValue)) {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.BLUE));
	print("Expected Header Value is Matched as :" + headerValue);
	} else {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.RED));
	print("Expected Hearder Value is not Matched as " + headerValue);
	}
    select_femaleimage.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
	print("Selected Female Gender Image");
	clicked_nextbutton.click();
	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
	print("Clicked on Next button");
	gettext_headbartitle.isDisplayed();
	print("Element is Displayed");
	String header2 =gettext_headbartitle.getText();
	if (header2.equalsIgnoreCase(headervalue1)) {
	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
	print("Expected Title value is Displayed: " + headervalue1);
	} else {
	test.log(Status.INFO,MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1, ExtentColor.RED));
	print("Expected Title value is not displayed" + headervalue1);
	}
	    wait(clickon_skinproblemsButton);
	    clickon_skinproblemsButton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on skin problems", ExtentColor.BLUE));
		print("Clicked on skin problems");
		healthproblemspageisdisplayed.isDisplayed();
		print("skin problems page is displayed");
		test.log(Status.INFO, MarkupHelper.createLabel("skin problems page is displayed", ExtentColor.BLUE));
		wait(entertext_description);
		entertext_description.sendKeys(symptomsdescriptionskin);
		test.log(Status.INFO,MarkupHelper.createLabel("health Issues details enter in Text Box query", ExtentColor.BLUE));
		print("health Issues details enter in Text Box query");
		driver.hideKeyboard();
		wait(clickonstartconsultation);
		clickonstartconsultation.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on start consultation button", ExtentColor.BLUE));
		print("click on start consultation button");
//		clickon_videoconsult.click();
//		test.log(Status.INFO, MarkupHelper.createLabel("click on video consultation button", ExtentColor.BLUE));
//		print("cclick on video consultation button");
		clickonconfirm.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on confirm button", ExtentColor.BLUE));
		print("cclick on confirm button");
		
		wait(Dermatologypagedisplayed);
		Dermatologypagedisplayed.isDisplayed();
		test.log(Status.INFO, MarkupHelper.createLabel("Dermatology paged is displayed", ExtentColor.BLUE));
		print("Dermatology paged is displayed");
		clickonotherissues.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on other issues button", ExtentColor.BLUE));
		print("click on other issues button");
		clickonsubmitbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button", ExtentColor.BLUE));
		print("click on submit button");
		wait(enterherebutton);
		enterherebutton.sendKeys(entertext);
		test.log(Status.INFO, MarkupHelper.createLabel("value entered", ExtentColor.BLUE));
		print("value entered");
		clickonsubmitbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("clicked on submit button", ExtentColor.BLUE));
		print("clicked on submit button");
		clickonnonButton.click();	
		test.log(Status.INFO, MarkupHelper.createLabel("click on no submit button", ExtentColor.BLUE));
		print("click on no submit button");
		clickonsubmitbutton2.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button2", ExtentColor.BLUE));
		print("click on  submit button2");
		clickonnooption.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on no option", ExtentColor.BLUE));
		print("click on no option");
		clickonsubmitbutton3.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button3", ExtentColor.BLUE));
		print("click on submit Button3");
		clickonnobuttonotherproblems.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on no button other problems", ExtentColor.BLUE));
		print("click on no button other problems");
		clickonsubmitbutton4.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button4", ExtentColor.BLUE));
		print("click on submit button4");
		wait(Doctorcardisdisplayed);
		Doctorcardisdisplayed.isDisplayed();
		test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed", ExtentColor.BLUE));
		print("Doctor card is displayed");
//		wait(selectnoimageButton);
//		selectnoimageButton.click();
//		test.log(Status.INFO, MarkupHelper.createLabel("click on no image Button", ExtentColor.BLUE));
//		print("click on no image Button");
//		ClickonSubmit.click();
//		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button", ExtentColor.BLUE));
//		print("click on submit Button");
//		wait(Doctorcallyoupagedisplayed);
//		Doctorcallyoupagedisplayed.isDisplayed();
//		test.log(Status.INFO, MarkupHelper.createLabel("Doctor call you page is displyed", ExtentColor.BLUE));
//		print("Doctor call you page is displyed");
		Thread.sleep(20000);
		driver.closeApp();
		print("App Closed");
		
		

}catch (Exception e) {
	// TODO: handle exception
	e.printStackTrace();
	 }
     }
//    6 Verify not opting for affinity flow
//    skin problems

    public void Verifynotoptingforaffinityflow(String headerValue, String headervalue1, String symptomsdescriptionskin,String entertext) {
    try {
     login("5599773377");
 	 Thread.sleep(20000);
 	 print("waited for click to talkdoctor option");
//     click_talktodoctor.click();
//     test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//     print("Clicked on Talk to Doctor");
 	 wait(gettext_toolbartitle);
     gettext_toolbartitle.isDisplayed();
     print("Element is displayed");
     String header =gettext_toolbartitle.getText();
 	 if (header.equalsIgnoreCase(headerValue)) {
 	 test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.BLUE));
 	 print("Expected Header Value is Matched as :" + headerValue);
 	 } else {
 	 test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.RED));
 	 print("Expected Hearder Value is not Matched as " + headerValue);
 	 }
     select_femaleimage.click();
 	 test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
 	 print("Selected Female Gender Image");
 	 clicked_nextbutton.click();
 	 test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
 	 print("Clicked on Next button");
 	 gettext_headbartitle.isDisplayed();
 	 print("Element is Displayed");
 	 String header2= gettext_headbartitle.getText();
 	 if (header2.equalsIgnoreCase(headervalue1)) {
 	 test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
 	 print("Expected Header value is Displayed: " + headervalue1);
 	 } else {
 	 test.log(Status.INFO,MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1, ExtentColor.RED));
 	 print("Expected header value is not displayed" + headervalue1);
 	 }
 		wait(clickon_skinproblemsButton);
 		clickon_skinproblemsButton.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("Click on skin problems", ExtentColor.BLUE));
 		print("Click on skin problems");
 		healthproblemspageisdisplayed.isDisplayed();
 		test.log(Status.INFO, MarkupHelper.createLabel("Health problems page displayed", ExtentColor.BLUE));
 		print("Health problems page displayed");
 		wait(entertext_description);
 		entertext_description.sendKeys(symptomsdescriptionskin);
 		test.log(Status.INFO, MarkupHelper.createLabel("Enter the symptoms in the box", ExtentColor.BLUE));
 		print("Enter the symptoms in the box");
 		wait(clickonstartconsultation);
 		clickonstartconsultation.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("Click on start consultation button", ExtentColor.BLUE));
 		print("Click on start consultation button");
 		clickonvideoconsult.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on video consultation button", ExtentColor.BLUE));
 		print("click on video consultation button");
 		clickonconfirm.click();
        test.log(Status.INFO, MarkupHelper.createLabel(" click on confirm button", ExtentColor.BLUE));
 		print("click on confirm button");
 		wait(Dermatologypagedisplayed);
 		Dermatologypagedisplayed.isDisplayed();
        test.log(Status.INFO, MarkupHelper.createLabel(" Dermatology page is displayed", ExtentColor.BLUE));
 		print("Dermatology page is displayed");
 		clickonotherissues.click();
 	    test.log(Status.INFO, MarkupHelper.createLabel("click on other issues button", ExtentColor.BLUE));
  		print("click on other issues button");
  		clickonsubmitbutton4.click();
        test.log(Status.INFO, MarkupHelper.createLabel("click on submit button", ExtentColor.BLUE));
  		print("click on submit button");
  		wait(enterherebutton);
		enterherebutton.sendKeys(entertext);
		test.log(Status.INFO, MarkupHelper.createLabel("value entered", ExtentColor.BLUE));
		print("value entered");
		clickonnonButton.click();
        test.log(Status.INFO, MarkupHelper.createLabel("click on no submit Button", ExtentColor.BLUE));
  		print("click on no submit Button");
        clickonsubmitButton2.click();
        test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button", ExtentColor.BLUE));
  		print("click on submit Button");
  		clickonno_option.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("click on no option", ExtentColor.BLUE));
  		print("click on no option");
  		clickonsubmit_Button3.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button", ExtentColor.BLUE));
  		print("click on submit Button");
  		wait(clickon30minavailableDr);
  		clickon30minavailableDr.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("click on 30min available Dr", ExtentColor.BLUE));
  		print("click on 30min available Dr");
  		clickonsubmitbutton_avalableDr.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button avalable Dr", ExtentColor.BLUE));
  		print("click on submit button avalable Dr");
  		selectnoimagebutton.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("select no image button", ExtentColor.BLUE));
  		print("select no image button");
  		Clickonsubmit.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("Click on submit", ExtentColor.BLUE));
  		print("Click on submit");
  		Doctorcardpageisdisplayed.isDisplayed();
  		test.log(Status.INFO, MarkupHelper.createLabel("Doctor card page is displayed", ExtentColor.BLUE));
  		print("Doctor card page is displayed");
  		driver.closeApp();
  		print("App Closed");
  		
	
}catch (Exception e) {
// TODO: handle exception
e.printStackTrace();
 }
 }
    
 // 7 Verify affinity flow doctor list
    //skin problems
       public void Verifyaffinityflowdoctorlist(String headerValue, String headervalue1, String symptomsdescriptionskin,String entertext) {
       try {

         login("5599773377");
     	  Thread.sleep(20000);
//         click_talktodoctor.click();
//         test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//         print("Clicked on Talk to Doctor");
     	  wait(gettext_toolbartitle);
         gettext_toolbartitle.isDisplayed();
         print("Element is displayed");
         String header= gettext_toolbartitle.getText();
     	   if (header.equalsIgnoreCase(headerValue)) {
     		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.BLUE));
     		print("Expected Header Value is Matched as :" + headerValue);
     		} else {
     		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.RED));
     		print("Expected Hearder Value is not Matched as " + headerValue);
     		}
          select_femaleimage.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
     		print("Selected Female Gender Image");
     		
     		clicked_nextbutton.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
     		print("Clicked on Next button");
     		
     		gettext_headbartitle.isDisplayed();
     		print("Element is Displayed");
     		String header2= gettext_headbartitle.getText();
     		if (header2.equalsIgnoreCase(headervalue1)) {
     		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
     		print("Expected Header value is Displayed: " + headervalue1);
     		} else {
     		test.log(Status.INFO,MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1, ExtentColor.RED));
     		print("Expected header value is not displayed" + headervalue1);
     		}
     		
     		wait(clickon_skinproblemsButton);
     		clickon_skinproblemsButton.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("click on skin problems-Currently Dr", ExtentColor.BLUE));
    		print("click on skin problems Currently Dr");
    		
    		wait(healthproblemspageisdisplayed);
    		healthproblemspageisdisplayed.isDisplayed();
    		test.log(Status.INFO, MarkupHelper.createLabel("Health problems page displayed-Currently Dr", ExtentColor.BLUE));
    		print("Health problems page displayed CurrentlyDr");
    		
    		wait(entertext_description);
    		entertext_description.sendKeys(symptomsdescriptionskin);
    		test.log(Status.INFO, MarkupHelper.createLabel("Enter the symptoms in the box-Currently Dr", ExtentColor.BLUE));
    		print("Enter the symptoms in the box-Currently Dr");
    		
    		wait(clickonstartconsultation);
    		clickonstartconsultation.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("Click on start consultation button-Currently Dr", ExtentColor.BLUE));
    		print("Click on start consultation button-Currently Dr");
    		
    		clickonvideoconsult.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on video consultation button-Currently Dr", ExtentColor.BLUE));
    		print("click on video consultation button_ -Currently Dr");
    		
    		clickonconfirm.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on confirm button-Currently Dr", ExtentColor.BLUE));
    		print("click on confirm button-Currently Dr");
    		
    		Dermatologypagedisplayed.isDisplayed();
    		test.log(Status.INFO, MarkupHelper.createLabel("Dermatology page is displayed-Currently Dr", ExtentColor.BLUE));
    		print("Dermatology page is displayed-Currently Dr");
    		
    		clickonotherissues.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on other issues button-Currently Dr", ExtentColor.BLUE));
    		print("click on other issues button-Currently Dr");
    		
    		clickonsubmitbutton.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button-Currently Dr", ExtentColor.BLUE));
    		print("click on submit button-Currently Dr");
    		
    		wait(enterherebutton);
       	enterherebutton.sendKeys(entertext);
       	test.log(Status.INFO, MarkupHelper.createLabel("click on enter here text box_currently available Dr", ExtentColor.BLUE));
       	print("click on enter here text box_currently available Dr");
       	
       	clickonnonButton.click();
         	test.log(Status.INFO, MarkupHelper.createLabel("click on submit button days_currently available Dr", ExtentColor.BLUE));
       	print("click on submit button days_currently available Dr");
    		
       	clickonsubmitbutton2.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on no submit Button-Currently Dr", ExtentColor.BLUE));
    		print("click on submit button-Currently Dr");
    		
    		clickonnooption.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button-Currently Dr", ExtentColor.BLUE));
    		print("click on submit Button-Currently Dr");
    		
    		clickonsubmitbutton3.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on no option-Currently Dr", ExtentColor.BLUE));
    		print("click on no option-Currently Dr");
    		
    		clickonnobuttonotherproblems.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button-Currently Dr", ExtentColor.BLUE));
    		print("click on submit Button-Currently Dr");
    		
    		clickonsubmitbutton4.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button avalable Dr Currently Dr", ExtentColor.BLUE));
    		print("click on submit button avalable Dr Currently Dr");
    		
    		wait(selectnoimagebutton_CurrentlyDr);
    		selectnoimagebutton_CurrentlyDr.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("select no image button Currently Dr", ExtentColor.BLUE));
    		print("select no image button Currently Dr");
    		
    		Clickonsubmit_CurrentlyDr.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("Click on submit Currently Dr", ExtentColor.BLUE));
    		print("Click on submit Currently Dr");
    		
    		wait(DoctorCardisdisplayed);
    		DoctorCardisdisplayed.isDisplayed();
    		test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed", ExtentColor.BLUE));
    		print("Doctor card is displayed");
    		String doctorName =Doctorcardisisplayed.getText();
    		test.log(Status.INFO, MarkupHelper.createLabel("Assigned Doctor Name is :"+doctorName, ExtentColor.BLUE));
    		print("Assigned Doctor Name is :"+doctorName);
//    		driver.closeApp();
//    		print("App Closed");
     
       
       }catch (Exception e) {
       // TODO: handle exception
       e.printStackTrace();
        }

   }

    
    
	
//	//8 Verify affinity flow doctor assignment
//	//skin problems
	
	public void Verifyaffinityflowdoctorassignment(String headerValue, String headervalue1, String symptomsdescriptionskin,String entertext) {
		try {
	
			login("5599773377");
			Thread.sleep(20000);
			print("waited for click to talkdoctor option");
//			click_talktodoctor.click();
//			test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//			print("Clicked on Talk to Doctor");
			wait(gettext_toolbartitle);
			gettext_toolbartitle.isDisplayed();
			print("Element is displayed");
			String header = gettext_toolbartitle.getText();
			if (header.equalsIgnoreCase(headerValue)) {
				test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue,
						ExtentColor.BLUE));
				print("Expected Title Value is Matched as :" + headerValue);
			} else {
				test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue,
						ExtentColor.RED));
				print("Expected Title Value is not Matched as " + headerValue);
			}

			select_femaleimage.click();
			test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
			print("Selected Female Gender Image");
			clicked_nextbutton.click();
			test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
			print("Clicked on Next button");
			gettext_headbartitle.isDisplayed();
			print("Element is Displayed");
			String header2 = gettext_headbartitle.getText();
			if (header2.equalsIgnoreCase(headervalue1)) {
			test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
			print("Expected Title value is Displayed: " + headervalue1);
			} else {
			test.log(Status.INFO, MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1,ExtentColor.RED));
			print("Expected Title value is not displayed" + headervalue1);
			}
	wait(clickon_skinproblemsButton);
	clickon_skinproblemsButton.click();
	test.log(Status.INFO, MarkupHelper.createLabel("clicked on skin problems_Dr Assignment", ExtentColor.BLUE));
    print("clicked on skin problems_Dr Assignment");
   
    wait(entertext_description);
    entertext_description.sendKeys(symptomsdescriptionskin);
    test.log(Status.INFO, MarkupHelper.createLabel("entered symptoms in description text box_Dr Assignment", ExtentColor.BLUE));
    print("enter text_Dr Assignment");
//    Thread.sleep(10000);
    
    wait(clickonstartconsultation);
    clickonstartconsultation.click();
    test.log(Status.INFO, MarkupHelper.createLabel("clicked on start consultation_Dr Assignment", ExtentColor.BLUE));
    print("clicked on start consultation_Dr Assignment");
    
    select_vedioconsult.click();
    test.log(Status.INFO, MarkupHelper.createLabel("clicked on video consult button_Dr Assignment", ExtentColor.BLUE));
    print("clicked on video consult button_Dr Assignment");	
    
    wait(clickonconfirm);
    clickonconfirm.click();	
    test.log(Status.INFO, MarkupHelper.createLabel("clicked on confirm button_Dr Assignment", ExtentColor.BLUE));
    print("clicked on confirm button_Dr Assignment");	
    
    wait(Dermatologypagedisplayed);
    Dermatologypagedisplayed.isDisplayed();	
    test.log(Status.INFO, MarkupHelper.createLabel("Dermatology issues page is displayed_Dr Assignment", ExtentColor.BLUE));
    print("Dermatology issues page is displayed_Dr Assignment");	
    
    wait(clickonotherissues);
    clickonotherissues.click();
    test.log(Status.INFO, MarkupHelper.createLabel("clicked on other issues_Dr Assignment", ExtentColor.BLUE));
    print("clicked on other issues_Dr Assignment");
    
    clickonsubmitbutton.click();	
    test.log(Status.INFO, MarkupHelper.createLabel("clicked on submit button_Dr Assignment", ExtentColor.BLUE));
    print("clicked on submit button_Dr Assignment");
     
    wait(enterherebutton);                                                 
    enterherebutton.sendKeys(entertext);	
    test.log(Status.INFO, MarkupHelper.createLabel("symptoms  entered in  text box_Dr Assignment", ExtentColor.BLUE));
    print("click on enter here text box_Dr Assignment");	
    
    clickonnonButton.click();	
    test.log(Status.INFO, MarkupHelper.createLabel("click on submit button days_Dr Assignment", ExtentColor.BLUE));
    print("click on submit button days_Dr Assignment");	
    
    clickonsubmitbutton2.click();	
    test.log(Status.INFO, MarkupHelper.createLabel("click on no treatment_Dr Assignment", ExtentColor.BLUE));
    print("click on no treatment_Dr Assignment");	
    
    clickonnooption.click();	
    test.log(Status.INFO, MarkupHelper.createLabel("click on submit button treatment_Dr Assignment", ExtentColor.BLUE));
    print("click on submit button treatment_Dr Assignment");	
    
    clickonnobutton_DrAssignment.click();	
    test.log(Status.INFO, MarkupHelper.createLabel("click on no button_Dr Assignment", ExtentColor.BLUE));
    print("click on no button_Dr Assignment");	
   
    clickonsubmitbutton4.click();	
    test.log(Status.INFO, MarkupHelper.createLabel("click on Submit button_Dr Assignment", ExtentColor.BLUE));
    print("click on Submit button_Dr Assignment");	
    
    wait(Drcardisdisplayed_DrAssignment);
    Drcardisdisplayed_DrAssignment.isDisplayed();	
    test.log(Status.INFO, MarkupHelper.createLabel("Dr card is displayed_Dr Assignment", ExtentColor.BLUE));
    print("Dr card is displayed_Dr Assignment");
    Thread.sleep(20000);
//    driver.closeApp();
//	print("App Closed");
		
				
		}catch (Exception e) {
		// TODO: handle exception
		e.printStackTrace();
		 }
		 }
	
	//9 Verify image upload flow for affinity doctor
	//GeneralPhysician
		public void Verifyimageuploadflowforaffinitydoctor(String headerValue, String headervalue1,
				String symptomsdescription) {

	try {
	   login("5599773377");
	   Thread.sleep(20000);
	   print("waited for click to talkdoctor option");
	//   test.log(Status.INFO, MarkupHelper.createLabel("Logged in Successful", ExtentColor.BLUE));
	//   print("Logged in successful");
	//   click_talktodoctor.click();
	//   test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
	//   print("Clicked on Talk to Doctor");
	   wait(gettext_toolbartitle);
	   gettext_toolbartitle.isDisplayed();
	   print("Element is displayed");
	   String header=gettext_toolbartitle.getText();	  
	    if (header.equalsIgnoreCase(headerValue)) {
		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.BLUE));
		print("Expected Header Value is Matched as :" + headerValue);
		} else {
		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.RED));
		print("Expected Hearder Value is not Matched as " + headerValue);
		}
	    select_femaleimage.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
		print("Selected Female Gender Image");
		
		clicked_nextbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
		print("Clicked on Next button");
		gettext_headbartitle.isDisplayed();
		print("Element is Displayed");
		String header2=gettext_headbartitle.getText();
		if (header2.equalsIgnoreCase(headervalue1)) {
		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
		print("Expected Header value is Displayed: " + headervalue1);
		} else {
		test.log(Status.INFO,MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1, ExtentColor.RED));
		print("Expected header value is not displayed" + headervalue1);
		}
		wait(clicked_GeneralPhysicianButton);
		clicked_GeneralPhysicianButton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on General Physician", ExtentColor.BLUE));
		print("Clicked on General Physician");
		entertext_description.sendKeys(symptomsdescription);
		test.log(Status.INFO, MarkupHelper.createLabel("health Issues details enter in Text Box query", ExtentColor.BLUE));
		print("health Issues details enter in Text Box query");
		driver.hideKeyboard();
		
	    clicked_startconsultationbutton.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Start Consultation Button", ExtentColor.BLUE));
		print("Clicked on Start Consultation Button");
		select_vedioconsult.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Selected Video  Consult Button", ExtentColor.BLUE));
		print("Selected Video  Consult Button");
		wait(confirm_consultationtype);
	    confirm_consultationtype.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Video  Consult Confirmation Button", ExtentColor.BLUE));
		print("Clicked on Video  Consultation Button");
		wait(chatpageisdisplayed);
		chatpageisdisplayed.isDisplayed();
		print("Element is Displayed");
		wait(details_hasitbeentherefor2weeksormore);
		details_hasitbeentherefor2weeksormore.click();
	    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on check box has it been there for 2weeks or more", ExtentColor.BLUE));
		print("Clicked on check box has it been there for 2weeks or more");
		
		click_submit.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on submit button", ExtentColor.BLUE));
		print("Clicked on submit button");
		
		
		details_ihave.click();
	    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on no option ", ExtentColor.BLUE));
		print("Clicked on no option");
		
		
	    clickonsubmit.click();
	    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on submit button", ExtentColor.BLUE));
		print("Clicked on submit button");
		Thread.sleep(12000);	
		details_ihave.click();
	    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on no option ", ExtentColor.BLUE));
		print("Clicked on no option second time");
		
		
		submit_ihave.click();
	    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on submit button", ExtentColor.BLUE));
		print("Clicked on submit button second time");
		
		if(selection_DoctorPreference.isDisplayed()) {
		selection_DoctorPreference.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Seleceted Doctor Preference", ExtentColor.BLUE));
		print("Seleceted Doctor Preference");
		
		submitButton_selection_DoctorPreference.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Submit Button on Selection of Doctor Preference", ExtentColor.BLUE));
		print("Clicked on Submit Button on Selection of Doctor Preference");
		}else {
			flag = true;
			test.log(Status.INFO, MarkupHelper.createLabel("Element not Visible", ExtentColor.BLUE));
			print(" Selection of Doctor Preference element is not visible ");
		}
		wait(clicked_Nomyproblemdoesnotrequireanimagereport);
		clicked_Nomyproblemdoesnotrequireanimagereport.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Neither option in no my problem does not require image report", ExtentColor.BLUE));
		print("Clicked on Neither option in no my problem does not require image report");
		
		clickon_submit.click();
		test.log(Status.INFO, MarkupHelper.createLabel("Submited  Neither option in no my problem does not require image report", ExtentColor.BLUE));
		print("Submited Neither option in no my problem does not require image report");
		
		test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed", ExtentColor.BLUE));
		print("Doctor card is displayed");
		wait(Doctorcardisisplayed);
		String doctorName =Doctorcardisisplayed.getText();
		test.log(Status.INFO, MarkupHelper.createLabel("Assigned Doctor Name is :"+doctorName, ExtentColor.BLUE));
		print("Assigned Doctor Name is :"+doctorName);
		Thread.sleep(20000);
		
		
	} catch (Exception e) {
		// TODO: handle exception
	  e.printStackTrace();
	}
	} 	
	
	
	
	
	//10 Verify image upload flow for currently available doctor
	//skin problems
	
	public void Verifyimageuploadflowforcurrentlyavailabledoctor(String headerValue, String headervalue1, String symptomsdescriptionskin,String entertext) {
		try {
			login("5599773377");
			Thread.sleep(20000);
			print("waited for click to talkdoctor option");
//			wait(click_talktodoctor);
//			click_talktodoctor.click();
//			test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//			print("Clicked on Talk to Doctor");
			wait(gettext_toolbartitle);
			gettext_toolbartitle.isDisplayed();
			print("Element is displayed");
			String header = gettext_toolbartitle.getText();
			if (header.equalsIgnoreCase(headerValue)) {
				test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue,
						ExtentColor.BLUE));
				print("Expected Title Value is Matched as :" + headerValue);
			} else {
				test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue,
						ExtentColor.RED));
				print("Expected Title Value is not Matched as " + headerValue);
			}

			select_femaleimage.click();
			test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
			print("Selected Female Gender Image");
			clicked_nextbutton.click();
			test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
			print("Clicked on Next button");
			gettext_headbartitle.isDisplayed();
			print("Element is Displayed");
			String header2 = gettext_headbartitle.getText();
			if (header2.equalsIgnoreCase(headervalue1)) {
				test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
				print("Expected Title value is Displayed: " + headervalue1);
			} else {
				test.log(Status.INFO, MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1,
						ExtentColor.RED));
				print("Expected Title value is not displayed" + headervalue1);
			}
	        
			wait(clickon_skinproblemsButton);
			clickon_skinproblemsButton.click();
			test.log(Status.INFO, MarkupHelper.createLabel("click on skin problems_currently available Dr", ExtentColor.BLUE));
        	print("click on skin problems_currently available Dr");
        	
        	wait(entertext_description);
        	entertext_description.sendKeys(symptomsdescriptionskin);
        	test.log(Status.INFO,MarkupHelper.createLabel("Health Issues details enter in Text Box query_currently available Dr", ExtentColor.BLUE));
			print("Health Issues details enter in Text Box query_currently available Dr");
			
			clickonstartconsultation.click();
			test.log(Status.INFO, MarkupHelper.createLabel("click on start consultation_currently available Dr", ExtentColor.BLUE));
        	print("click on start consultation_currently available Dr");
        	
        	clickonvideoconsult.click();
        	test.log(Status.INFO, MarkupHelper.createLabel("click on video consultbutton_currently available Dr", ExtentColor.BLUE));
        	print("click on video consultbutton_currently available Dr");
        	
        	clickonconfirm.click();
        	test.log(Status.INFO, MarkupHelper.createLabel("click on confirm button_currently available Dr", ExtentColor.BLUE));
        	print("click on confirm button_currently available Dr");
        	
        	wait(Dermatologypagedisplayed);
        	Dermatologypagedisplayed.isDisplayed();
           	test.log(Status.INFO, MarkupHelper.createLabel("Dermatology issues page is displayed_currently available Dr", ExtentColor.BLUE));
        	print("Dermatology issues page is displayed_currently available Dr");
        	
        	wait(clickonotherissues);
        	clickonotherissues.click();
         	test.log(Status.INFO, MarkupHelper.createLabel("click on other issues_currently available Dr", ExtentColor.BLUE));
        	print("click on other issues_currently available Dr");
        	
        	clickonsubmitbutton.click();
        	test.log(Status.INFO, MarkupHelper.createLabel("click on submit button_currently available Dr", ExtentColor.BLUE));
        	print("click on submit button_currently available Dr");
        	
        	wait(enterherebutton);
        	enterherebutton.sendKeys(entertext);
        	test.log(Status.INFO, MarkupHelper.createLabel("click on enter here text box_currently available Dr", ExtentColor.BLUE));
        	print("click on enter here text box_currently available Dr");
        	
        	clickonnonButton.click();
          	test.log(Status.INFO, MarkupHelper.createLabel("click on submit button days_currently available Dr", ExtentColor.BLUE));
        	print("click on submit button days_currently available Dr");
        	
        	clickonnobuttonotherproblems.click();
         	test.log(Status.INFO, MarkupHelper.createLabel("click on no treatment_currently available Dr", ExtentColor.BLUE));
        	print("click on no treatment_currently available Dr");
        	
        	clickonsubmitbutton4.click();
        	test.log(Status.INFO, MarkupHelper.createLabel("click on submit button treatment_currently available Dr", ExtentColor.BLUE));
        	print("click on submit button treatment_currently available Dr");
        	
        	wait(imageuploadboxisdisplayed_currentlyavailableDr);
        	imageuploadboxisdisplayed_currentlyavailableDr.isDisplayed();
          	test.log(Status.INFO, MarkupHelper.createLabel("image upload box is displayed_currently available Dr", ExtentColor.BLUE));
        	print("image upload box is displayed_currently available Dr");
        	
        	Thread.sleep(20000);
        	wait(Doctorcardisdisplayed_currentlyavailableDr);
        	Doctorcardisdisplayed_currentlyavailableDr.isDisplayed();
         	test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed_currently available Dr", ExtentColor.BLUE));
        	print("Doctor card is displayed_currently available Dr");
        	driver.closeApp();
        	print("App Closed");
			
			
		}catch (Exception e) {
		//TODO: handle exception
		//e.printStackTrace();
		 }
		 }

	
////11 Verify selecting Yes for image upload flow
// //skin problems
   
    public void VerifyselectingYesforimageuploadflow(String headerValue, String headervalue1, String symptomsdescriptionskin,String entertext) {
    try {
    
    login("5599773377");
  	Thread.sleep(20000);
	print("waited for click to talkdoctor option");
//    click_talktodoctor.click();
//    test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//    print("Clicked on Talk to Doctor");
  	wait(gettext_toolbartitle);
    gettext_toolbartitle.isDisplayed();
    print("Element is displayed");
   String header =gettext_toolbartitle.getText();
    if (header.equalsIgnoreCase(headerValue)) {
  	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.BLUE));
    print("Expected Header Value is Matched as :" + headerValue);
    } else {
  	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.RED));
  	print("Expected Hearder Value is not Matched as " + headerValue);
  	}
   select_femaleimage.click();
   test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
  		print("Selected Female Gender Image");
  		
  		clicked_nextbutton.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
  		print("Clicked on Next button");
  		
  		wait(gettext_headbartitle);
  		gettext_headbartitle.isDisplayed();
  		print("Element is Displayed");
  		String header2= gettext_headbartitle.getText();
  		if (header2.equalsIgnoreCase(headervalue1)) {
  		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
  		print("Expected Header value is Displayed: " + headervalue1);
  		} else {
  		test.log(Status.INFO,MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1, ExtentColor.RED));
  		print("Expected header value is not displayed" + headervalue1);
  		}
  		
  		wait(clickon_skinproblemsButton);
  		clickon_skinproblemsButton.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("click on skin problems_image upload flow", ExtentColor.BLUE));
 		print("click on skin problems_image upload flow");
 		
 		wait(healthproblemspageisdisplayed);
 		healthproblemspageisdisplayed.isDisplayed();
 		test.log(Status.INFO, MarkupHelper.createLabel("Health problems page displayed_image upload flow", ExtentColor.BLUE));
 		print("Health problems page displayed_image upload flow");
 		
 		wait(entertext_description);
 		entertext_description.sendKeys(symptomsdescriptionskin);
 		test.log(Status.INFO, MarkupHelper.createLabel("Enter the symptoms in the box_image upload flow", ExtentColor.BLUE));
 		print("Enter the symptoms in the box_imageuploadflow");
 		
 		wait(clickonstartconsultation);
 		clickonstartconsultation.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("Click on start consultation button_image upload flow", ExtentColor.BLUE));
 		print("Click on start consultation button_image upload flow");
 		 
 		if(clickonvideoconsult.isDisplayed()) {
 		
 		clickonvideoconsult.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on video consultation button_image upload flow", ExtentColor.BLUE));
 		print("click on video consultation button_image upload flow");
 		
 		wait(clickonconfirm);
 		clickonconfirm.click();
		test.log(Status.INFO, MarkupHelper.createLabel("click on confirm button_image upload flow", ExtentColor.BLUE));
 		print("click on confirm button_image upload flow");
 		
 		wait(Dermatologypagedisplayed);
 		Dermatologypagedisplayed.isDisplayed();
		test.log(Status.INFO, MarkupHelper.createLabel("Dermatology page is displayed_image upload flow", ExtentColor.BLUE));
 		print("Dermatology page is displayed_image upload flow");
 		
 		wait(clickonotherissues);
 		clickonotherissues.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on other issues button_image upload flow", ExtentColor.BLUE));
 		print("click on other issues button_image upload flow");
 		
 		clickonsubmitbutton.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button_image upload flow", ExtentColor.BLUE));
 		print("click on submit button_image upload flow");
 		
 		
 		
 		wait(enterherebutton);
    	enterherebutton.sendKeys(entertext);
    	test.log(Status.INFO, MarkupHelper.createLabel("click on enter here text box_currently available Dr", ExtentColor.BLUE));
    	print("click on enter here text box_currently available Dr");
    	
    	clickonsubmitbutton.click();
      	test.log(Status.INFO, MarkupHelper.createLabel("click on submit button days_currently available Dr", ExtentColor.BLUE));
    	print("click on submit button days_currently available Dr");
 		
    	clickonnooption.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on no submit Button_image upload flow", ExtentColor.BLUE));
 		print("click on no submit Button_image upload flow");
 		
 		clickonsubmitbutton3.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button_image upload flow", ExtentColor.BLUE));
 		print("click on submit Button_image upload flow");
 		
 		clickonnobuttonotherproblems.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on no option_image upload flow", ExtentColor.BLUE));
 		print("click on no option_image upload flow");
 		
 		clickonsubmitbutton4.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button_image upload flow", ExtentColor.BLUE));
 		print("click on submit Button_image upload flow");
 		
 		wait(clickonyesimageuploadbutton_imageuploadflow);
 		clickonyesimageuploadbutton_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on yes image upload button_image upload flow", ExtentColor.BLUE));
 		print("click on yes image upload button_image upload flow");
 		
 		wait(clickonsubmitbutton_imageuploadflow);
 		clickonsubmitbutton_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button_image upload flow", ExtentColor.BLUE));
 		print("click on submit button_image upload flow");
 		
 		
 		wait(clickonuploadimageofaffectedarea_imageuploadflow);
 		clickonuploadimageofaffectedarea_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on upload image of affected area_image upload flow", ExtentColor.BLUE));
 		print("click on upload image of affected area_image upload flow");
 		
 		wait(clickonCamera_imageuploadflow);
 		clickonCamera_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on Camera_image upload flow", ExtentColor.BLUE));
 		print("click on Camera_image upload flow");
 		
 		clickonwhileusingtheapp.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on while using app_image upload flow", ExtentColor.BLUE));
 		print("click on while using app_image upload flow");
 		
 		clickonallowbutton.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on allow button_image upload flow", ExtentColor.BLUE));
 		print("click on allow button_image upload flow");
 		
 //		wait(clickonuploadimageofaffectedarea_imageuploadflow);
 		clickonuploadimageofaffectedarea_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on upload image of affected area_image upload flow", ExtentColor.BLUE));
 		print("click on upload image of affected area_image upload flow");
 		
 		
 		
// 		wait(clickonCamera_imageuploadflow);
 		clickonCamera_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on Camera_image upload flow", ExtentColor.BLUE));
 		print("click on Camera_image upload flow");
 		
 		
// 		wait(cameraisopen_imageuploadflow);
// 		cameraisopen_imageuploadflow.click();
// 		test.log(Status.INFO, MarkupHelper.createLabel("camera is open_image upload flow", ExtentColor.BLUE));
// 		print("camera is open_image upload flow");
 		
 		
 		wait(clickoncamerasymbol_imageuploadflow);
 		clickoncamerasymbol_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on camera symbol_image upload flow", ExtentColor.BLUE));
 		print("click on camera symbol_image upload flow");
 		
 		wait(clickonokbutton_imageuploadflow);
 		clickonokbutton_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on Done button_image upload flow", ExtentColor.BLUE));
 		print("click on Done button_image upload flow");
 		
 		wait(clickonuploadrecordbutton_imageuploadflow);
 		clickonuploadrecordbutton_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on upload record button_image upload flow", ExtentColor.BLUE));
 		print("click on upload record button_image upload flow");
 		
 		wait(clickonyesbutton_correctphoto_imageuploadflow);
 		clickonyesbutton_correctphoto_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on yes button_correct photo_image upload flow", ExtentColor.BLUE));
 		print("click on yes button_correct photo_image upload flow");
 		
 		wait(imageisdisplayed_imageuploadflow);
 		imageisdisplayed_imageuploadflow.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("image is displayed_image upload flow", ExtentColor.BLUE));
 		print("image is displayed_image upload flow");
 		
 		wait(Doctorcardisdisplayed_imageuploadflow);
 		Doctorcardisdisplayed_imageuploadflow.isDisplayed();
 		test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed_image upload flow", ExtentColor.BLUE));
 		print("Doctor card is displayed_image upload flow");
 		String doctorName =Doctorcardisdisplayed_imageuploadflow.getText();
		test.log(Status.INFO, MarkupHelper.createLabel("Assigned Doctor Name is :"+doctorName, ExtentColor.BLUE));
		print("Assigned Doctor Name is :"+doctorName);
		Thread.sleep(20000);
// 		driver.closeApp();
// 		print("App Closed");
 		 }else if(!clickonvideoconsult.isDisplayed()) {
 			wait(Dermatologypagedisplayed);
 	 		Dermatologypagedisplayed.isDisplayed();
 			test.log(Status.INFO, MarkupHelper.createLabel("Dermatology page is displayed_image upload flow", ExtentColor.BLUE));
 	 		print("Dermatology page is displayed_image upload flow");
 	 		
 	 		wait(clickonotherissues);
 	 		clickonotherissues.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on other issues button_image upload flow", ExtentColor.BLUE));
 	 		print("click on other issues button_image upload flow");
 	 		
 	 		clickonsubmitbutton.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button_image upload flow", ExtentColor.BLUE));
 	 		print("click on submit button_image upload flow");
 	 		
 	 		wait(enterherebutton);
 	    	enterherebutton.sendKeys(entertext);
 	    	test.log(Status.INFO, MarkupHelper.createLabel("click on enter here text box_currently available Dr", ExtentColor.BLUE));
 	    	print("click on enter here text box_currently available Dr");
 	    	
 	    	clickonsubmitbutton.click();
 	      	test.log(Status.INFO, MarkupHelper.createLabel("click on submit button days_currently available Dr", ExtentColor.BLUE));
 	    	print("click on submit button days_currently available Dr");
 	 		
 	    	clickonnooption.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on no submit Button_image upload flow", ExtentColor.BLUE));
 	 		print("click on no submit Button_image upload flow");
 	 		
 	 		clickonsubmitbutton3.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button_image upload flow", ExtentColor.BLUE));
 	 		print("click on submit Button_image upload flow");
 	 		
 	 		clickonnobuttonotherproblems.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on no option_image upload flow", ExtentColor.BLUE));
 	 		print("click on no option_image upload flow");
 	 		
 	 		clickonsubmitbutton4.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button_image upload flow", ExtentColor.BLUE));
 	 		print("click on submit Button_image upload flow");
 	 		
 	 		wait(clickonyesimageuploadbutton_imageuploadflow);
 	 		clickonyesimageuploadbutton_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on yes image upload button_image upload flow", ExtentColor.BLUE));
 	 		print("click on yes image upload button_image upload flow");
 	 		
 	 		wait(clickonsubmitbutton_imageuploadflow);
 	 		clickonsubmitbutton_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button_image upload flow", ExtentColor.BLUE));
 	 		print("click on submit button_image upload flow");
 	 		
 	 		
 	 		wait(clickonuploadimageofaffectedarea_imageuploadflow);
 	 		clickonuploadimageofaffectedarea_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on upload image of affected area_image upload flow", ExtentColor.BLUE));
 	 		print("click on upload image of affected area_image upload flow");
 	 		
 	 		wait(clickonCamera_imageuploadflow);
 	 		clickonCamera_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on Camera_image upload flow", ExtentColor.BLUE));
 	 		print("click on Camera_image upload flow");
 	 		
 	 		clickonwhileusingtheapp.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on while using app_image upload flow", ExtentColor.BLUE));
 	 		print("click on while using app_image upload flow");
 	 		
 	 		clickonallowbutton.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on allow button_image upload flow", ExtentColor.BLUE));
 	 		print("click on allow button_image upload flow");
 	 		
 	 //		wait(clickonuploadimageofaffectedarea_imageuploadflow);
 	 		clickonuploadimageofaffectedarea_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on upload image of affected area_image upload flow", ExtentColor.BLUE));
 	 		print("click on upload image of affected area_image upload flow");
 	 		
 	 		
 	 		
// 	 		wait(clickonCamera_imageuploadflow);
 	 		clickonCamera_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on Camera_image upload flow", ExtentColor.BLUE));
 	 		print("click on Camera_image upload flow");
 	 		
 	 		
// 	 		wait(cameraisopen_imageuploadflow);
// 	 		cameraisopen_imageuploadflow.click();
// 	 		test.log(Status.INFO, MarkupHelper.createLabel("camera is open_image upload flow", ExtentColor.BLUE));
// 	 		print("camera is open_image upload flow");
 	 		
            int size = driver.findElements(By.tagName("iframe")).size();
            System.out.println(size);
 	 		wait(clickoncamerasymbol_imageuploadflow);
 	 		clickoncamerasymbol_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on camera symbol_image upload flow", ExtentColor.BLUE));
 	 		print("click on camera symbol_image upload flow");
 	 		
 	 		wait(clickonokbutton_imageuploadflow);
 	 		clickonokbutton_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on Done button_image upload flow", ExtentColor.BLUE));
 	 		print("click on Done button_image upload flow");
 	 		
 	 		wait(clickonuploadrecordbutton_imageuploadflow);
 	 		clickonuploadrecordbutton_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on upload record button_image upload flow", ExtentColor.BLUE));
 	 		print("click on upload record button_image upload flow");
 	 		
 	 		wait(clickonyesbutton_correctphoto_imageuploadflow);
 	 		clickonyesbutton_correctphoto_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("click on yes button_correct photo_image upload flow", ExtentColor.BLUE));
 	 		print("click on yes button_correct photo_image upload flow");
 	 		
 	 		wait(imageisdisplayed_imageuploadflow);
 	 		imageisdisplayed_imageuploadflow.click();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("image is displayed_image upload flow", ExtentColor.BLUE));
 	 		print("image is displayed_image upload flow");
 	 		
 	 		wait(Doctorcardisdisplayed_imageuploadflow);
 	 		Doctorcardisdisplayed_imageuploadflow.isDisplayed();
 	 		test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed_image upload flow", ExtentColor.BLUE));
 	 		print("Doctor card is displayed_image upload flow");
 	 		
 	 		String doctorName =Doctorcardisdisplayed_imageuploadflow.getText();
 			test.log(Status.INFO, MarkupHelper.createLabel("Assigned Doctor Name is :"+doctorName, ExtentColor.BLUE));
 			print("Assigned Doctor Name is :"+doctorName);
 			Thread.sleep(10000); 
 		 } 
  		
    }catch (Exception e) {
//TODO: handle exception
e.printStackTrace();
}
}
    
// 12 Verify selecting No for image upload flow
 //skin problems
    public void VerifyselectingNoforimageuploadflow(String headerValue, String headervalue1, String symptomsdescriptionskin,String entertext) {
    try {

      login("5599776699");
  	  Thread.sleep(2000);
//      click_talktodoctor.click();
//      test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//      print("Clicked on Talk to Doctor");
  	  wait(gettext_toolbartitle);
      gettext_toolbartitle.isDisplayed();
      print("Element is displayed");
      String header= gettext_toolbartitle.getText();
  	   if (header.equalsIgnoreCase(headerValue)) {
  		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.BLUE));
  		print("Expected Header Value is Matched as :" + headerValue);
  		} else {
  		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.RED));
  		print("Expected Hearder Value is not Matched as " + headerValue);
  		}
       select_femaleimage.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
  		print("Selected Female Gender Image");
  		
  		clicked_nextbutton.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
  		print("Clicked on Next button");
  		
  		gettext_headbartitle.isDisplayed();
  		print("Element is Displayed");
  		String header2= gettext_headbartitle.getText();
  		if (header2.equalsIgnoreCase(headervalue1)) {
  		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
  		print("Expected Header value is Displayed: " + headervalue1);
  		} else {
  		test.log(Status.INFO,MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1, ExtentColor.RED));
  		print("Expected header value is not displayed" + headervalue1);
  		}
  		
  		wait(clickon_skinproblemsButton);
  		clickon_skinproblemsButton.click();
  		test.log(Status.INFO, MarkupHelper.createLabel("click on skin problems-Currently Dr", ExtentColor.BLUE));
 		print("click on skin problems Currently Dr");
 		
 		wait(healthproblemspageisdisplayed);
 		healthproblemspageisdisplayed.isDisplayed();
 		test.log(Status.INFO, MarkupHelper.createLabel("Health problems page displayed-Currently Dr", ExtentColor.BLUE));
 		print("Health problems page displayed CurrentlyDr");
 		
 		wait(entertext_description);
 		entertext_description.sendKeys(symptomsdescriptionskin);
 		test.log(Status.INFO, MarkupHelper.createLabel("Enter the symptoms in the box-Currently Dr", ExtentColor.BLUE));
 		print("Enter the symptoms in the box-Currently Dr");
 		
 		wait(clickonstartconsultation);
 		clickonstartconsultation.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("Click on start consultation button-Currently Dr", ExtentColor.BLUE));
 		print("Click on start consultation button-Currently Dr");
 		
 		clickonvideoconsult.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on video consultation button-Currently Dr", ExtentColor.BLUE));
 		print("click on video consultation button_ -Currently Dr");
 		
 		clickonconfirm.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on confirm button-Currently Dr", ExtentColor.BLUE));
 		print("click on confirm button-Currently Dr");
 		
 		Dermatologypagedisplayed.isDisplayed();
 		test.log(Status.INFO, MarkupHelper.createLabel("Dermatology page is displayed-Currently Dr", ExtentColor.BLUE));
 		print("Dermatology page is displayed-Currently Dr");
 		
 		clickonotherissues.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on other issues button-Currently Dr", ExtentColor.BLUE));
 		print("click on other issues button-Currently Dr");
 		
 		clickonsubmitbutton.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button-Currently Dr", ExtentColor.BLUE));
 		print("click on submit button-Currently Dr");
 		
 		wait(enterherebutton);
    	enterherebutton.sendKeys(entertext);
    	test.log(Status.INFO, MarkupHelper.createLabel("click on enter here text box_currently available Dr", ExtentColor.BLUE));
    	print("click on enter here text box_currently available Dr");
    	
    	clickonnonButton.click();
      	test.log(Status.INFO, MarkupHelper.createLabel("click on submit button days_currently available Dr", ExtentColor.BLUE));
    	print("click on submit button days_currently available Dr");
 		
    	clickonsubmitbutton2.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on no submit Button-Currently Dr", ExtentColor.BLUE));
 		print("click on submit button-Currently Dr");
 		
 		clickonnooption.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button-Currently Dr", ExtentColor.BLUE));
 		print("click on submit Button-Currently Dr");
 		
 		clickonsubmitbutton3.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on no option-Currently Dr", ExtentColor.BLUE));
 		print("click on no option-Currently Dr");
 		
 		clickonnobuttonotherproblems.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button-Currently Dr", ExtentColor.BLUE));
 		print("click on submit Button-Currently Dr");
 		
 		clickonsubmitbutton4.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button avalable Dr Currently Dr", ExtentColor.BLUE));
 		print("click on submit button avalable Dr Currently Dr");
 		
 		wait(selectnoimagebutton_CurrentlyDr);
 		selectnoimagebutton_CurrentlyDr.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("select no image button Currently Dr", ExtentColor.BLUE));
 		print("select no image button Currently Dr");
 		
 		Clickonsubmit_CurrentlyDr.click();
 		test.log(Status.INFO, MarkupHelper.createLabel("Click on submit Currently Dr", ExtentColor.BLUE));
 		print("Click on submit Currently Dr");
 		
 		wait(DoctorCardisdisplayed);
 		DoctorCardisdisplayed.isDisplayed();
 		test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed", ExtentColor.BLUE));
 		print("Doctor card is displayed");
 		String doctorName =Doctorcardisisplayed.getText();
 		test.log(Status.INFO, MarkupHelper.createLabel("Assigned Doctor Name is :"+doctorName, ExtentColor.BLUE));
 		print("Assigned Doctor Name is :"+doctorName);
// 		driver.closeApp();
// 		print("App Closed");
  
    
    }catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
     }

}

  // 13 Verify not selecting any option in image upload flow
 // skin problems
 
    public void Verifynotselectinganyoptioninimageuploadflow(String headerValue, String headervalue1, String symptomsdescriptionskin, String entertext) {
    try {

    	login("5599773377");
    	  Thread.sleep(20000);
//        click_talktodoctor.click();
//        test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Talk to Doctor", ExtentColor.BLUE));
//        print("Clicked on Talk to Doctor");
    	  wait(gettext_toolbartitle);
        gettext_toolbartitle.isDisplayed();
        print("Element is displayed");
        String header= gettext_toolbartitle.getText();
    	if (header.equalsIgnoreCase(headerValue)) {
    	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.BLUE));
    	print("Expected Header Value is Matched as :" + headerValue);
    	} else {
    	test.log(Status.INFO, MarkupHelper.createLabel("Expected Header Value is Matched as :" + headerValue, ExtentColor.RED));
    	print("Expected Hearder Value is not Matched as " + headerValue);
    	}
         select_femaleimage.click();
    	test.log(Status.INFO, MarkupHelper.createLabel("Selected Female Gender Image", ExtentColor.BLUE));
    	print("Selected Female Gender Image");
    		
    	clicked_nextbutton.click();
    	test.log(Status.INFO, MarkupHelper.createLabel("Clicked on Next Button", ExtentColor.BLUE));
    	print("Clicked on Next button");
    	
    		gettext_headbartitle.isDisplayed();
    		print("Element is Displayed");
    		String header2= gettext_headbartitle.getText();
    		if (header2.equalsIgnoreCase(headervalue1)) {
    		test.log(Status.INFO, MarkupHelper.createLabel("Expected Header value is Displayed", ExtentColor.BLUE));
    		print("Expected Header value is Displayed: " + headervalue1);
    		} else {
    		test.log(Status.INFO,MarkupHelper.createLabel("Expected header value is not displayed" + headervalue1, ExtentColor.RED));
    		print("Expected header value is not displayed" + headervalue1);
    		}
    		wait(clickon_skinproblemsButton);
    		clickon_skinproblemsButton.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("click on skin problems-Dr card in 5min", ExtentColor.BLUE));
     		print("click on skin problems-Dr card in 5min");
     		
     		healthproblemspageisdisplayed.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("Health problems page displayed-Dr card in 5min", ExtentColor.BLUE));
     		print("Health problems page displayed_Dr card in 5min");
     		
     		wait(entertext_description);
     		entertext_description.sendKeys(symptomsdescriptionskin);
     		test.log(Status.INFO, MarkupHelper.createLabel("Enter the symptoms in the box-Dr card in 5min", ExtentColor.BLUE));
     		print("Enter the symptoms in the box-Dr card in 5min");
     		
     		wait(clickonstartconsultation);
     		clickonstartconsultation.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("Click on start consultation button-Dr card in 5min", ExtentColor.BLUE));
     		print("Click on start consultation button-Dr card in 5min");
     		
     		clickonvideoconsult.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("click on video consultation button-Dr card in 5min", ExtentColor.BLUE));
     		print("click on video consultation button-Dr card in 5min");
     		
     		clickonconfirm.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("click on confirm button-Dr card in 5min", ExtentColor.BLUE));
     		print("click on confirm button-Dr card in 5min");
     		
     		Dermatologypagedisplayed.isDisplayed();
     		test.log(Status.INFO, MarkupHelper.createLabel("Dermatology page is displayed-Dr card in 5min", ExtentColor.BLUE));
     		print("Dermatology page is displayed-Dr card in 5min");
     		
     		clickonotherissues.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("click on other issues button-Dr card in 5min", ExtentColor.BLUE));
     		print("click on other issues button-Dr card in 5min");
     		
     		clickonsubmitbutton.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button Dr card in 5min", ExtentColor.BLUE));
     		print("click on submit button Dr card in 5min");
     		
    		wait(enterherebutton);
    		enterherebutton.sendKeys(entertext);
    		test.log(Status.INFO, MarkupHelper.createLabel("value entered", ExtentColor.BLUE));
    		print("value entered");
    		
    		clickonsubmitbutton.click();
    		test.log(Status.INFO, MarkupHelper.createLabel("clicked on submit button", ExtentColor.BLUE));
    		print("clicked on submit button");
     		
     		clickonnonButton.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("click on no submit Button Dr card in 5min", ExtentColor.BLUE));
     		print("click on no submit Button Dr card in 5min");
     		
     		clickonsubmitbutton2.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button-Dr card in 5min", ExtentColor.BLUE));
     		print("click on submit Button-Dr card in 5min");
     		
     		clickonnooption.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("click on no option-Dr card in 5min", ExtentColor.BLUE));
     		print("click on no option-Dr card in 5min");
     		
     		clickonsubmitbutton3.click();
     		test.log(Status.INFO, MarkupHelper.createLabel("click on submit Button-Dr card in 5min", ExtentColor.BLUE));
     		print("click on submit Button-Dr card in 5min");
     		
     		clickonsubmitbutton_drcardin5min.click();
       		test.log(Status.INFO, MarkupHelper.createLabel("click on submit button-Dr card in 5min", ExtentColor.BLUE));
     		print("click on submit button-Dr card in 5min");
     		
     		Thread.sleep(100000);
     		wait(Doctorcardisdisplayed_drcardin5min);
     		Doctorcardisdisplayed_drcardin5min.isDisplayed();
     		test.log(Status.INFO, MarkupHelper.createLabel("Doctor card is displayed-Dr card in 5min", ExtentColor.BLUE));
     		print("Doctor card is displayed-Dr card in 5min");
     		String doctorName =Doctorcardisisplayed.getText();
     		test.log(Status.INFO, MarkupHelper.createLabel("Assigned Doctor Name is :"+doctorName, ExtentColor.BLUE));
     		print("Assigned Doctor Name is :"+doctorName);
     		Thread.sleep(100000);
//     		driver.closeApp();
//     		print("App Closed");
   
    		
    }catch (Exception e) {
    // TODO: handle exception
    e.printStackTrace();
     }
    }
}
