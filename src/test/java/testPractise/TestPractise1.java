package testPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPractise1 {

	/**
	 * Single Data Provider String[] Method
	 * @param DisplayData
	 */
	@Test(priority=1, dataProvider="SingleTestDataProvider1")
	public void SingleTestDataMethod1(String DisplayData) {
		
		System.out.println("Test Data Display : " + DisplayData);
		
	}
	
	@DataProvider(name ="SingleTestDataProvider1")
	public String[] SingleTestDataProvider1() {
		
		String[] data = {"Name", "Hello", "Hi"};
		return data;
	}
	
	// *******************************************************************
	
	/**
	 * Single Data Provider Object[] Method
	 */
	@Test(priority=2, dataProvider="SingleTestDataProvider2")
	public void SingleTestDataMethod2(String DisplayData) {
		
		System.out.println("Test Data Display : " + DisplayData);
	}
	
	@DataProvider(name="SingleTestDataProvider2")
	public Object[][] SingleTestDataProvider2(){
		
		String[] values = {"AAA", "BBB", "CCC", "DDD", "EEE"};
		
		Object[][] data = new Object[values.length][1];
		
		for(int i=0; i<values.length; i++) {
			
			data[i][0] = values[i];
		}
		return data;
	}
	
	// *******************************************************************

	/**
	 * Multiple Data Provider[]
	 * @param Number1
	 * @param Number2
	 * @param Number3
	 * @param Number4
	 */
	@Test(priority=3, dataProvider="MultipleDataProvider")
	public void MultipleTestData(String Number1, String Number2, String Number3, String Number4) {
		
		System.out.println("Add Number One : " + Number1);
		System.out.println("Add Number Two : " + Number2);
		System.out.println("Add Number One : " + Number3);
		System.out.println("Add Number Two : " + Number4);

		System.out.println("Multiple Data Test Pass...!");
		System.out.println();
	}
	
	@DataProvider(name="MultipleDataProvider")
	public Object[][] MultipleDataProvider() {
		
		String[] No1 = {"1", "2", "3"};
		String[] No2 = {"10", "20", "30"};
		String[] No3 = {"100", "200", "300"};
		String[] No4 = {"1000", "2000", "3000"};
		
		Object[][] data = new Object[No1.length][4];
		
		for(int i=0; i<No1.length; i++) {
			
			data[i][0] = No1[i];
			data[i][1] = No2[i];
			data[i][2] = No3[i];
			data[i][3] = No4[i];
		}
		return data;
		
	}
	
	

}
