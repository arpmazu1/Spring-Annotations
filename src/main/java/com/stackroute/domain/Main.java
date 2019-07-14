package com.stackroute.domain;


import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {

        //for accessing Config.class
        ApplicationContext context = new AnnotationConfigApplicationContext(Config.class);

        // injected three beans of actor and acessimg each bean
        Actor actor1 = context.getBean("actor1", Actor.class);
        Actor actor2 = context.getBean("actor2", Actor.class);
        Actor actor3 = context.getBean("actor3", Actor.class);

        //printing each bean values
        System.out.println("The actor details : ");
        System.out.println(actor1);
        System.out.println(actor2);
        System.out.println(actor3);

        // inorder to access Movie bean and printing tthe actor details after injecting
        Movie movie1 = context.getBean("movie1",Movie.class);
        movie1.display();

        //printing the equality result of the two beans created
        Movie movie2 = context.getBean("movie1",Movie.class);
        System.out.print("The equality result of the two Movie beans : ");
        System.out.println(movie1 == movie2);

        //printing the equality result of the two beans created taking scope as prototype
        Movie movie3 = context.getBean("movie2", Movie.class);
        System.out.print("The equality result of the two Movie beans after using scope as prototype : ");
        System.out.println(movie1 == movie3);

        //movie bean having two name values and displaying the two name value separately using each name value
        Movie movie4 = context.getBean("movieA", Movie.class);
        movie4.display();

        Movie movie5 = context.getBean("movieB", Movie.class);
        movie5.display();

    }
}
