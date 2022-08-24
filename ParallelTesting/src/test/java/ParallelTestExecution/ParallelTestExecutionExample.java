package ParallelTestExecution;

import org.testng.annotations.Test;

public class ParallelTestExecutionExample {
	@Test
	public void firstMethod(){
		System.out.println("The thread ID for first method - " + Thread.currentThread().getId());
		System.out.println("Fisrt Method completed!");
	}
	@Test
	public void secondMethod(){
		System.out.println("The thread ID for second method - " + Thread.currentThread().getId());
		System.out.println("Second Method completed!");
	}
	@Test
	public void thirdMethod(){
		System.out.println("The thread ID for third method - " + Thread.currentThread().getId());
		System.out.println("Third Method completed!");
	}
	@Test
	public void fourthMethod(){
		System.out.println("The thread ID for fourth method - " + Thread.currentThread().getId());	
		System.out.println("Fourth Method completed!");
	}
	@Test
	public void fifthMethod(){
		System.out.println("The thread ID for fifth method - " + Thread.currentThread().getId());
		System.out.println("Fifth Method completed!");
	}
	
}
