package com.utils;



import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;

public class CommonUtils {
	public AndroidDriver driver;
	public void print(String msg) {
		try {
			System.out.println(msg);
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("Unable to print the "+msg);
			
		}
		
	}
}
//	public void waitcondition(WebElement element) {
//		try {
//			WebDriverWait wait = new WebDriverWait(driver, 10);
//			wait.until(ExpectedConditions.visibilityOf(element));
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//
//	}
//
////	public void clickElement(WebElement element) {
////		try {
////			waitcondition(element);
////			element.click();
////			print("Clicked on Element as :" + element);
////		} catch (Exception e) {
////			print("Unable to click on Element :" + element);
////			e.printStackTrace();
//	//}
////	}
//
//	public void enterTextValue(WebElement element, String value) {
//		try {
//			waitcondition(element);
//			element.sendKeys(value);
//			print("Entered Value is :" + value);
//		} catch (Exception e) {
//			print("Unable to Enter the Value in text box as :" + value);
//			e.printStackTrace();
//		}
//
//	}
//
//	public void gettext(WebElement element, String value) {
//		try {
//			waitcondition(element);
//			value = element.getText();
//			print("Got text " + value);
//		} catch (Exception e) {
//			print("Unable to get the text in " + value);
//			e.printStackTrace();
//		}
//	}
//	public boolean isdisplayed(WebElement element) {
//				waitcondition(element);
//				boolean flag = element.isDisplayed();
//				print("Element is displayed"+element);
//				return flag;
//			
//		
//	}
//	public void isselected(WebElement element) {
//		try {
//			waitcondition(element);
//			element.isSelected();
//			print("Element is Selected");
//		} catch (Exception e) {
//			print("Element is not selected");
//			e.printStackTrace();
//		}
//	}
//}
//

