package com.aj.conversation;

import jakarta.annotation.PostConstruct;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.core.env.Environment;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Component;

@SpringBootApplication
public class ConversationApplication {

    public static void main(String[] args) {
        SpringApplication.run(
                ConversationApplication.class,
                args
        );
    }

}