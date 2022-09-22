package com.cydeo.service;

import org.springframework.stereotype.Component;

@Component
public class MentoringHoursService implements ExtraSessions{
    @Override
    public int getHours() {
        return 8;
    }
}
