package com.wisely.ch9_3_4;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.core.JmsTemplate;

@SpringBootApplication
public class Ch934Application implements CommandLineRunner {
    
    @Autowired
    JmsTemplate jmsTemplate;
    
    public static void main(String[] args) {
        SpringApplication.run(Ch934Application.class, args);
        
    }
    
    @Override
    public void run(String... args) throws Exception {
        jmsTemplate.send("my-destination", new Msg());
        
    }
}
