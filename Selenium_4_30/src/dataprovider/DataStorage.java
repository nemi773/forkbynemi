package dataprovider;

import org.testng.annotations.DataProvider;

public class DataStorage {
	@DataProvider
	public String[][] dataSender(){
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};//2D array
		return data;
		
	}
	@DataProvider
	public String[][] registerdata(){
		String[][] data= {{"admin","admin"},{"admin","ad"},{"ad","admin"},{"ad","ad"}};//2D array
		return data;
		
		
	}


}
