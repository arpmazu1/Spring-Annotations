package com.stackroute.domain;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class BeanLifecycleDemoBean implements InitializingBean, DisposableBean {

    //afterPropertiesSet method for InitializingBean
    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("InitializingBean implemented");

    }

    //destroy method for DisposableBean
    @Override
    public void destroy() throws Exception {
        System.out.println("DisposableBean implemented");
    }

    //customInit method
    @PostConstruct
    public void customInit()
    {
        System.out.println("customInit called");
    }

    //customDestroy method
    @PreDestroy
    public void customDestroy()
    {
        System.out.println("customDestroy called");
    }
}


