package org.example.creational.AbstractFactory.banking;

import org.example.creational.AbstractFactory.Developer;

public class JavaDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("write JavaCode...");
    }
}
