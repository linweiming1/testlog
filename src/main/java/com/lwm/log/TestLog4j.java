package com.lwm.log;


import org.apache.log4j.Logger;

/**
 * Hello world!
 */
public class TestLog4j {

    public static final Logger logger = Logger.getLogger(TestLog4j.class);

    public static void main(String[] args) {

        logger.info("这是log4j的日志记录");
        System.out.println("Hello World!");
    }
}
