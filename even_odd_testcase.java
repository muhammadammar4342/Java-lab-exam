import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class even_odd_testcase {

	@Test
	void test() {
		Even_odd ob=new Even_odd();
		int chec=ob.check_even_odd(3);
		assertEquals(chec,0);
		
		
		
	}

}
