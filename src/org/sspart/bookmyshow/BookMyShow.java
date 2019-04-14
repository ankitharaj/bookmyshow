package org.sspart.bookmyshow;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BookMyShow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\ANKITHA\\Downloads\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//opening the url
		driver.get("https://in.bookmyshow.com/hyderabad");
		driver.findElement(By.id("wzrk-cancel")).click();
		
		//clicking the search box
		driver.findElement(By.id("input-search-box")).click();
		
		//selecting the majili movie
		driver.findElement(By.xpath("//*[text()=\"Majili (UA)\"]")).click();
		
		//selecting the theater
		driver.findElement(By.xpath("//*[text()=\"Asian Cineplanet Multiplex: Kompally\"]")).click();
		
		//selecting show timeings
		driver.findElement(By.xpath("//*[@id=\"showEvents\"]/ul/li[4]/div[2]/div[3]/a")).click();
		
		//accepting the terms
		driver.findElement(By.xpath("//*[text()='Accept']")).click();
		
		//seelecting the seats
		driver.findElement(By.xpath("//*[@id=\"proceed-Qty\"]")).click();
		
		//selecting row name
		driver.findElement(By.xpath("//*[@id=\"layout\"]/table/tbody/tr[16]/td[1]/div")).click();
		
		//selecting the seats
		driver.findElement(By.xpath("//*[@id=\"D_3_03\"]/a")).click();
		driver.findElement(By.xpath("//*[@id=\"D_3_04\"]/a")).click();
		
		//paying
		driver.findElement(By.xpath("//*[@id=\"btnSTotal_reserve\"]")).click();
		
	 driver.quit();
		

	}

}
