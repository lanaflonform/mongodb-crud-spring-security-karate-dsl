package com.behl.it.eclair;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.intuit.karate.Results;
import com.intuit.karate.Runner;

class IntegrationTestsRunner {

	@Test
	void testParallel() {
		Results results = Runner.path("classpath:com/behl/it/eclair/feature").parallel(5);
		assertEquals(0, results.getFailCount(), results.getErrorMessages());
	}

}
