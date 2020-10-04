package service;

import jobs.Cleric;
import jobs.Knight;

public enum SelectJob {

    KNIGHT{
        @Override
        public Job getJob() {
            return new Knight();
        }
    },
    SEDEX {
        @Override
        public Job getJob() {
            return new Cleric();
        }
    };

    public abstract Job getJob();
}
