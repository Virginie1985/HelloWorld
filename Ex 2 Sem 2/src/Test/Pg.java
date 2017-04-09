
	
package Test;

import Personne.Groupe;
import Personne.Personne;

public class Pg {
    
    public static void main(String[] args) {
        
    
    
    Personne p = new Personne ("Abrahim","paule","lille",6,1112.3,true);
    Personne p2 = new Personne ("Aloui","paul","paris",56,12.3,false);
    Personne p3 = new Personne ("Lafoisse", "marie","paris", 32, 56.8, true);
    
    Groupe g = new Groupe();
    g.ajoute(p);
    g.ajoute(p2);
    g.ajoute(p3);
    
    g.affiche();
    
    System.out.println("Les filles sont : ");
    g.afficheFille();
    
    double m = g.ageMoyen ();
    System.out.println("l'age moyen est :"+m);
    
    System.out.println("Les plus de douze ans : ");
    g.affiche(12);
    
    
    System.out.println("entre 12 et 20 : ");
    g.affiche(12, 20);
    
    g.supprime("Lafoisse");
    System.out.println("La liste sans Lafoisse est : ");
    g.affiche();
    
    System.out.println("Tout est effacé :");
    g.raz();
    g.affiche();
    
    
    }
    
}


