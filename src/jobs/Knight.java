package jobs;

import service.Job;


public class Knight implements Job {

    @Override
    public Integer getMaxHP() {

        return 1500;
    }

    @Override
    public String getJobName() {
        return "Knight";
    }
}
