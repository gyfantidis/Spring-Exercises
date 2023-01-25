package main.java.net.yfantidis.Exercise3.domain;

import main.java.net.yfantidis.Exercise3.domain.Coach;

public class TrackCoach implements Coach {
    @Override
    public String getDailyWorkout() {
        return "Run a hard 5 km";
    }
}
