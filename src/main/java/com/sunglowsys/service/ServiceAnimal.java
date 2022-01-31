package com.sunglowsys.service;

import com.sunglowsys.repository.Animal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ServiceAnimal {

    @Autowired
    @Qualifier("lionBean")
    private Animal animal;

    public void service(){
        animal.eat ();
        animal.run ();
    }
}
