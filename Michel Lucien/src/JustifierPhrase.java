
public class JustifierPhrase {





	public static void main(String[] args) {

 
		String phrase1 = "   Les    folies sont les   seules choses  qu'on ne            regrette   jamais  ";
		String phrase2 = "";
		int margeDeGauche = 3;
		int margeDeDroite = 3;
		int nombreDEspaces = 0;
		int nombreDeLettres = 0;
		int nombreDeMots = 0;
		int nombreDEspacesDisponible;
		int longueurDIntervalle = 0;
		int resteDeCaracteresEspace ;

		boolean premiereLettre = true;
		for(int i=0; i<phrase1.length(); ++i){
			if(phrase1.charAt(i) == ' '){
				++nombreDEspaces;
				premiereLettre = true;
			}
			else{
				if(premiereLettre){
					++nombreDeMots;
					premiereLettre = false;

				}

			}
		}

		nombreDeLettres = phrase1.length()-nombreDEspaces;
		System.out.println(nombreDeLettres);
		System.out.println(nombreDeMots);
		nombreDEspacesDisponible = 80-margeDeGauche-margeDeDroite-nombreDeLettres;
		System.out.println(nombreDEspacesDisponible);

		longueurDIntervalle = nombreDEspacesDisponible/(nombreDeMots-1);
		System.out.println(longueurDIntervalle);
		resteDeCaracteresEspace = nombreDEspacesDisponible%(nombreDeMots-1);
		System.out.println(resteDeCaracteresEspace);


		for(int j=0; j<margeDeGauche; ++j){
			phrase2 = phrase2 + " ";
		}

		boolean premiereLettreBis = false;

		for(int i=0; i<phrase1.length(); ++i){

			if(phrase1.charAt(i) != ' ' ){
				phrase2 = phrase2 + phrase1.charAt(i);
				premiereLettreBis = true;
			}
			else{
				if(premiereLettreBis && nombreDEspacesDisponible > 0){
					for(int j=0; j<longueurDIntervalle; ++j){
						phrase2 = phrase2 + " ";
						--nombreDEspacesDisponible;
					}
					if(resteDeCaracteresEspace>0){
						phrase2 = phrase2 + " ";
						--resteDeCaracteresEspace;
						--nombreDEspacesDisponible;
					}

					premiereLettreBis = false;

				}

			}
		}
		for(int j=0; j<margeDeDroite; ++j){
			phrase2 = phrase2 + " ";
		}
		System.out.println(phrase2.length());
		System.out.println(phrase2);
	}

}



