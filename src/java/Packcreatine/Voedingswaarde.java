/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Packcreatine;

/**
 *
 * @author Pascal
 */
public class Voedingswaarde {
    int pot;
    double gram;
    String eigenschappen, naam;


public Voedingswaarde(double gram, int pot, String Eigenschappen, String naam){
    this.gram = gram;
    this.eigenschappen = Eigenschappen; 
    this.pot = pot;
    this.naam = naam;
    }
    
    public double getGram(){
        return gram;
    }
    
    public int getPot(){
        return pot;
    }
    
    public String getEigenschappen(){
        return eigenschappen;
    }
    
    public String getNaam(){
        return naam;
    }
}