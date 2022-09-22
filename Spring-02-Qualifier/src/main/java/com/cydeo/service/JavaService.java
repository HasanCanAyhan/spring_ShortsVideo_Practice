package com.cydeo.service;

import com.cydeo.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;


//@Scope("prototype")
@Lazy
@Component
public class JavaService {

    private final ExtraSessions officeHours;
    private final ExtraSessions mentoringHours;
    private final JavaRepository javaRepository;


                                //@Qualifier("mentoringHoursService") : default

    public JavaService(@Qualifier("Office") ExtraSessions officeHours, @Qualifier("Mentor") ExtraSessions mentoringHours, JavaRepository javaRepository) {
        this.officeHours = officeHours;
        this.mentoringHours = mentoringHours;
        this.javaRepository = javaRepository;
        System.out.println("Eager Test");
    }





    public void getTeachingHours(){
        System.out.println("Weekly Java Hours: " + (javaRepository.returnHours()+officeHours.getHours() + mentoringHours.getHours()));
    }

}
