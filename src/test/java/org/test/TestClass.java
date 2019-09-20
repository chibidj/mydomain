package org.test;

import java.awt.AWTException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TestClass {

	public static void main(String[] args) throws AWTException {

		System.setProperty("webdriver.chrome.driver",
				"D:\\Selenium\\workspace_chibi\\MavenSample\\driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");

		// Search the iphone in the search bar
		WebElement search = driver.findElement(By.id("twotabsearchtextbox"));
		search.sendKeys("Iphone X");

		// search
		WebElement cl = driver.findElement(By.xpath("//input[@value='Go']"));
		cl.click();

		//getting all elements in list
		List<WebElement> phones = driver
				.findElements(By.xpath("//span[@class='a-size-medium a-color-base a-text-normal']"));
		
		int size = phones.size();
		System.out.println("Total number of items" +size);

		for (WebElement x : phones) {
			System.out.println(x.getText());
			//x.click();
		}
		driver.quit();

	}
}
