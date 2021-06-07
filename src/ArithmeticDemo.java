import java.sql.SQLOutput;
import java.util.Scanner;

public class ArithmeticDemo {
    public static void main(String[] args) {
        System.out.println("Unesi prvi broj");
        int broj1 = new Scanner(System.in).nextInt();
        System.out.println("Unesi drugi broj");
        int broj2 = new Scanner(System.in).nextInt();
        int suma = broj1 + broj2;
        System.out.println("Suma = " + suma);
    }
}
