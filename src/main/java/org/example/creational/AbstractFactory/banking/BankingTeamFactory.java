package org.example.creational.AbstractFactory.banking;

import org.example.creational.AbstractFactory.Developer;
import org.example.creational.AbstractFactory.ProjectManager;
import org.example.creational.AbstractFactory.ProjectTeamFactory;
import org.example.creational.AbstractFactory.Tester;

public class BankingTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new BankingPM();
    }
}
