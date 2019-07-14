package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class Config {

    //bean for movie class
    @Bean
    public Movie movie()
    {
        Movie mov = new Movie();
        mov.setActor(actor());
        return mov;
    }

    //bean for actor class
    @Bean
    public Actor actor() {
        Actor actor = new Actor();
        actor.setAge(22);
        actor.setGender("Female");
        actor.setName("Sophie Turner");
        return actor;

    }





}

