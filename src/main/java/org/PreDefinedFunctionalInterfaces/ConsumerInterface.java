package org.PreDefinedFunctionalInterfaces;

import javafx.scene.Scene;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Consumer;

public class ConsumerInterface {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);
        List<Employee> employeeList=new ArrayList<>();

        int n=sc.nextInt();
        for(int i=0;i<n;i++)
        {
            employeeList.add(new Employee(sc.next(),sc.nextInt(), sc.nextInt()));
        }
        Consumer<Employee> ci=(e)->System.out.println(e.employeeName+" "+e.employeeAge+" "+e.employeeSalary);
        for(Employee e:employeeList)
        {
            ci.accept(e);
        }
    }
}
