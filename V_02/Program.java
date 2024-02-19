package V_02;

public class Program {
    /**
     * @param args
     */
    public static void main(String[] args) {
        short age = 62;
        int salary = 802458907;
        System.out.println(age);
        System.out.println(salary);
        float e = 2.14f;
        double pr = 214.214;
        System.out.println(e);
        System.out.println(pr);
        char ch = '+';
        System.out.println(ch);
        ch = '1';
        System.out.println(Character.isDigit(ch));
        ch = 'f';
        System.out.println(Character.isDigit(ch));
        boolean t1 = 453 <= 798;
        System.out.println(t1);
        boolean t2 = 453 >= 798 || t1;
        System.out.println(t2);
        boolean t3 = t1 ^ t2;
        System.out.println(t3);


    }
}
