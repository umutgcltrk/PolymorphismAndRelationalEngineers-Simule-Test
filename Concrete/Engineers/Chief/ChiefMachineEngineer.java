package com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief;

import com.company.PolymorphismAndRelationalEngineerApp.Abstract.ChiefEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects.ProjectForMachineEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects.Projects;
import com.company.engineersApp.MachineEngineer;

public class ChiefMachineEngineer implements ChiefEngineer {
    private int chiefId;
    private String chiefName;
    private int year;
    private static final int BASE_SALARY = 12_000;
    public MachineEngineer machineEngineer;
    public ProjectForMachineEngineer[] projects;

    public ChiefMachineEngineer(int chiefId,String chiefName,int year)
    {
        this.chiefId = chiefId;
        this.chiefName = chiefName;
        this.year = year;
    }

    @Override
    public void doProject(Projects projects) {
        System.out.println("Industry Chieff doing project "+projects.getProjectName());
    }

    @Override
    public void manageProject(Projects projects) {
        System.out.println("Managed projects :" + projects.getProjectName());
    }

    @Override
    public void checkProject(Projects projects) {
        System.out.println("Checked this projects :"+projects.getProjectName());
    }

    @Override
    public void work() {
        System.out.println("Machine Cheff is Working ...!");
    }

    @Override
    public double calculateSalary() {
        double salary = BASE_SALARY * year;
        return salary;
    }

    @Override
    public String getName() {
        return chiefName;
    }

    public int getChiefId() {
        return chiefId;
    }

    public void setChiefId(int chiefId) {
        this.chiefId = chiefId;
    }

    public String getChiefName() {
        return chiefName;
    }

    public void setChiefName(String chiefName) {
        this.chiefName = chiefName;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public MachineEngineer getMachineEngineer() {
        return machineEngineer;
    }

    public void setMachineEngineer(MachineEngineer machineEngineer) {
        this.machineEngineer = machineEngineer;
    }


}
