package PageObjects;

import java.io.IOException;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import Library.Common;

public class ObservationsPage {
	
	@FindBy(how= How.CSS, using = "#drug-name")
    public WebElement drug_name;
	
	@FindBy(how= How.CSS, using = ".accept-btn")
    public WebElement accept_btn;
	
	@FindBy(how= How.CSS, using = "#uniform-dose")
    public WebElement dose;
	
	public ObservationsPage(){
    	PageFactory.initElements(Common.Webdriver,this);
    }
	
	public void prescribeFreeTextDrugToPatient(String DrugName) throws InterruptedException, IOException {
		 Common.waitUntilAppReady(Common.Webdriver);
	 } 
	

}
