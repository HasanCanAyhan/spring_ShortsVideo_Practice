package com.cydeo;

import com.cydeo.config.ConfigApp;
import com.cydeo.model.Java;
import com.cydeo.service.JavaService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigApp.class);


        /*
        JavaService java1 = container.getBean(JavaService.class);
        JavaService java2 = container.getBean(JavaService.class);


        // add @Scope("prototype) inside JavaService -->> that means creating different object

        System.out.println(java1);
        System.out.println(java2);
        System.out.println(java1==java2);

         */

        // Eager _ vs_ Lazy
        // In the Singleton Concept
        // Eager is default , when we create container, all beans created
        // with @Lazy annotation , it will be created only , whenever we call the class


        JavaService java = container.getBean(JavaService.class);
        java.getTeachingHours();




    }

}
