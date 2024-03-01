package org.PreDefinedFunctionalInterfaces;

public class LambdaExpressionBasics {
    interface Flight{
        public abstract void bookFlight();
    }
    interface calculateSquare{
        public abstract int squareTheNum(int n);
    }

    public static void main(String[] args)
    {
        Flight f=()->{System.out.println("Booked the flight successfully");};
        f.bookFlight();
        calculateSquare c=n->n*n;
        int squareVal=c.squareTheNum(5);
        System.out.println("square the num"+squareVal);
    }
}
