package com.company.PolymorphismAndRelationalEngineerApp.Abstract;

import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects.Projects;

public interface ChiefEngineer extends Engineer {
    void doProject(Projects projects);
    void manageProject(Projects projects);
    void checkProject(Projects projects);
}
