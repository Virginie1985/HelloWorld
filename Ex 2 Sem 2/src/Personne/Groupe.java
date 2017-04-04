package Personne;

import java.util.ArrayList;

public class Groupe {
	private ArrayList<Personne> tab = new ArrayList<Personne> () ;

    public void ajoute (Personne p){
        tab.add(p);
    }

    public void affiche (){
        for (Personne p : tab)
            p.affiche();
    }

    public void affiche (String nom){
        for (Personne p:tab)
            if (nom.equals(p.getNom()))
                p.affiche();

    }

    public void afficheFille (){
        for (Personne p:tab)
            if (p.isFille())
                p.affiche();
    }
    
    public void affiche (int ageSup){
        for (Personne p:tab)
            if (ageSup > ageSup)
                p.affiche();
        
    }
    
    public void affiche (int ageSup, int ageInf){
        
        for (Personne p:tab){
            if (p.getAge() > ageInf && p.getAge() < ageSup)
                p.affiche();
        }
    }
    
    public boolean supprime (String nom){
        
        for (Personne p:tab)
        if (nom.equals(p.getNom())){
            tab.remove (p);
            return true;
        }
                return false;
        
    }
    
    public void raz (){
        tab.clear();
    }


    public double ageMoyen (){
        
    	double tMoyen=0;
    	
    	if(tab.size()!=0)
    	{
    		for (Personne p:tab)
    		{
    			tMoyen=tMoyen+p.getAge();
    		}
    		tMoyen=tMoyen/tab.size();
    	}

    	return tMoyen;
    }

}
