package com.stackroute.domain;

public class Movie {
    //Actor class object
    Actor actor;

    //constructor
    public Movie(){}

    //setactor method
    public void setActor(Actor actor) {
        this.actor = actor;
    }

    //display function for displaying actor details
    public void display()
    {
        System.out.println("The name of the actor is "+ actor.getName()+
                "\nThe gender of the actor is :"+actor.getGender()+
                "\nThe age of the actor is :"+actor.getAge());
    }
}
