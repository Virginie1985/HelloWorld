package Magasin;

import java.util.ArrayList;



public class Stock {

	ArrayList<Produits> listeProduits = new ArrayList<Produits>();

	public void ajoute (Produits nouveauProduit){
		listeProduits.add(nouveauProduit);
	}

	public void ajoutProduitEnPlus(String reference, int q){

		for (Produits p : listeProduits)
			if(reference.equals(p.getReference())){	

				p.setQuantite(p.getQuantite() + q );				
			}		
	}

	public void retraitProduit (String reference){		
		for(Produits p : listeProduits)
			if (reference.equals(p.getReference())){
				p.setQuantite(p.getQuantite() - 1);
			}
	}

	public void effacerProduit (String reference){
		for(Produits p : listeProduits)
			if (reference.equals(p.getReference())){
				//p.setQuantite(0); // passe la quantite 0
				listeProduits.remove(p); // enleve le produit de la liste

				System.out.println("Le stock est vide ");
				break;
			}
	}

	public void trouverProduit (Produits pro){
		for(Produits p : listeProduits){
			if (pro.equals(p)&& p.getQuantite()>=1)
				System.out.println("En stock");			
			else if (pro.equals(p)&& p.getQuantite()== 0)
				System.out.println("En rupture");
		}	
	}

	public void retrouverPrix(String reference){
		for(Produits p : listeProduits){

			if (reference.equals(p.getReference()))
				System.out.println(p.getPrix());

		}

	}

	public void afficheProduitsNonDisponible (){
		for(Produits p : listeProduits){

			if(p.getQuantite() == 0)
				p.afficheProduits();
		}

	}

	public int prixMoyenDesProduits(){
		int prixTotal = 0;
		int nbOccurrences = 0;
		int prixMoyen =0 ;
		for(Produits p : listeProduits){
			prixTotal += p.getPrix();
			++nbOccurrences;
		}
		prixMoyen=  prixTotal / nbOccurrences ;
		return prixMoyen;
	}


	public void afficheStock (){

		//for (Produits p : listeProduits){
		//System.out.println(p.toString());


		for(Produits unProduit : listeProduits)
			unProduit.afficheProduits();
	}


}