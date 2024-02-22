package V_07;

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    /**
     * @param args
     */
    public static void main(String[] args) {

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        if (name == "Vyacheslav") {
            name = "Vyacheslav";
            System.out.println("Ура! Это же Сам " + name + "!");
            System.out.println("Здравствуйте Вячеслав Владимирович!");
            if (name != "Vyacheslav") {
                System.out.println("Привет, Привет, " + name + "!");
                return;
            }
            return;
        }

        // if (name == "Vyacheslav"){
        // System.out.print("Введите Ваше имя: ");
        // String name1 = scanner.nextLine();
        // System.out.println("Ура! Это же Сам " + name1 + "!");
        // System.out.println("Здравствуйте Вячеслав Владимирович!");
        // }
        // if (name != "Vyacheslav") {
        // System.out.println("Привет, Привет, " + name + "!");
        // return;

        // }

    }
}
