package org.sivapriya.arrays;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        String[] names = {"Tom", "Jerry", "Brad", "Siva", "Michel"};
        int[] numbers = {12345, 67890, 14325, 56783, 93567};
        for (int i=0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        System.out.println("Please Enter a name: ");
        Scanner scanner = new Scanner(System.in);
        String name = scanner.next();
        for (int i=0; i< names.length; i++) {
            if (name.equals(names[i])) {
                System.out.println("The mobile number is " + numbers[i]);
            }
        }
    }
}
