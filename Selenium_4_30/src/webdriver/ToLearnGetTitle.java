package webdriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToLearnGetTitle {
	public static void main(String[] args) {
		WebDriver driver=new ChromeDriver();
		
	 driver.get("https://www.instagram.com/explore/");
	 
	 
		String title = driver.getTitle();
		System.out.println(title);
		
		if(title.equals("Explore photos and videos on Instagram")) {
			System.out.println("user navigated to instagram");
		}else {
			System.out.println("user not navigated to instagram");
		}
		
	}

}
