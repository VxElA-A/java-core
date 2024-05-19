package ru.geekbrains.core.lesson3.Homework3;

public class Worker extends BaseWorker {

    private int monthlyRate;

    public Worker(int monthlyRate) {
        this.monthlyRate = monthlyRate;
    }

    public int getMonthlyRate() {
        return monthlyRate;
    }

}
