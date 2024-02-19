package V_06;
// Задание  В консоли запросить имя пользователя. В зависимости от текущего времени, вывести приветствие вида
// "Доброе утро, <Имя>!", время от 05:00 до 11:59; "Добрый день, <Имя>!", время от 12:00 до 17:59;
// "Добрый вечер, <Имя>!", время от 18:00 до 22:59; "Доброй ночи, <Имя>!", время от 23:00 до 4:59

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        Swecha();
    }

    static int Swecha(){
        System.out.print("Введите ваше имя: ");
        String name = scanner.nextLine();
        System.out.println("@@@@ МЕНЮ ВРЕМЕНИ @@@@");
        System.out.println("1. от 05:00 до 11:59");
        System.out.println("2. от от 12:00 до 17:59");
        System.out.println("3. от от 18:00 до 22:59");
        System.out.println("4. от от 23:00 до 4:59");
        System.out.println("========================");
 
        System.out.print("Укажите номер диапазона времени суток: ");
        int Time = Integer.parseInt(scanner.nextLine());
        switch (Time) {
            case 1:
            System.out.println();
            System.out.println("Доброе утро, " + name + "!");
            System.out.println("========================");
                break;
            case 2:
            System.out.println();
            System.out.println("Добрый день, " + name + "!");
            System.out.println("========================");
                break;
            case 3:
            System.out.println();
            System.out.println("Добрый вечер, " + name + "!");
            System.out.println("========================");
                break;
            case 4:
            System.out.println();
            System.out.println("Доброй ночи, " + name + "!");
            System.out.println("========================");
                break;
            default:
            System.out.println("Облом, " + name + "! Вы указали некорректный номер.\nЭто плохо. ");
            System.out.println();
            System.out.print("Начнем с начала: \n");
            System.out.println();
            Swecha();

        }
        return Time;
    }

}
