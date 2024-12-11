/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package swing1;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.WindowConstants;

/**
 *
 * @author EKLOU Dodji
 */
public class Swing1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        JFrame f = new JFrame("Fenêtre 1");
        JFrame f1 = new JFrame("Fenêtre 2");
        f1.setSize(500,500);
        f.setSize(400, 400);
        f1.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f1.setVisible(true);
        f.setVisible(true);
        
        int response = JOptionPane.showConfirmDialog(f1, "Arrêter l'application ");
        if(response == JOptionPane.YES_OPTION){
            f.dispose();
            f1.dispose();
        }
    }
    
}
