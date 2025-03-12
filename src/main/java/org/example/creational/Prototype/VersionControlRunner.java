package org.example.creational.Prototype;

public class VersionControlRunner {
    public static void main(String[] args) {
        Project master = new Project(1,"SuperProject", "SourceCode");
        System.out.println(master);

        ProjectFactory projectFactory = new ProjectFactory(master);

        Project masterClone = projectFactory.cloneproject();

        System.out.println(masterClone);
    }

}
