package ca.fresher;

import junit.framework.Assert;

import org.junit.Test;

public class TestRPN {
	@Test
	public void testFirstExmple() {
		String expr = "4 40 +";
		RPNCalc obj = new RPNCalc();
		Assert.assertEquals("44", obj.calculate(expr));
	}

	@Test
	public void test2ndExmple() {
		String expr = "44 40 +";
		RPNCalc obj = new RPNCalc();
		Assert.assertEquals("84", obj.calculate(expr));
	}

	@Test
	public void test3rddExmple() {
		String expr = "44 40 + 20 +";
		RPNCalc obj = new RPNCalc();
		Assert.assertEquals("104", obj.calculate(expr));
	}

	@Test
	public void test4thdExmple() {
		try {
			String expr = "44 +";
			RPNCalc obj = new RPNCalc();
			String result = obj.calculate(expr);
			// Assert.fail();
		} catch (Exception ex) {
			Assert.assertTrue(ex.getMessage().toString(), true);
		}
	}

}
