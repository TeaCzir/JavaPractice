package V_05;
import java.util.Scanner;
public class Program {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        
        System.out.print("Введите Ваше имя: ");
        String name = scanner.nextLine();

        System.out.println("Привет " + name + "!");
        
    }
}
