package com.sunglowsys.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("goatBean")
public class Goat implements Animal {
    @Override
    public void eat() {
        System.out.println ("got eating grass");
    }

    @Override
    public void run() {
        System.out.println ("goat is running slowley");
    }
}
