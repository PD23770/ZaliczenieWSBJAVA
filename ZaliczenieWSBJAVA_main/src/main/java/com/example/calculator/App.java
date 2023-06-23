package com.example.calculator;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


import java.util.Scanner;

public class App {
    private static final Logger logger = LogManager.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Prosty Kalkulator");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Podaj pierwszą liczbę:");
        double liczba1 = scanner.nextDouble();

        System.out.println("Podaj drugą liczbę:");
        double liczba2 = scanner.nextDouble();

        System.out.println("Wybierz operację:");
        System.out.println("1. Dodawanie");
        System.out.println("2. Odejmowanie");
        System.out.println("3. Mnożenie");

        int wybor = scanner.nextInt();

        double wynik;

        switch (wybor) {
            case 1:
                wynik = Calculator.dodaj(liczba1, liczba2);
                logger.info("Wynik dodawania: " + wynik);
                break;
            case 2:
                wynik = Calculator.odejmij(liczba1, liczba2);
                logger.info("Wynik odejmowania: " + wynik);
                break;
            case 3:
                wynik = Calculator.pomnoz(liczba1, liczba2);
                logger.info("Wynik mnożenia: " + wynik);
                break;
            default:
                logger.error("Nieprawidłowy wybór operacji");
                return;
        }
    }
}
