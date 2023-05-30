package com.qa.util;

import java.io.File;
import java.io.FileInputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ConfigReader {
	
		//loading properties file
		 public Properties initializeProperties() {
		Properties prop = new Properties();
		File propFile = new File
				("C:\\Users\\Satyadurga\\eclipse-workspace\\cucumberwithpom\\src\\test\\resources\\com\\qa\\config\\config.properties");
		try {
			FileInputStream fis = new FileInputStream(propFile);
			prop.load(fis);
		} catch (Throwable e) {
			e.printStackTrace();
		}
		return prop;
		 }
}
	 

