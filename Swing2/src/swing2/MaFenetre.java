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
public class MaFenetre extends JFrame implements ActionListener{
    private JButton bAjouter;
    private JButton bModifier;
    
    public MaFenetre(){
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        this.setSize(500, 500);
        
        bAjouter = new JButton();
        bAjouter.setText("Ajouter");
        bAjouter.addActionListener(this);
        bModifier = new JButton();
        bModifier.setText("Modifier");
        bModifier.addActionListener(this);
        
        JPanel cp = (JPanel) this.getContentPane();
        cp.setLayout(new FlowLayout());
        cp.add(bAjouter);
        cp.add(bModifier);
        
        this.setVisible(true);
        
    }
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == bAjouter){
            System.out.println("Ajouté");
        }else{
            System.out.println("Modifier");
        }
    }

}
