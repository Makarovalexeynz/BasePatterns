package org.example.creational.AbstractFactory.banking;

import org.example.creational.AbstractFactory.ProjectManager;

public class BankingPM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("Banking PM manage Banking Project...");
    }
}
