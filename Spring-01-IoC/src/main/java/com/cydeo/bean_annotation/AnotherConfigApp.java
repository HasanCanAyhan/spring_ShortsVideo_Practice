package com.cydeo.bean_annotation;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AnotherConfigApp {

    @Bean
    String str(){
        return "Spring Short Videos";
    }

    @Bean
    Integer integer(){
        return 100;
    }


}
