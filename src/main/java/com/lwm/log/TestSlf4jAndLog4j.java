package com.lwm.log;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class TestSlf4jAndLog4j {
    public static final Logger logger = LoggerFactory.getLogger(TestSlf4jAndLog4j.class);

    public static void main(String[] args) {

        logger.info("这是slf4j+log4j的日志记录");

        System.out.println("Hello World!");
    }

}
