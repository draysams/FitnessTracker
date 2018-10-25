package com.draysams.model;

import org.hibernate.validator.constraints.Range;

public class Goal {
    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    @Range(min = 1, max = 120)
    private int minutes;
}
