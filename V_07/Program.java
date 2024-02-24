package V_07;
import java.util.Objects;
import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {

        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        if (Objects.equals(name, "Oleg")) {
            System.out.println("=========================");
            System.out.println("Ура! Это же Сам Олег Иванович!");
            System.out.println("Здравствуйте дорогой Олег Иванович! Проходите скорее.");
            System.out.println("=========================");
        }
        if (!Objects.equals(name, "Oleg")) {
            System.out.println("=========================");
            System.out.println("Привет, Привет, " + name + "!");
            System.out.printf("Проходите сюда пожалуйста, %S\n",name,"!");
            System.out.println("=========================");
        }
    }
}