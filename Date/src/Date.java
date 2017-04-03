
public class Date {

	int jour;
	int mois;
	int année;

	// INIT
	Date(int j, int m, int a) {
		this.jour = j ;
		this.mois = m ;
		this.année = a ;
	}	
	Date() {
	}	
	Date(int a) {
		this.jour = 1 ;
		this.mois = 1 ;
		this.année = a ;
	}
	
	// SETTERS
	public void setAnnée(int a) {
		année = a ;
	}
	public void setMois(int m) {
		année = m ;
	}	
	public void setJour(int j) {
		année = j ;
	}	

	// GETTERS
	public int getAnnée(int a) {
		return a ;
	}
	public int getMois(int m) {
		return m ;
	}	
	public int getJour(int j) {
		return j ;
	}	

	public boolean isJourDeLAn(){
		if(jour == 1 && mois == 1){
			return true;
		}else{
			return false;
		}
	}
	public String saison(){

		if(mois > 6 ){
			return "été";
		}else{
			return "hiver";
		}
	}

	public String affiche() {
		return jour+"/"+mois+"/"+année ;
	}
	void afficheSyso() {
		System.out.println(jour+"/"+mois+"/"+année);
	}



}
