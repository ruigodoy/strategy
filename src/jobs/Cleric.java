package jobs;

import service.Job;


public class Cleric implements Job {

    @Override
    public Integer getMaxHP() {

        return 500;
    }

    @Override
    public String getJobName() {
        return "Cleric";
    }
}
