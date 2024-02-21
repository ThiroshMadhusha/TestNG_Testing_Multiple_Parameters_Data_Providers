package dataproviding;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestDataProvider {

	/**
	 * Single Data Provider
	 * @param userName
	 */
	@Test(dataProvider="singleDataProvider")
	public void testDataMethod1(String userName) {

		System.out.println("Username : " + userName);

	}

	@DataProvider(name="singleDataProvider")
	public Object[][] singleDataProvider() {

		String[] userName = {"Hello", "Hi", "Bro", "Good", "Nice", "Bye"};

		Object[][] data = new Object[userName.length][1];
		
		for(int i=0; i<userName.length; i++) {
			data[i][0] = userName[i];
		}
		return data;
		
	}
	/**
	 * Multiple Data Provider
	 * @param userName
	 * @param password
	 */
	@Test(dataProvider="multipleDataProvider")
	public void testDataMethod2(String userName, String password) {

		System.out.println("Username : " + userName + " Password : " + password);

	}

	@DataProvider(name="multipleDataProvider")
	public Object[][] multipleDataProvider() {

		String[] userName = {"Hello", "Hi", "Bro", "Good", "Nice", "Bye"};
		String[] password = {"Hello", "Hi", "Bro", "Good", "Nice", "Bye"};

		Object[][] data = new Object[userName.length][2];
		
		for(int i=0; i<userName.length; i++) {
			data[i][0] = userName[i];
			data[i][1] = password[i];
		}
		return data;
		
	}

}
