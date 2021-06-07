package four.loop;

import java.util.Arrays;

public class ArrayLoopDemo {
    public static void main(String[] args) {
        String[] imena = {"Adi", "Almir", "Nevena", "Amer", "Harun", "Jasmin", "Damir",};
        int i = 0;
        /*while(i< imena.length) {
            String ime = imena[i];
            System.out.println(ime);
            i++;
        }*/

        for(String name: imena) {
            System.out.println(name);
        }
    }
}
