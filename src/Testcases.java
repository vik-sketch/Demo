import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class Testcases {
	
	SoftAssert sa = new SoftAssert();

	@Test
	public void test1() {
		
		System.out.println("open browser");     // we can use hard assert after this line to ensure browser is opening or not
		
					//   expected,actual 
		Assert.assertEquals(true, true); 					// HARD ASSERT - here assertion pass because true, true
		
		System.out.println("enter username");
		System.out.println("enter password");		
		sa.assertEquals(true, false);                         // error 1
		
		System.out.println("click on sign in button");	
		sa.assertEquals(true, false);                         // error 2          
		
		System.out.println("validate home page");
		
		sa.assertAll();
	}
}
