/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package montre;

import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.Timer;

/**
 *
 * @author EKLOU Dodji
 */
public class MontreUI extends JFrame{
    private JButton buton1;
    private JButton buton2;
    private JLabel tempsLabel;
    private Montre montre;
    
    public MontreUI(){
        this.montre = new Montre(this);
        
        this.setTitle("Montre");
        this.setSize(400, 400);
        this.setVisible(true);
        this.setDefaultCloseOperation(DISPOSE_ON_CLOSE);
        
        JPanel panel = (JPanel) this.getContentPane();
        panel.setLayout(new GridLayout(2,1));
        
        JPanel butonPanel = new JPanel();
        butonPanel.setLayout(new FlowLayout());
        
        this.buton1 = new JButton("Bouton1");
        this.buton2 = new JButton("Bouton2");
        this.tempsLabel = new JLabel(String.format("%02d",this.montre.getHeure())+":"+String.format("%02d",this.montre.getminute())+":"+String.format("%02d", this.montre.getSeconde()));
        this.tempsLabel.setFont(new Font("Arial", Font.PLAIN, 24));
        this.tempsLabel.setHorizontalAlignment(JLabel.CENTER);
        panel.add(this.tempsLabel);
        panel.add(butonPanel);
        butonPanel.add(this.buton1);
        butonPanel.add(this.buton2);
        
        
        
        Timer timer = new Timer(300, null); 
        timer.setRepeats(false); 
        timer.addActionListener(e -> {
            System.out.println("hello");
        });
        
        this.buton1.addMouseListener(new MouseAdapter(){

            @Override
            public void mousePressed(MouseEvent e) {

                    if (e.getButton() == MouseEvent.BUTTON1 && e.getClickCount() == 2) {
                        montre.getEtat().appuyer2xButon1();
                        System.out.println("gauche");
                } else if (e.getButton() == MouseEvent.BUTTON3) {
                        montre.getEtat().appuyerButon1();
                        System.out.println("droite");
                }
            }
         
        });
        
        this.buton2.addMouseListener(new MouseAdapter(){
            @Override
            public void mousePressed(MouseEvent e){
                montre.getEtat().appuyerButon2();
                System.out.println("b2");
            }
        });
    }
    
    public JButton getbouton1(){
        return this.buton1;
    }
    
    public JButton getbouton2(){
        return this.buton2;
    }
    
    public JLabel getTempsLabel(){
        return this.tempsLabel;
    }
    
    public void updateTempsHeure(){
        if(this.montre.getHeure() > 23){
            this.montre.setHeure(0);
            this.tempsLabel.setText(String.format("%02d",this.montre.getHeure())+":"+String.format("%02d",this.montre.getminute())+":"+String.format("%02d", this.montre.getSeconde()));
        }else{
            this.tempsLabel.setText(String.format("%02d",this.montre.getHeure())+":"+String.format("%02d",this.montre.getminute())+":"+String.format("%02d", this.montre.getSeconde()));
        }
        
    }
    
    public void updateTempsminute(){
        if(this.montre.getminute() > 59){
            this.montre.setMinute(0);
            this.montre.setHeure(this.montre.getHeure() + 1);
            this.updateTempsHeure();
            this.tempsLabel.setText(String.format("%02d",this.montre.getHeure())+":"+String.format("%02d",this.montre.getminute())+":"+String.format("%02d", this.montre.getSeconde()));
        }else{
            this.tempsLabel.setText(String.format("%02d",this.montre.getHeure())+":"+String.format("%02d",this.montre.getminute())+":"+String.format("%02d", this.montre.getSeconde()));
        }
        
    }
    
    public void updateTempsSeconde(){
        if(this.montre.getSeconde() > 59){
            this.montre.setSeconde(0);
            this.montre.setMinute(this.montre.getminute() + 1);
            this.updateTempsminute();
            this.tempsLabel.setText(String.format("%02d",this.montre.getHeure())+":"+String.format("%02d",this.montre.getminute())+":"+String.format("%02d", this.montre.getSeconde()));
        }else{
            this.tempsLabel.setText(String.format("%02d",this.montre.getHeure())+":"+String.format("%02d",this.montre.getminute())+":"+String.format("%02d", this.montre.getSeconde()));
        }
    }
}
