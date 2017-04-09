package Magasin;

public class Produits {
	
	private String reference;
	private String libelle;
	private int prix;
	private int quantite;
	
	
	public Produits() {
		super();
		// TODO Auto-generated constructor stub
	}


	public Produits(String reference, String libelle, int prix, int quantite) {
		super();
		this.reference = reference;
		this.libelle = libelle;
		this.prix = prix;
		this.quantite = quantite;
	}

	public void afficheProduits (){
		
		System.out.println("la référence est : " + reference + " le libellé est : " + libelle + " le prix est : " + prix + " la quantité est : " + quantite);
		
	}
	
	public String getReference() {
		return reference;
	}


	public void setReference(String reference) {
		this.reference = reference;
	}


	public String getLibelle() {
		return libelle;
	}


	public void setLibelle(String libelle) {
		this.libelle = libelle;
	}


	public int getPrix() {
		return prix;
	}


	public void setPrix(int prix) {
		this.prix = prix;
	}


	public int getQuantite() {
		return quantite;
	}


	public void setQuantite(int quantite) {
		this.quantite = quantite;
	}
	
	
	
	

}
