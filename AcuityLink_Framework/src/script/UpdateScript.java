package script;

import org.testng.annotations.Test;

import generic.BaseTest;
import generic.Utility;

public class UpdateScript extends BaseTest {
	@Test
	public void update() throws InterruptedException {
		
		String id = Utility.getXLData(DATA_PATH, "Sheet1", 1, 1);
		System.out.println(id);
		
		/*for (int i=1; i<=549; i++) {
			String id = Utility.getXLData(DATA_PATH, "Sheet1", 1, i);
			System.out.println(id);
		}*/
		
	}
}