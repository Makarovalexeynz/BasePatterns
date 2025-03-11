package org.example.creational.AbstractFactory;

import org.example.creational.AbstractFactory.website.WebsiteTeamFactory;

public class WebsiteProject {
    public static void main(String[] args) {
        ProjectTeamFactory projectTeamFactory = new WebsiteTeamFactory();
        Developer developer = projectTeamFactory.getDeveloper();
        Tester tester = projectTeamFactory.getTester();
        ProjectManager projectManager = projectTeamFactory.getProjectManager();

        System.out.println("Creating website");
        developer.writeCode();
        tester.testCode();
        projectManager.manageProject();
    }
}
