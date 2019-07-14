package com.stackroute.domain;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionReader;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.DefaultListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanDefinitionReader;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.io.ClassPathResource;


public class Main {
    public static void main(String[] args) {

        //Application context for Cnofig.class
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        // inorder to access Movie bean
        Movie movie = context.getBean(Movie.class);
        //calling the display function of Movie class
        movie.display();

        //BeanFactory
        BeanFactory beanFactory = new AnnotationConfigApplicationContext(Config.class);
        Movie movie1 = context.getBean(Movie.class);
        movie1.display();



    }
}
