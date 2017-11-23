import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("1st num: ");
        float x = in.nextFloat();
        System.out.println("2nd num: ");
        float y = in.nextFloat();
        System.out.println("Operator: ");
        String op = in.next();

        if (op.equals("+")){
            System.out.println(x + op + y + " = " + (x+y));
        } else if (op.equals("-")) {
            System.out.println(x + op + y + " = " + (x-y));
        } else if (op.equals("*")) {
            System.out.println(x + op + y + " = " + (x*y));
        } else if (op.equals("/")) {
            System.out.println(x + op + y + " = " + (x/y));

        }

    }

}
