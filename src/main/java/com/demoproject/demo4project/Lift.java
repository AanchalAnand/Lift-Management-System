package com.demoproject.demo4project;

import java.util.List;

public class Lift {
    private int liftno;
    int capacityinweight;
    private int capacityinperson;

    public Lift() {
    }

    public Lift(int liftno, int capacityinweight, int capacityinperson) {
        this.liftno = liftno;
        this.capacityinweight = capacityinweight;
        this.capacityinperson = capacityinperson;
    }

    public int getLiftno() {
        return liftno;
    }

    public void setLiftno(int liftno) {
        this.liftno = liftno;
    }

    public int getCapacityinweight() {
        return capacityinweight;
    }

    public void setCapacityinweight(int capacityinweight) {
        this.capacityinweight = capacityinweight;
    }

    public int getCapacityinperson() {
        return capacityinperson;
    }

    public void setCapacityinperson(int capacityinperson) {
        this.capacityinperson = capacityinperson;
    }
}
