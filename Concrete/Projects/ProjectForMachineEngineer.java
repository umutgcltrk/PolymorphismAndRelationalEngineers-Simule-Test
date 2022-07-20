package com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects;

import com.company.PolymorphismAndRelationalEngineerApp.Abstract.Project;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief.ChiefComputerEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief.ChiefIndustryEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief.ChiefMachineEngineer;

public class ProjectForMachineEngineer implements Project {
    private int id;
    private String projectName;
    private String description;
    private String projectDate;
    public ChiefMachineEngineer chieffMachineEngineer;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getProjectDate() {
        return projectDate;
    }

    public void setProjectDate(String projectDate) {
        this.projectDate = projectDate;
    }

    @Override
    public void createProject(int id, String projectName, String description, String projectDate) {
        this.id = id;
        this.projectName = projectName;
        this.description = description;
        this.projectDate = projectDate;
        System.out.println("You created the project !");
        System.out.println("Project ID :"+id+ "\n"
                +"Project Name :" +projectName+ "\n"
                +"Project Description :"+description+ "\n"
                +"Project Create Date :"+projectDate + "\n"
                +"Project Manager :" +chieffMachineEngineer.getChiefName());
    }
}
