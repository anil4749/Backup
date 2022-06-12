package com.apauto.constants;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ValidationMessageLinkdin {
	
	public static void main(String[] args) {

	WebDriverManager.chromedriver().setup();
	WebDriver driver = new ChromeDriver();
	driver.get("https://askomdch.com/product/anchor-bracelet/");
	driver.manage().window().maximize();
	driver.findElement(By.cssSelector("input[title='Qty']")).clear();
	driver.findElement(By.cssSelector("input[title='Qty']")).sendKeys("0");
	driver.findElement(By.name("add-to-cart")).click();
	String validationMessage = driver.findElement(By.cssSelector("input[title='Qty']")).getAttribute("validationMessage");
	System.out.println("validationMessage - " + validationMessage);

	}
	}


