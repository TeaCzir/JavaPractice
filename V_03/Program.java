package V_03;

public class Program {
    public static void main(String[] args) {
        String msg = "Hello World!!!";
        System.out.println(msg);
            var a = 123;
            System.out.println(a); // 123
            var d = 123.456;
            System.out.println(d); // 123.456

        System.out.println(getType(a)); // Integer
        System.out.println(getType(d)); // Double
        d = 1022;
        System.out.println(d);    // 1022 //d = "mistake"; //error: incompatible types: 
                                  //String cannot be converted to double
    }
       static String getType(Object o){
       return o.getClass().getSimpleName();
    }
}
