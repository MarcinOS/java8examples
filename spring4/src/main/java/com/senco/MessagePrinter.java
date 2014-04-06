package com.senco;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Date: 06.04.2014 at 19:56
 *
 * @author MS
 */
@Component
public class MessagePrinter {

	@Autowired
	private MessageService messageService;

	public void printMessages(List<String> messages) {
		System.out.println(messageService.filterMessages(messages).toString());
	}

}
