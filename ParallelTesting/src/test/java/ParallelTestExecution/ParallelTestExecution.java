package ParallelTestExecution;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ParallelTestExecution {
	@Test
	public void chromeParallelTestExecutionMethodLevel(){
		System.out.println("The thread ID for first method "+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Parallel Test Execution in Chrome");	
	}
	@Test
	public void microsoftEdgeParallelTestExecutionMethodLevel(){
		System.out.println("The thread ID for second method "+ Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Parallel Test Execution in MicrosoftEdge");	
	}
	@Test
	public void ParallelTestExecutionMethodLevelThirdMethod(){
		System.out.println("The thread ID for third method "+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Parallel Test Execution in Chrome for Selenium");	
	}
	@Test
	public void ParallelTestExecutionMethodLevelFourthMethod(){
		System.out.println("The thread ID for fourth method "+ Thread.currentThread().getId());
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Parallel Test Execution in MicrosoftEdge for TestNG");	
	}
	@Test
	public void ParallelTestExecutionMethodLevelFifthMethod(){
		System.out.println("The thread ID for fifth method "+ Thread.currentThread().getId());
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("Parallel Test Execution in Chrome for Maven");	
	}
	
}
