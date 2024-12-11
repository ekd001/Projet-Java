/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.nd1;

import java.io.IOException;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

/**
 *
 * @author EKLOU Dodji
 */
public class Nd1 {

    public static void main(String[] args) {
        try{
            DocumentBuilderFactory dbf =  DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document document = db.parse("C:\\Users\\EKLOU Dodji\\Downloads\\etudiants.xml");
            
            Element racine = document.getDocumentElement();
            System.out.println("Element racine : "+racine.getNodeName());
            NodeList enfants = racine.getChildNodes();
        
        }catch(ParserConfigurationException e){
            System.out.println("Impossible de crée le document : "+e.getMessage());
        }catch(IOException e){
            System.out.println("Impossible d'ouvrir le document : "+e.getMessage());
        }catch(SAXException e){
            System.out.println("Erreur de parsing : "+e.getMessage());
        }catch(IllegalArgumentException e){
            System.out.println("Erreur d'uri : "+e.getMessage());
        }
       
    }
}
