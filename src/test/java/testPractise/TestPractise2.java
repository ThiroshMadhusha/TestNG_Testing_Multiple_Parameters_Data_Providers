package testPractise;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestPractise2 {

	@Test(dataProvider="singleDataProviderMethod1")
	public void SingleStringTestMethod(String DataValue) {
		
		System.out.println("Value is : " + DataValue);
	}
	
	@DataProvider(name="singleDataProviderMethod1")
	public String[] singleDataProviderMethod1() {
		
		String[] value = {"Thirosh", "Madhusha", "Pasan", "Sayu"};
		return value;
	}

	
	@Test(dataProvider="SingleTestDataMethod2")
	public void SingleObjectTestMethod(String valueName) {
		
		System.out.println("Data Value : " + valueName);
	}
	
	@DataProvider(name="SingleTestDataMethod2")
	public Object[][] SingleTestDataMethod2(){
		
		String[] testData = {"1", "200", "3000"};
		
		Object[][] data = new Object[testData.length][1];
		
		for(int i=0; i<testData.length; i++) {
			
			data[i][0] = testData[i];
		}
		return data;
	}
	
	@Test(dataProvider="multipleDataProvider")
	public void MultipleObjectTestMethod(String name, String age, String sex) {
		
	System.out.println("Test Value Is : " + name);	
	System.out.println("Test Value Is : " + age);	
	System.out.println("Test Value Is : " + sex);	

	System.out.println("User Display Successfully");
	System.out.println();

	}
	
	@DataProvider(name="multipleDataProvider")
	public Object[][] multipleDataProvider(){
		
		String[] name = {"Hello", "Baby", "Nice", "Bro", "Bye"};
		String[] age = {"10", "30", "34", "78", "36"};
		String[] sex = {"Male", "Female", "Male", "Male", "Female"};
		
		Object[][] data = new Object[name.length][3];
		
		for(int i=0; i<name.length; i++) {
			
			data[i][0] = name[i];
			data[i][1] = age[i];
			data[i][2] = sex[i];
		}
		return data;
		
	}
}
