package org.example.structural.proxy;

public class ProjectRunner {
    public static void main(String[] args) {
        Project project = new ProxyProject("Ссылка");

        project.run();
    }
}
