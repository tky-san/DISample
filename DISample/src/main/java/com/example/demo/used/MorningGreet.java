package com.example.demo.used;

import org.springframework.stereotype.Component;

/**
 * 朝の挨拶を行う
 */
@Component
public class MorningGreet implements Greet {

	@Override
	public String greeting() {
		return "おはようございます";
	}
}
