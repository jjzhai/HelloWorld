package com.easyluck.helloword;

import junit.framework.TestCase;

import org.junit.Test;

public class MoneyTest extends TestCase {
	private Money f12CHF;
	private Money f14CHF;

	@Override
	protected void setUp() {
		this.f12CHF = new Money(12, "CHF");
		this.f14CHF = new Money(14, "CHF");
	}
	@Test
	public void testEquals() {
		assertTrue(!this.f12CHF.equals(null));
		assertEquals(this.f12CHF, this.f12CHF);
		assertEquals(this.f12CHF, new Money(12, "CHF"));
		assertTrue(!this.f12CHF.equals(this.f14CHF));
	}

	@Test
	public void testSimpleAdd() {
		Money expected = new Money(26, "CHF");
		Money result = this.f12CHF.add(this.f14CHF);
		assertTrue(expected.equals(result));
	}

}
