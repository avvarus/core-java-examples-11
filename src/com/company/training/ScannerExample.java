package com.company.training;

import java.util.Scanner;

public class ScannerExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a text value !!");

        String textValue = scanner.nextLine();
        String second = scanner.next();
        System.out.println("Entered Text value is " + textValue + " - " + second);

    }
}
