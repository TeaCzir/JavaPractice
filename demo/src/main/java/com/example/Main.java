package com.example;

import java.util.Objects;
import java.util.Scanner;

public class Main {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        if (Objects.equals(name, "Oleg")) {
            System.out.println("Ура! Это же Сам Олег!");
        }
        else {
            System.out.println("Привет, Привет, " + name + "!");
        }
    }
}