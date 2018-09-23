package com.practice3.entity.job;

public class Teacher implements IJob {
    double salary;
    int timeToWork;
    int numberExp;

    public int getNumberExp() {
        return numberExp;
    }

    public void setNumberExp(int numberExp) {
        this.numberExp = numberExp;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public int getTimeToWork() {
        return timeToWork;
    }

    public void setTimeToWork(int timeToWork) {
        this.timeToWork = timeToWork;
    }

    @Override
    public void DoWork() {
        System.out.println("Teacher is teaching");
    }

    @Override
    public boolean HaveExp() {
        return numberExp > 0;
    }
}
