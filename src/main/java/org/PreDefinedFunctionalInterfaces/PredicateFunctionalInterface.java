package org.PreDefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;


public class PredicateFunctionalInterface {
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        List<Employee> employeeList=new ArrayList<>();

        int n=sc.nextInt();
//        Employee e=new Employee("ABCD",12334,24);
        for(int i=0;i<n;i++)
        {
            employeeList.add(new Employee(sc.next(),sc.nextInt(), sc.nextInt()));
        }
        Predicate<Employee> pr=e->(e.employeeSalary>30000 && e.employeeAge>30);
        for(Employee el:employeeList){
            if(pr.test(el)){
                System.out.println(el.employeeName);
            }
        }

        //Joining Predicate

        Predicate<Employee>  pr2=e->(e.employeeSalary>40000);
        for(Employee el:employeeList){
            if(pr.and(pr2).test(el)){
                System.out.println("Employee having salary more than 40k");
                System.out.println(el.employeeName);
            }
            if(pr.or(pr2).test(el)); //or condition
            {
                System.out.println("Employee having salary more than 30k and 40k");
                System.out.println(el.employeeName);
            }
            if(pr.negate().test(el)){
                //negation
                System.out.println("Employee having less salary than 30 k or age <-30");
                System.out.println(el.employeeName);
            }
        }



    }
}
