package com.ibm.pagetest;

import java.io.IOException;
import java.lang.reflect.Method;
import java.net.MalformedURLException;
import java.rmi.UnexpectedException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.ibm.common.Hooks;



public class SelHomeTest extends Hooks {
  @Test(dataProvider="hardCodedBrowsers",description="This test case is going to open selenium URL and click Projects page validate title")
  public void openSeleniumURL_TC1234(String browser,String version,String os, Method method) throws UnexpectedException, MalformedURLException,IOException, InterruptedException {
	  this.createDriver(browser, version, os, method.getName());
	  WebDriver driver = this.getWebDriver();
	 // SeleniumHome objSel =  new SeleniumHome(driver);
	  
	  //Open Seleniumhq page URL
	  //driver.get(PropFileHandler.fetchProp("URL"));
	  //objSel.setTimeOut();
	  
	  //Click on the Project tab in SeleniumHq page and validate the title...
	  //objSel.clickProjectTab();
	  
	  //Put your logic below....
}
}
