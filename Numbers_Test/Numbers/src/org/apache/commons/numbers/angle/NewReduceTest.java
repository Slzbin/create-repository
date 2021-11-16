package org.apache.commons.numbers.angle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class NewReduceTest {

	private static NewReduce reduce = new NewReduce(2, -2);
		
	@Test
	void test() {
		assertEquals(1, reduce.applyAsDouble(5));
	}
	
}