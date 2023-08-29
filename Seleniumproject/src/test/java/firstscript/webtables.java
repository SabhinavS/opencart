package firstscript;

import java.time.Duration;

//import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class webtables {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//Static tables
		//find no of rows
		
		int	 rows	=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size();
		System.out.println("no of rows is " +rows);
		
		//find no of col
		int cols	=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size();
		System.out.println("no of cols is " +cols);
		
		//read data from specific row and col
	//	String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
	//	System.out.println("the text is " +value);
		
		//read all data from row and cols
	/*	
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=cols;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"    ");	
			}
			System.out.println();
		}
		
		
		//print data from author name amit
		for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[2]")).getText();
			if(author.equals("Mukesh"))
			{
				String bookname=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[1]")).getText();
			System.out.println(bookname+" ");
			
			*/
			
		//print sum of total price	
		int sum=0;
		for(int r=2;r<=rows;r++)
		{
			String author=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]/td[4]")).getText();
			sum=sum+Integer.parseInt(author);
			}
		System.out.println(sum+" ");
		
	
		}
		
	
	}


