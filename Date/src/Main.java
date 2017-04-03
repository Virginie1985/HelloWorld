public class Main {

	
	public static void main(String[] args) {
		
		int jour = 18, mois = 01, année = 2000 ;
		Date dateJour = new Date(jour, mois, année);
		
		System.out.println(dateJour.affiche());
		int i;
		Stage AI101 = new Stage() ;
		
		AI101.dateDebut.setJour(31);
		AI101.dateDebut.année = 2016;
		
		if( dateJour.isJourDeLAn() == true){
			System.out.println("Bonne année !!");
		}
		
		
		Date d3 = new Date() ;
		d3.affiche();
		System.out.println(d3.saison());
	}
	
}
