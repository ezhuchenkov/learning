package ru.alexander.learning.logging;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class LoggingExample {

    static final Logger log = LoggerFactory.getLogger(LoggingExample.class);

    public static void main(String[] args) {
        System.out.println(System.currentTimeMillis() + " " + LoggingExample.class.getSimpleName() +  " hello");
        //java.util.logging
        //log4j
        //logback

        //slf4j

        log.debug("Hello");
        //trace < debug < info < warn < error

    }

}
