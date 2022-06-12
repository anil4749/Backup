package com.apauto.constants;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ValidationMessage {

	public static void main(String[] args) {

		
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://askomdch.com/product/anchor-bracelet/");
		driver.manage().window().maximize();
		
		System.out.println(driver.findElement(By.name("quantity")).getAttribute("validationMessage"));
	}

}
