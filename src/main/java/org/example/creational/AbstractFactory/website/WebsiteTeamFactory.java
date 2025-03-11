package org.example.creational.AbstractFactory.website;

import org.example.creational.AbstractFactory.Developer;
import org.example.creational.AbstractFactory.ProjectManager;
import org.example.creational.AbstractFactory.ProjectTeamFactory;
import org.example.creational.AbstractFactory.Tester;

public class WebsiteTeamFactory implements ProjectTeamFactory {
    @Override
    public Developer getDeveloper() {
        return new PhpDeveloper();
    }

    @Override
    public Tester getTester() {
        return new ManualTester();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new WebsitePM();
    }
}
