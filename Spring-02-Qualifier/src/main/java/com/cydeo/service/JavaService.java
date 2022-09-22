package com.cydeo.service;

import com.cydeo.repository.JavaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

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
    }





    public void getTeachingHours(){
        System.out.println("Weekly Java Hours: " + (javaRepository.returnHours()+officeHours.getHours() + mentoringHours.getHours()));
    }

}
