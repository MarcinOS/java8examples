package com.senco;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.*;

import java.util.*;

/**
 * Date: 06.04.2014 at 20:03
 *
 * @author MS
 */
@Configuration
@ComponentScan
public class Main {

	public static final List<String> STRINGS = Arrays.asList("1", "12", "1234", "1", "123456", "12345");

	public static void main(String[] args) {
		final ApplicationContext context = new AnnotationConfigApplicationContext(Main.class);
		final MessagePrinter messagePrinter = context.getBean(MessagePrinter.class);
		messagePrinter.printMessages(STRINGS);
	}
}
