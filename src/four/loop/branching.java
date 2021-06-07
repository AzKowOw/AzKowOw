package four.loop;

import javax.swing.*;

public class branching {
    public static void main(String[] args) {
        int[] brojevi = {23, 13, 34, 5656, 12, 45, 67, 890};
        String brojText = JOptionPane.showInputDialog("Unesi broj i okušaj sreću");
        int uneseniBroj = Integer.parseInt(brojText);
        boolean postoji = false;
        for(int broj: brojevi) {
            if(uneseniBroj == broj) {
                postoji = true;
                break;
            }
        }
        String poruka = postoji ? "Igre na sreću jesu za tebe jer si sretan":
                "Igre na sreću su prevara bjelosvjetska";
        JOptionPane.showMessageDialog(null, poruka);
    }
}
