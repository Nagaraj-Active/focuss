package pom;

import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SAdminRole 
{
 public WebDriver driver;
 public SAdminRole(WebDriver driver)
 {
	 this.driver=driver;
	 PageFactory.initElements(driver,this);
 }
 @FindBy(xpath="//input[@placeholder='Permission Title']")WebElement permissionTitle;
 @FindBy(xpath="//input[@type='checkbox']")List<WebElement> allCheckBoxes;	
 public boolean VerifyPermissionTitleField()
 {
 	boolean verify=permissionTitle.isEnabled();
     return verify;
 }
 public void ClearPermissiontitle()
 {
	 permissionTitle.clear();
     
 }

 public void EnterPermissionTitle(String name)
 {
	 permissionTitle.sendKeys("anil");;
     
 }
 public void verifyAllCheckBox() 
 {
	    int count = 0;
	    int totalCheckboxes = allCheckBoxes.size();

	    for (WebElement checkbox : allCheckBoxes) {
	        if (checkbox.isSelected()) {
	            count++;
	        }
	    }

	    if (count == totalCheckboxes) {
	        String a="All checkboxes are selected";
	    } else {
	        System.out.println("Not all checkboxes are selected");
	    }
		
	 
}}