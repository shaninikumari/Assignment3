import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ImplementationTest {

	private Implementation obj;

	@Before
	public void setUp() throws Exception {
		obj = new Implementation();
	}

	@After
	public void tearDown() throws Exception {
		obj = null;
	}

	// @Test
	public void testAdd() {
		long ans = 5 + (-3) + 21 + (-18);
		assertEquals(ans, obj.add(5, -3, 21, -18));

		ans = 38 + (-17);
		assertEquals(ans, obj.add(38, -17));

		ans = 0;
		assertEquals(ans, obj.add(0));
	}

	// @Test
	public void testSubtract() {
		long ans = 5 - (-3) - 45 - 13;
		assertEquals(ans, obj.subtract(5, -3, 45, 13));

		ans = 15 - 59;
		assertEquals(ans, obj.subtract(15, 59));

		ans = 0;
		assertEquals(ans, obj.add(0, 0, 0, 0));
	}

	// @Test
	public void testDivide() {
		long ans = 500 / 4 / 2;
		assertEquals(ans, obj.divide(500, 4, 2));

		ans = 0;
		assertEquals(ans, obj.divide(0, 1));

		ans = -13;
		assertEquals(ans, obj.divide(-13, 1));
	}

	// @Test
	public void testProduct() {
		long ans = 15 * -4 * 16 * 3;
		assertEquals(ans, obj.product(15, -4, 16, 3));

		ans = 0;
		assertEquals(ans, obj.product(0));
	}

	@Test
	public void testExponent() {
		long ans = Double.valueOf(Math.pow(5.0, 5.0)).longValue();
		assertEquals(ans, obj.exponent(5, 5));

		ans = Double.valueOf(Math.pow(Math.pow(12.0, 3.0), 4.0)).longValue();
		assertEquals(ans, obj.exponent(12, 3, 4));

		ans = Double.valueOf(Math.pow(Math.pow(12.0, -3.0), 4.0)).longValue();
		try {
			obj.exponent(12, -3, 4);
			fail("Expected this to throw IllegalArgumentException");
		} catch (IllegalArgumentException e) {
			// This is what we expect
		}

	}

}
