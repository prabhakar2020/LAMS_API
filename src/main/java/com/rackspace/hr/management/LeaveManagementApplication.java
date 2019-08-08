package com.rackspace.hr.management;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@ComponentScan({ "com.rackspace.hr.management" })
@SpringBootApplication
public class LeaveManagementApplication {
    
    private static Logger logger = LoggerFactory.getLogger(LeaveManagementApplication.class);


    public static void main(String[] args) {
        SpringApplication.run(LeaveManagementApplication.class, args);
    }
}
