package base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;



public class Base {
	
	public WebDriver lDriver;
	
	public Base(WebDriver rDriver) {
		
		lDriver=rDriver;
		PageFactory.initElements(rDriver, this);	
	}

	
		
		
		
	}


