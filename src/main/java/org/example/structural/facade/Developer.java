package org.example.structural.facade;

public class Developer {
    public void doJibBeforeDeadline(BugTracker bugTracker){
        if(bugTracker.isActiveSprint()){
            System.out.println("Developer is solving problem...");
        }else {
            System.out.println("Developer is reading Habrahabr...");
        }
    }
}
