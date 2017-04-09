package Magasin;


public class Test {
	
	public static void main(String[] args) {
		
		Stock Vivi = new Stock ();
		
		Produits p1 = new Produits ("A18", "Yaourt", 6, 0);
		Produits p2 = new Produits("C8", "Legumes", 3, 958);
		Produits p3 = new Produits ("F98", "salle de bain", 26, 8);
		Produits p4 = new Produits ("G19", "savon", 56, 788);
		Produits p5 = new Produits ("P18", "fruits", 96, 0);
		
		Vivi.ajoute(p1);
		Vivi.ajoute(p2);
		Vivi.ajoute(p3);
		Vivi.ajoute(p4);
		Vivi.ajoute(p5);
		
		System.out.println(Vivi.prixMoyenDesProduits());
		
		Vivi.afficheProduitsNonDisponible();
		//Vivi.retrouverPrix("G19");
		//Vivi.trouverProduit(p5);
		//Vivi.effacerProduit("C8");
		//Vivi.ajoutProduitEnPlus("A18" , 20);
		//Vivi.retraitProduit("F98");
		//Vivi.afficheStock();
		
		
	}

}



