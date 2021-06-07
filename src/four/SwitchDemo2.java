package four;

import javax.swing.*;

public class SwitchDemo2 {
    public static void main(String[] args) {
        String redBrojMjesecaText = JOptionPane.showInputDialog("Unesi redni broj mjeseca");
        int redBrojMjesec = Integer.parseInt(redBrojMjesecaText);
        String brojGodineText = JOptionPane.showInputDialog("Unesi broj godine: ");
        int brojGodine = Integer.parseInt(brojGodineText);
        int brojDanaUMjesecu = 0;
        switch (redBrojMjesec) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                brojDanaUMjesecu = 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                brojDanaUMjesecu = 30;
                break;
            case 2:
                boolean condition1 = brojGodine % 4 == 0 && brojGodine % 100 != 0;
                boolean condition2 = brojGodine % 400 == 0;
                boolean prestupna = condition1 || condition2;
                if (prestupna) {
                    brojDanaUMjesecu = 29;
                } else {
                    brojDanaUMjesecu = 28;
                }
                break;
            default:
                JOptionPane.showMessageDialog(null, "Godina ima 12 mjeseci");
                break;
        }

        String message = " Za uneseni mjesec '"+redBrojMjesec+"' i godinu '" +brojGodine+"' broj dana u mjesecu je '"+brojDanaUMjesecu+"'";
        JOptionPane.showMessageDialog(null, message);
    }
}
