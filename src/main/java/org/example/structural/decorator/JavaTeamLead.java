package org.example.structural.decorator;

public class JavaTeamLead extends DeveloperDecorator{

    public JavaTeamLead(Developer developer) {
        super(developer);
    }

    public String sendWeekReport(){
        return "Send WeekReport";
    }

    @Override
    public String makeJob() {
        return super.makeJob()+sendWeekReport();
    }
}
