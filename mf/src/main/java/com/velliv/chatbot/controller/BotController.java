package com.velliv.chatbot.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.velliv.chatbot.bot.Opening;

@RestController
public class BotController {
	
	@Autowired
	public Opening open;

	@GetMapping("/bot")
	public void greeting() {
		open.start();
	}
}