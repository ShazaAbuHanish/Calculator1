import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {

	@Test
	public void test() {
		Calculator c=new Calculator();
		int x = c.add(1,2);
		assertEquals(3,x);
	}

}
