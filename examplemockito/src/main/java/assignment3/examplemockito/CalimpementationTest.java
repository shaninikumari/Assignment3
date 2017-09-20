package assignment3.examplemockito;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalimpementationTest extends TestCase {
	Calimpementation obj;
	int a, b;

	protected void setUp() throws Exception {
		obj = new Calimpementation();
		a = 8;
		b =4;
		
		calInterface mockobj =mock(calInterface.class);
		when(mockobj.add(a, b)).thenReturn(a+b);
		when(mockobj.subtract(a, b)).thenReturn(a-b);
		when(mockobj.multiply(a, b)).thenReturn(a*b);
		when(mockobj.divide(a, b)).thenReturn((double) (a|b));
		
		
		obj.setIntObj(mockobj);
	}

	
	public void testAddTwoNums() {
		//fail("Not yet implemented");
		assertEquals(12, obj.addTwoNums(a, b));
		
		
	}
	public void subtract() {
		//fail("Not yet implemented");
		assertEquals(4, obj.subtract(a, b));
		
		
	}
	public void multiply() {
		//fail("Not yet implemented");
		assertEquals (32, obj.divide(a, b));
		
		
	}
	public void divide() {
		//fail("Not yet implemented");
		assertEquals(2, obj.divide(a, b));
		
		
	}
	
	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b =0;
	}


}
