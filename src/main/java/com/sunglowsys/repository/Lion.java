package com.sunglowsys.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("lionBean")
public class Lion implements Animal{
    @Override
    public void eat() {
        System.out.println ("lion eating meat");
    }

    @Override
    public void run() {
        System.out.println ("lion running fast");
    }
}
