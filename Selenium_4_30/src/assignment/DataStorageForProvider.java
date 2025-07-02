package assignment;

import org.testng.annotations.DataProvider;

import net.bytebuddy.asm.Advice.Return;

public class DataStorageForProvider {
	@DataProvider
	public String[][] regdata(){
		
		String[][] data1= {{"nemi","raj","abc@gmail.com","pass@123","pass@123"},
				{"nemi","raj","abc@gmail.com","pass@123","pass@123"},
				{"nemi","raj","abc@gmail.com","pass@123","pass@123"},
				{"nemi","raj","abc@gmail.com","pass@123","pass@123"},
				{"nemi","raj","abc@gmail.com","pass@123","pass@123"},
				{"nemi","raj","abc@gmail.com","pass@123","pass@123"}};
		return data1;
		
		
	}

}
