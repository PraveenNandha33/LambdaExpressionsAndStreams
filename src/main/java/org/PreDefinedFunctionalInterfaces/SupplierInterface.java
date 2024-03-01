package org.PreDefinedFunctionalInterfaces;

import java.util.Date;
import java.util.Scanner;
import java.util.function.Supplier;

public class SupplierInterface {

    public static void main(String [] args)
    {
        Supplier<Date> sr=()->new Date();
        System.out.println(sr.get());
    }
}
