package com.stackroute.domain;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Config {

    //bean for actor1 class
    @Bean
    public Actor actor1() {
        Actor actor = new Actor("Kit Harrington","Male",28);
        return actor;

    }

    //bean for actor2 class
    @Bean
    public Actor actor2() {
        Actor actor = new Actor("Emilia Clarke","Female",32);
        return actor;

    }

    //bean for actor3 class
    @Bean
    public Actor actor3() {
        Actor actor = new Actor("Maisie Williams","Female",19);
        return actor;

    }

    //bean for movie class
    @Bean
    public Movie movie1()
    {
        Movie mov = new Movie();
        mov.setActor(actor1());
        return mov;
    }

    //bean for movie class
    @Bean
    @Scope("prototype")
    public Movie movie2()
    {
        Movie mov = new Movie();
        mov.setActor(actor1());
        return mov;
    }

    @Bean (name={"movieA", "movieB"})
    public Movie movieA()
    {
        Movie mov = new Movie();
        mov.setActor(actor2());
        return mov;
    }





}

