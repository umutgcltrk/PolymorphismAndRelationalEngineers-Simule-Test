package com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief;

import com.company.PolymorphismAndRelationalEngineerApp.Abstract.ChiefEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.ComputerEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects.ProjectForComputerEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects.ProjectForMachineEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects.Projects;

public class ChiefComputerEngineer implements ChiefEngineer {
    private int chiefId;
    private String chiefName;
    private int year;
    private static final int BASE_SALARY = 18_000;
    public ComputerEngineer computerEngineer;
    public ProjectForComputerEngineer[] projects;

    public ChiefComputerEngineer(int chiefId,String chiefName,int year)
    {
        this.chiefId = chiefId;
        this.chiefName = chiefName;
        this.year = year;
    }

    @Override
    public void doProject(Projects projects) {
        System.out.println("Computer Chieff doing project "+projects.getProjectName());
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
        System.out.println("Computer Cheff is Working ...!");
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

    public ComputerEngineer getComputerEngineer() {
        return computerEngineer;
    }

    public void setComputerEngineer(ComputerEngineer computerEngineer) {
        this.computerEngineer = computerEngineer;
    }


}
