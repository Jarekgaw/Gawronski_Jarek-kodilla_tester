package com.kodilla.abstracts;

public abstract class Job {
    private int salary;
    private String responsibilities;
    public Job(int Salary, String responsibilities ) {
    this.salary = salary;
    this.responsibilities = responsibilities;
}
    public int getSalary() {
    return salary;
}
    public String getResponsibilities() {
        return responsibilities;
    }
    public void Responsibilities(){
        System.out.println("Responsibilities is:");
    }
    public void Salary(){
        System.out.println("Salary:" + salary);

    }
}
