package com.stackroute.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //for accessing Config.class
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        // Using Autowire byName
        Movie movie1 = context.getBean("movie1", Movie.class);
        movie1.display();
    }
}
