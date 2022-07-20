package com.company.PolymorphismAndRelationalEngineerApp.Services;


import com.company.PolymorphismAndRelationalEngineerApp.Abstract.Engineer;

public class PayrollOffice {
    public void paySalary(Engineer engineer)
    {
        double salary = engineer.calculateSalary();
        System.out.println("Paying a salary of " + engineer.getName()+ " ,"+ salary );
    }
    public double paySalaryWithIncreasedSalary(Engineer engineer,int raiseRate)
    {
        var salary = engineer.calculateSalary();
        return (salary / 100) * raiseRate+salary;
    }
}
