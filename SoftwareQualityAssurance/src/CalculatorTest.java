import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {


	
	@Test
	public void testAddition(){
		
		Calculator c = new Calculator(3,6);
		assertEquals(9, c.addition());
	}
	
	@Test
	public void testSubtraction(){
		
		Calculator c = new Calculator(5,3);
		assertEquals(2, c.subtraction());
	}
	
	
	@Test
	public void testDivision(){
		
		Calculator c = new Calculator(10,2);
		assertEquals(5, c.division());
	}
	
	@Test
	public void testMultiplication(){
		
		Calculator c = new Calculator(2,3);
		assertEquals(6, c.multiplication());
	}
	
	
	

}
