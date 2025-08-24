package org.springframework.samples.petclinic.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class LoggingDemoService {
    private static final Logger logger = LoggerFactory.getLogger(LoggingDemoService.class);

    public void demonstrateLogging() {
        logger.info("LoggingDemoService - Demonstrating different log levels");
        logger.debug("This is a DEBUG message");
        logger.warn("This is a WARN message");
        logger.error("This is an ERROR message");
    }
}
