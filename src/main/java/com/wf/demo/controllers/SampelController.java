package com.wf.demo.controllers;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.format.annotation.DateTimeFormat.ISO;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampelController {
	Logger log = LoggerFactory.getLogger(this.getClass().getName());

	@GetMapping
	public String getAll() {
		log.info("I'm in Hello world method....");
		log.trace("TRACE LOG tetsing  method....");
		return "Hello world .......";

	}

	@GetMapping("/user/{dob}")
	public String getUsers(@PathVariable("dob")@DateTimeFormat(iso=ISO.DATE) Date d) {

		return "USER ......." + d;

	}

	@GetMapping("/admin")
	public String getAdmins() {
		return "ADMIN .......";

	}
}
