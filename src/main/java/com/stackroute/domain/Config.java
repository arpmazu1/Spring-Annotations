package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    //bean for actor class
    @Bean
    public Actor actor() {
        Actor actor = new Actor("Kit Harrington","Male",28);
        return actor;

    }

    //bean for movie class
    @Bean
    public Movie movie1()
    {
        Movie mov = new Movie();
        return mov;
    }

    //bean for BeanLifecycleDemoBean
    @Bean
    public BeanLifecycleDemoBean beanLifecycleDemoBean()
    {
        return new BeanLifecycleDemoBean();
    }

    @Bean
    public BeanPostProcessorDemoBean beanPostProcessorDemoBean(){
        return new BeanPostProcessorDemoBean();
    }


}

