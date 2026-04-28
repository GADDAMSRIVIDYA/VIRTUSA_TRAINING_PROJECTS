package com.library.util;

import java.util.Scanner;

public class InputUtil {

    public static int getInt(Scanner scanner) {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (Exception e) {
                System.out.print("Invalid number, try again: ");
            }
        }
    }

   public static String getString(Scanner scanner) {
    while (true) {
        String input = scanner.nextLine();
        if (!input.trim().isEmpty()) {
            return input;
        }
        System.out.print("Input cannot be empty, try again: ");
    }
}
}