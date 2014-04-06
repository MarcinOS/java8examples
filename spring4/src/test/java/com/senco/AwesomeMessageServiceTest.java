package com.senco;

import org.junit.*;

import java.util.*;

import static org.junit.Assert.assertEquals;

/**
 * Date: 06.04.2014 at 20:09
 *
 * @author MS
 */
public class AwesomeMessageServiceTest {

	private AwesomeMessageService awesomeMessageService;

	@Before
	public void setUp() throws Exception {
		awesomeMessageService = new AwesomeMessageService();
	}

	@Test
	public void shouldFilterMessagesLongerThan3Chars() throws Exception {
		final List<String> strings = awesomeMessageService.filterMessages(Main.STRINGS);
		assertEquals(Arrays.asList("1234", "123456", "12345"), strings);
	}
}
