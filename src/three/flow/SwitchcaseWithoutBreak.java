package three.flow;

import javax.swing.*;
import java.util.ArrayList;

public class SwitchcaseWithoutBreak {
    public static void main(String[] args) {
        String brojDanaText = JOptionPane.showInputDialog("Unesi broj dana: ");
        int brojDana = Integer.parseInt(brojDanaText);
        ArrayList<String> dinamickiNiz = new ArrayList<String>();
        switch (brojDana) {
            case 1:
                dinamickiNiz.add("Monday");
            case 2:
                dinamickiNiz.add("Tuesday");
            case 3:
                dinamickiNiz.add("Wednesday");
            case 4:
                dinamickiNiz.add("Thursday");
            case 5:
                dinamickiNiz.add("Friday");
            case 6:
                dinamickiNiz.add("Saturday");
            case 7:
                dinamickiNiz.add("Sunday");
                break;
            default:
                JOptionPane.showMessageDialog(null, "Čestitam mama");
        }
        dinamickiNiz.forEach(System.out::println);

    }
}
