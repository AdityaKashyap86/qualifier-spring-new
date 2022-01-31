package com.sunglowsys.test;

import com.sunglowsys.service.ServiceAnimal;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestAnimal {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext ();

        context.scan ("com.sunglowsys.repository");
        context.scan ("com.sunglowsys.service");
        context.refresh ();

        ServiceAnimal animal= context.getBean (ServiceAnimal.class);
        animal.service ();

        context.close ();
    }
}
