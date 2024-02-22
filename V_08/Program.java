package V_08;    
/*
* Дан массив двоичных чисел. Например: [1,1,0,1,1,1,1,0], вывести максимальное колличество
* подряд идущих элементов 1.
*/

import java.util.Scanner;

public class Program {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] Ar1 = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 0, 1, 1, 0, 1, 0, 0, 0, 1, 1, 1 };
        int[] Ar2 = { 1, 1, 0, 1, 1, 0, 1, 1, 1, 1, 0 };
        int[] Ar3 = { 1, 1, 0, 1 };
        int[] Ar4 = { 1, 1, 1, 1, 0, 1, 1, 1, 1, 1, 1, 1, 1, 0, 1, 1, 1, 1, 0, 1, 0, 1, 1 };
        System.err.println("=======МЕНЮ=========");
        System.err.println("1. Массив № 1.");
        System.err.println("2. Массив № 2.");
        System.err.println("3. Массив № 3.");
        System.err.println("4. Массив № 4.");
        System.err.println("=====================");
        System.err.print("Выберие номер массива: ");
        int vo = Integer.parseInt(scanner.nextLine());
        switch (vo) {
            case 1:
                System.out.printf("Максимальное единиц %d\n", maxArr(Ar1));
                break;
            case 2:
                System.out.printf("Максимальное единиц %d\n", maxArr(Ar2));
                break;
            case 3:
                System.out.printf("Максимальное единиц %d\n", maxArr(Ar3));
                break;
            case 4:
                System.out.printf("Максимальное единиц %d\n", maxArr(Ar4));
                break;
        }

    }

    static int maxArr(int[] endArry) {
        int max = 0;
        int count = 0;
        for (int e : endArry) {
            if (e == 1) {
                count++;
            } else {
                if (count > max) {
                    max = count;
                }
                count = 0;
            }

        }
        if (count > max) {
            max = count;
        }
        return max;
    }
}
