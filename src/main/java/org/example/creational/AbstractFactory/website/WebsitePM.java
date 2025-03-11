package org.example.creational.AbstractFactory.website;

import org.example.creational.AbstractFactory.ProjectManager;

public class WebsitePM implements ProjectManager {
    @Override
    public void manageProject() {
        System.out.println("PM manage website...");
    }
}
