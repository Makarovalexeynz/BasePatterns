package org.example.structural.decorator;

public class SeniorJavaDeveloper extends DeveloperDecorator{
    public SeniorJavaDeveloper(Developer developer) {
        super(developer);
    }

    public String makeCodeReview(){
        return "Make Codereview";
    }

    @Override
    public String makeJob(){
        return super.makeJob()+makeCodeReview();
    }
}
