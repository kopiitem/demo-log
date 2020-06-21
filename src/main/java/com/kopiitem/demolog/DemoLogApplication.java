package com.kopiitem.demolog;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class DemoLogApplication {
    public static void main(String[] args) {

        SpringApplication.run(DemoLogApplication.class, args);
    }

}

@RestController
class LoggingController {

    private final static Logger logger = LoggerFactory.getLogger(LoggingController.class);

    @GetMapping("/")
    public String index() {
        logger.trace("A TRACE Message");
        logger.debug("A DEBUG Message");
        logger.info("An INFO Message");
        logger.warn("A WARN Message");
        logger.error("An ERROR Message");

        return "Howdy! Check out the Logs to see the output...";
    }
}