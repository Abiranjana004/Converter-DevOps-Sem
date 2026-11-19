package org.example;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        double cel, fah;
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Temperature in Degree Celsius: ");

        cel=sc.nextDouble();
        fah=(cel *(9.0/5.0))+32;

        System.out.println("Fahrenheit Equivalent: "+ fah);
    }
}