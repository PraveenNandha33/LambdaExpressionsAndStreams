package org.PreDefinedFunctionalInterfaces;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;

public class FunctionInterface {

    public static void main(String [] args) {
        Scanner sc = new Scanner(System.in);
        List<Employee> employeeList = new ArrayList<>();

        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            employeeList.add(new Employee(sc.next(), sc.nextInt(), sc.nextInt()));
        }
        Function<Integer,Integer> fi= i->(i/100)*10;

        //Calculating 10% of employee salary

        for(Employee e:employeeList)
        {
            System.out.println("Bonus is"+fi.apply(e.employeeSalary)+" for "+e.employeeName);
        }

    }
}
