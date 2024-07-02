package Testng;

import org.testng.annotations.Test;

public class SampleTest {
	
	@Test
	public void createProduct() {
		System.out.println("product created");
	}

	@Test
	public void modifyProduct() {
		System.out.println("product modify");
	}
	
	@Test
	public void deleteProduct() {
		System.out.println("product delete");
	}
}
