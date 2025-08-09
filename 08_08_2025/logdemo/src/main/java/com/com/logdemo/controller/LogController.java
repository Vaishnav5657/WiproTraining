package com.com.logdemo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LogController {

	    private static final Logger logger = LoggerFactory.getLogger(LogController.class);

	    @GetMapping("/greet")
	    public String greet() {

	        logger.error("--Error--");
	        logger.warn("--Warn--");
	        logger.info("--Info--");
	        logger.debug("--Debug--");
	        logger.trace("--Trace--");

	        return "Hello from /greet!";
	    }
}
