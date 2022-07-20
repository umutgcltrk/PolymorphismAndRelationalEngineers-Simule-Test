package com.company.PolymorphismAndRelationalEngineerApp;

import com.company.PolymorphismAndRelationalEngineerApp.Abstract.ChiefEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Abstract.Engineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief.ChiefComputerEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief.ChiefIndustryEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.Chief.ChiefMachineEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.ComputerEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.IndustryEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Engineers.MachineEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects.ProjectForComputerEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects.ProjectForIndustryEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Concrete.Projects.ProjectForMachineEngineer;
import com.company.PolymorphismAndRelationalEngineerApp.Services.PayrollOffice;

import java.util.Date;

public class Test {
    public static void main(String[] args) {
        Engineer computerEngineer1 = new ComputerEngineer(102,"Mahmut Akın",2);
        Engineer industryEngineer1 = new IndustryEngineer(103,"Yavuz Seçkin",1);
        Engineer machineEngineer1 = new MachineEngineer(104,"Tahir Ateş",4);
        System.out.println("---------------------");
        computerEngineer1.work();
        industryEngineer1.work();
        machineEngineer1.work();
        System.out.println("---------------------");
        System.out.println(computerEngineer1.getName()+" is Salary :"+computerEngineer1.calculateSalary());
        System.out.println(computerEngineer1.getName()+" is Salary :"+industryEngineer1.calculateSalary());
        System.out.println(computerEngineer1.getName()+" is Salary :"+machineEngineer1.calculateSalary());
        System.out.println("---------------------");
        PayrollOffice payrollOffice = new PayrollOffice();
        payrollOffice.paySalary(computerEngineer1);
        payrollOffice.paySalary(industryEngineer1);
        payrollOffice.paySalary(machineEngineer1);
        System.out.println("---------------------");
        System.out.println("---------------------");

        ChiefEngineer chiefComputerEngineer = new ChiefComputerEngineer(145,"Hayri Yılmaz",3);
        ChiefEngineer chiefIndustryEngineer = new ChiefIndustryEngineer(132,"Betül Işık",5);
        ChiefEngineer chiefMachineEngineer = new ChiefMachineEngineer(124,"Ayhan Dağ",1);

        chiefComputerEngineer.work();
        chiefIndustryEngineer.work();
        chiefMachineEngineer.work();
        System.out.println("---------------------");
        System.out.println(chiefComputerEngineer.getName()+" is Salary :"+chiefComputerEngineer.calculateSalary());
        System.out.println(chiefIndustryEngineer.getName()+" is Salary :"+chiefIndustryEngineer.calculateSalary());
        System.out.println(chiefMachineEngineer.getName()+" is Salary :"+chiefMachineEngineer.calculateSalary());
        System.out.println("---------------------");
        PayrollOffice payrollOffice2 = new PayrollOffice();
        payrollOffice2.paySalary(chiefComputerEngineer);
        payrollOffice2.paySalary(chiefIndustryEngineer);
        payrollOffice2.paySalary(chiefMachineEngineer);

        System.out.println("---------------------");

        //
        //
        //

        ChiefComputerEngineer chiefComputerEngineer2 = new ChiefComputerEngineer(167,"Hasan Mutlu",3);
        ChiefIndustryEngineer chiefIndustryEngineer2 = new ChiefIndustryEngineer(175,"Ayşe Demir",4);
        ChiefMachineEngineer chiefMachineEngineer2 = new ChiefMachineEngineer(186,"Yakup Usta",1);

        ProjectForComputerEngineer firstProjectForComputerEngineer = new ProjectForComputerEngineer();
        ProjectForIndustryEngineer firstProjectForIndustryEngineer = new ProjectForIndustryEngineer();
        ProjectForMachineEngineer firstProjectForMachineEngineer = new ProjectForMachineEngineer();


        chiefComputerEngineer2.projects = new ProjectForComputerEngineer[1];
        firstProjectForComputerEngineer.chieffComputerEngineer = chiefComputerEngineer2;
        chiefComputerEngineer2.projects[0] = firstProjectForComputerEngineer;
        firstProjectForComputerEngineer.createProject(325,"Yapay Zeka ile Nesne Tespiti","Python ile nesne tespiti yapan proje...","20/02/2020");
        System.out.println("********************");
        chiefIndustryEngineer2.projects = new ProjectForIndustryEngineer[1];
        firstProjectForIndustryEngineer.chieffIndustryEngineer = chiefIndustryEngineer2;
        chiefIndustryEngineer2.projects[0] = firstProjectForIndustryEngineer;
        firstProjectForIndustryEngineer.createProject(456,"Endüstriyel Atıkları Dönüştürme ","Fabrikaların attığı endüstriyel...","05/03/2019");
        System.out.println("********************");
        chiefMachineEngineer2.projects = new ProjectForMachineEngineer[1];
        firstProjectForMachineEngineer.chieffMachineEngineer = chiefMachineEngineer2;
        chiefMachineEngineer2.projects[0] = firstProjectForMachineEngineer;
        firstProjectForMachineEngineer.createProject(785,"Mikro Civata Çizimi","Mikro civata ihtiyacını karşılamak için...","15/09/2021");
        System.out.println("********************");

        System.out.println("Şeflerin Projeleri :"+"\n"
                       +chiefComputerEngineer2.getChiefName()+", Bilgisayar Şefi :"+chiefComputerEngineer2.projects[0].getProjectName()+"\n"
                       +chiefIndustryEngineer2.getChiefName()+", Endüstri Şefi :"+chiefIndustryEngineer2.projects[0].getProjectName()+"\n"
                       +chiefMachineEngineer2.getChiefName()+ ", Makina Şefi :"+chiefMachineEngineer2.projects[0].getProjectName());

        
        




















    }
}
