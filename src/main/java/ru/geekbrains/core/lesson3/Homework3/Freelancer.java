package ru.geekbrains.core.lesson3.Homework3;

public class Freelancer extends BaseWorker {

    private int hourRate;
    private int workHours;

    public Freelancer(int workHours, int hourRate) {
        this.workHours = workHours;
        this.hourRate = hourRate;
    }


    public int getWorkHours() {
        return workHours;
    }

    public int getHourRate() {
        return hourRate;
    }
}
