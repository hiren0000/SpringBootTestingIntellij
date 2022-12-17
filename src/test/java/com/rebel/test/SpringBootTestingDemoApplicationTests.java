package com.rebel.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


class SpringBootTestingDemoApplicationTests {

	Calculator c = new Calculator();

	@Test
	void contextLoads()
	{
	}

	@Test
	void testSum()
	{
		//expected result
		int ex = 20;

		//actual result
		int ac = c.doSum(10,5,5);

		assertThat(ac).isEqualTo(ex);

	}

	@Test
	void testMulti()
	{
		int ex = 18;

		int ac = c.doMulti(3,6);

		assertThat(ac).isEqualTo(ex);
	}

	@Test
	void testCom()
	{
		boolean ac = c.com(5,5);

		assertThat(ac).isTrue();
	}

}
