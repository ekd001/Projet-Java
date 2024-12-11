/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package swing2;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 *
 * @author EKLOU Dodji
 */
public class MaFenetre_1 extends JFrame{
    private JButton bAjouter;
    private JButton bModifier;
    
    public MaFenetre_1(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(500, 500);
        
        bAjouter = new JButton();
        bAjouter.setText("Ajouter");
        bAjouter.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                actionBoutonAjouter(e);
            }

            private void actionBoutonAjouter(ActionEvent e) {
                System.out.println("Ajouter");
            }
    });
        bModifier = new JButton();
        bModifier.setText("Modifier");
        // Avec les expression lambda
        bModifier.addActionListener((event)->{actionBoutonModifier(event);});
        
        JPanel cp = (JPanel) this.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(bAjouter);
        cp.add(bModifier);
        
        this.setVisible(true);
        
    }

    private void actionBoutonModifier(ActionEvent event) {
        System.out.println("Modifier");
    }
    
    
    //Adapteur fournit une implementation à chacune des interfaces
    //L'expression lambda ne marche que si l'interface possède une seule méthode
    

}
