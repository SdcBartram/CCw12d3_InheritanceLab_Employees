package com.bartram.staff;

public abstract class Employee {
    private String name;
    private String nationalInsuranceNumber;
    private double salary;

    public Employee(String name, String nationalInsuranceNumber, double salary){
        this.name = name;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
        this.salary = salary;
    }

    public String getName(){
        return name;
    }

    public String getNationalInsuranceNumber(){
        return nationalInsuranceNumber;
    }

    public double getSalary(){
        return salary;
    }

    public void raiseSalary(double increase){
        salary += increase; // increases salary by amount that is submitted as the argument
    }


    public double payBonus(){
        return salary * 0.01; //returns 1% of salary
    }
}
