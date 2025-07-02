package assignment;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathByAxes {
	
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("file:///C:/Users/Nemiraj/Documents/table.html");
		
		
		String movie = "chaava";
		String collection = driver.findElement(By.xpath("//td[text()='"+movie+"']/following::td[1]")).getText();
		System.out.println(collection);
		
//		String position = driver.findElement(By.xpath("//td[text()='dragon']/preceding::td[1]")).getText();
//        System.out.println(position);
//        
//		String Imdb = driver.findElement(By.xpath("//td[text()='chaava']/following::td[2]")).getText();
//         System.out.println(Imdb);
		
	}

}
