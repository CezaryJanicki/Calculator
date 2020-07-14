package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.*;

public class Calculator {

    public int add(int a, int b) throws IOException {
        return a + b;
    }
    public int subtract(int a, intgit  b) throws IOException {
        return a - b;
    }

    public static void main(String args[]) throws IOException {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Witaj w kalkulatorze dodawania i odejmowania. Wybierz co robimy: \n 1 - dodajemy. \n 2 - odejmujemy.");
        int choice;
        System.out.println("Podaj twoj wybor: ");
        choice = Integer.parseInt(in.readLine());
        Calculator calculator = new Calculator();
        switch (choice) {
            case 1:
                System.out.println("Prosze podaj pierwsza liczbe: ");
                int a = Integer.parseInt(in.readLine());
                System.out.println("Prosze podaj druga liczbe: ");
                int b = Integer.parseInt(in.readLine());
                System.out.println("Pierwsza liczba: " + a + " plus druga liczba: " + b + " wynosi " + calculator.add(a, b) + ".");
                break;
            case 2:
                System.out.println("Prosze podaj pierwsza liczbe: ");
                a = Integer.parseInt(in.readLine());
                System.out.println("Prosze podaj druga liczbe: ");
                b = Integer.parseInt(in.readLine());
                System.out.println("Pierwsza liczba: " + a + " minus druga liczba: " + b + " wynosi " + calculator.subtract(a, b)+ ".");
                break;
            default:
                System.out.println("Prosze podaj 1 lub 2.");
        }
    }
}
