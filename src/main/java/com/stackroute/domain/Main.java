package com.stackroute.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //for accessing Config.class
        ConfigurableApplicationContext configurableApplicationContext = new AnnotationConfigApplicationContext(Config.class);

        //for BeanLifecycleDemoBean
        BeanLifecycleDemoBean beanLifecycleDemoBean = configurableApplicationContext.getBean(BeanLifecycleDemoBean.class);


        //closing down the application
        configurableApplicationContext.registerShutdownHook();
    }
}
