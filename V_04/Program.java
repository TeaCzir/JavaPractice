package V_04;

public class Program {
    public static void main(String[] args) {
        System.out.println(Integer.MAX_VALUE); // 2147483647
        System.out.println(Integer.MIN_VALUE); // -2147483648
        double a = 789;
        System.out.println(a);
        System.out.println(a++);
        System.out.println(a);
        System.out.println(++a);
        double b = 5523;
        double c = b/a;
        double d = a--;
        double t = --a;
        double m = --a - a--;
        System.out.println(b/a);
        System.out.println(c);
        System.out.println(d);
        System.out.println(t);
        System.out.println(m);

    }
}
