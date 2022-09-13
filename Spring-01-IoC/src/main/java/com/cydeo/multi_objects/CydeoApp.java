package com.cydeo.multi_objects;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {

    public static void main(String[] args) {

        ApplicationContext container = new AnnotationConfigApplicationContext(CarConfig.class);


        //Car car1 = container.getBean("c1",Car.class); // 1.way

        Car car1 = container.getBean(Car.class); // 2.way @Primary

        System.out.println(car1.getMake());



    }





}
