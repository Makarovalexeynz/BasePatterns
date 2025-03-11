package org.example.creational.AbstractFactory.website;

import org.example.creational.AbstractFactory.Developer;

public class PhpDeveloper implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PhpDev write PHPCode");
    }
}
