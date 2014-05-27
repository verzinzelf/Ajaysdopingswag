/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Packcreatine;

import java.util.ArrayList;

/**
 *
 * @author Pascal
 */
public class Creatine {
    String html="";
    String pagina="";
    String potjenaam="";
    
     private ArrayList<Voedingswaarde> array;
     
     public Creatine(){
         array = new ArrayList<Voedingswaarde>();
     }
     
    public void voegtoevoedingswaarde(){
        array.add(new Voedingswaarde( 0 , 0 , "Koolhydraten" , "potje1" ));
        array.add(new Voedingswaarde( 0 , 0 , "Caloriën" , "potje1" ));
        array.add(new Voedingswaarde( 0 , 0 , "Vezels", "potje1" ));
        array.add(new Voedingswaarde( 0 , 0 , "Zout" , "potje1" ));
        array.add(new Voedingswaarde( 0 , 0 , "Vetten" , "potje1" ));
        array.add(new Voedingswaarde( 1 , 1 , "Koolhydraten" , "potje2" ));
        array.add(new Voedingswaarde( 1.1 , 2 , "Koolhydraten" , "potje3" ));
    }
    
    
    public String maakPagina(){ 
        html += "<table><tr><td><div class=\"centreer\">Voedingswaarde</div></td><td><div id=\"centreer\">per 100 gram</div></td></tr></table>";
            for(Voedingswaarde voedingswaarde : array)
        { 
          html += "<table border=\"1\"><tr><td>" + voedingswaarde.getEigenschappen()+ "</td>"
               + "<td><center>" + voedingswaarde.getGram() + "</center></td></tr></table>";
          
        }
           return html;
    }
    
   public String getPagina(int i){
        pagina += "<table border=\"1\"><tr><td>" + array.get(i).getEigenschappen() + "</td>"
               + "<td><div class=\"centreer\">" + array.get(i).getGram() + "</div></td></tr></table>";
             
   return pagina;
   }
   
   
   public String getPotje(int i){
       potjenaam += array.get(i).getNaam();
       return potjenaam;
   }
}