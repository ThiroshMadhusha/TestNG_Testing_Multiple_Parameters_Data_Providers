package dataproviding;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class SingleDataProvider {
	
	@Test(priority=1, dataProvider = "userNameData")
	public void newCreateUser(String UserNames) {
		
	System.out.println("New Username Is : " + UserNames);
		
	}
	/**
	 * Add One Single Data Provider
	 * @return
	 */
	@DataProvider(name="userNameData")
	public String[] userNameData() {
		
		String[] userNames = {"thirosh", "madhusha", "pasan", "sayu", "nirosha"};
	    return userNames;
	}
	

}
