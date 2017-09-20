package assignment3.examplemockito;

import static org.mockito.Mockito.*;

import junit.framework.TestCase;

public class CalimpementationTest extends TestCase {
	Calimpementation obj;
	int a, b;

	protected void setUp() throws Exception {
		obj = new Calimpementation();
		a = 5;
		b =8 ;
		
		calInterface mockobj = mock(calInterface.class);
		when(mockobj.add(a, b)).thenReturn(a+b);
		
		obj.setIntObj(mockobj);
	}

	
	public void testAddTwoNums() {
		//fail("Not yet implemented");
		assertEquals(13, obj.addTwoNums(a, b));
		
		
	}
	protected void tearDown() throws Exception {
		obj = null;
		a = 0;
		b =0;
	}


}
