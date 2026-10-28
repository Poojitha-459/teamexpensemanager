package com.vcube.sbapp_yml_logging_demo1.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HiiController {

public static final Logger logger= LoggerFactory.getLogger(HiiController.class);	

@GetMapping("/hiiii")
void hello(){
	logger.trace("trace called");
	logger.debug("debug called");
	logger.info("info called");
	logger.warn("warn called");
	logger.error("error called");
}
	
}
