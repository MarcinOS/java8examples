package com.senco;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.function.*;
import java.util.stream.Collectors;

/**
 * Date: 06.04.2014 at 20:01
 *
 * @author MS
 */
@Component
public class AwesomeMessageService implements MessageService {

	private final Function<Integer, Predicate<String>> longerThan = length -> message -> message.length() > length;

	@Override
	public List<String> filterMessages(final List<String> messages) {
		return messages.stream()
				.filter(longerThan.apply(3))
				.collect(Collectors.toList());
	}

}
