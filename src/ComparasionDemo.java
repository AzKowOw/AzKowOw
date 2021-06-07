import java.util.Scanner;

public class ComparasionDemo {
    public static void main(String[] args) {
        int broj1 = new Scanner(System.in).nextInt();
        int broj2 = new Scanner(System.in).nextInt();

        if (broj1 == broj2) {
            System.out.println("Ova dva broja su jednaka");
        }
    }
}
