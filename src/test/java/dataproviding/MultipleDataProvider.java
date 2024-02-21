package dataproviding;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class MultipleDataProvider {
	
	@Test(priority=1, dataProvider = "userData")
	public void newCreateUser(String UserNames, String firstNames, String lastNames, String emails, String cellphones, String password) {
				
		System.out.println(UserNames);
		System.out.println(firstNames);
		System.out.println(lastNames);
		System.out.println(emails);
		System.out.println(cellphones);
		System.out.println(password);
		
		System.out.println("Create USer Data Successful!");
		System.out.println();
		
	}
	
	@DataProvider(name="userData")
	public Object[][] userData() {
		
		String[] userNames = {"thirosh", "madhusha", "pasan", "sayu", "nirosha"};
		String[] firstNames = {"RR", "DD", "FF", "VV", "WW"};
		String[] lastNames = {"223", "D34534D", "34543", "V234V", "W131W"};
		String[] emails = {"as22@gmail.com", "jgf@gmail.com", "ds@gmail.com", "sad@gmail.com", "fd131@gmail.com"};
		String[] cellphones = {"231412223", "5435353532", "343423543", "2332414124", "768464636"};
		String[] password = {"wqeqw", "dsada", "23eqw", "45t4gs", "32e23e"};
		
		//define object size
		Object[][] data = new Object[userNames.length][6];

	    for (int i = 0; i < userNames.length; i++) {
	        data[i][0] = userNames[i];
	        data[i][1] = firstNames[i];
	        data[i][2] = lastNames[i];
	        data[i][3] = emails[i];
	        data[i][4] = cellphones[i];
	        data[i][5] = password[i];
	    }

	    return data;
	}
	

}
