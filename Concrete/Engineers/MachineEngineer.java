package com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers;

import com.company.PolymorphismAndRelationalEngineerApp.Abstract.Engineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief.ChiefComputerEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief.ChiefMachineEngineer;

public class MachineEngineer implements Engineer {
    private int engineerNo;
    private String engineerName;
    private int year;
    public ChiefMachineEngineer chieff;
    private static final int BASE_SALARY = 18000;
    public MachineEngineer(int engineerNo, String engineerName, int year)
    {
        System.out.println("Machine Engineer is Ready");
        this.engineerNo = engineerNo;
        this.engineerName = engineerName;
        this.year = year;
    }
    @Override
    public void work() {
        System.out.println("Machine Engineer is Working ...!");
    }

    @Override
    public double calculateSalary() {
        double salary = BASE_SALARY * year;
        return salary;
    }

    @Override
    public String getName() {
        return engineerName;
    }
}
