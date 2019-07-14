package com.stackroute.domain;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class Movie implements ApplicationContextAware, BeanFactoryAware, BeanNameAware {

    Actor actor;
    private ApplicationContext context= null;
    private BeanFactory beanFactory;

    //constructor
    public Movie(){}

    //setactor method
    @Autowired
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

    //SetBeanFactory For ApplicationContextAware
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.context =context;
        System.out.println("ApplicationContextAware implemented");

    }

    //setBeanName for Bean Name
    @Override
    public void setBeanName(String beanName) {
        System.out.println("Bean Name is : "+ beanName);

    }

    //setApplicationContext for BeanFactoryAware
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.beanFactory = beanFactory;
        System.out.println("BeanFactoryAware implemented");

    }
}
