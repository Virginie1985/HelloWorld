
public class JustifierPhrase {




	///Algorithme de justificaition
	///deplace les carateres en caratere
	///Supprime tous les espaces entre les mots 
	///et les remplaces par la moyenne qui permet de justifiier
	///pour les espaces restants sont placés un par un entre chaque mot
	public static void main(String[] args) {

		//Varialbes initales
		String phrase1 = "   Les    folies sont les   ,  seules choses  qu'on ne    ,        regrette.   jamais!  ";

		//Varaible de la pharse 1, jsutifier
		String phrase2 = "";
		int margeDeGauche = 3;
		int margeDeDroite = 3;
		int nombreDEspaces = 0;
		int nombreDeLettres = 0;
		int nombreDeMots = 0;
		int nombreDEspacesDisponible;
		int longueurDIntervalle = 0;
		int resteDeCaracteresEspace ;

		//Calcul du nombre d'espaces et nombre de mots
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

		//Calcul le nombre de lettres
		nombreDeLettres = phrase1.length()-nombreDEspaces;

		//Printf de debug
		System.out.println(nombreDeLettres);
		System.out.println(nombreDeMots);

		//Calcul des espaces disponibles
		nombreDEspacesDisponible = 80-margeDeGauche-margeDeDroite-nombreDeLettres;
		System.out.println(nombreDEspacesDisponible);

		//Calcul de l'intervalle moyen a obtenir
		longueurDIntervalle = nombreDEspacesDisponible/(nombreDeMots-1);
		System.out.println(longueurDIntervalle);

		//
		resteDeCaracteresEspace = nombreDEspacesDisponible%(nombreDeMots-1);
		System.out.println(resteDeCaracteresEspace);

		//complète la marge gauche
		for(int j=0; j<margeDeGauche; ++j){
			phrase2 = phrase2 + " ";
		}

		//Reinitialise la variable pemiere lettrÒe
		premiereLettre = false;

		char tmp;	
		//Algorithme de justification
		for(int i=0; i<phrase1.length(); ++i){

			tmp = phrase1.charAt(i);

			//if(phrase1.charAt(i) != ','){

				//Ajoute le mot à la phrase 2
				if(phrase1.charAt(i) != ' ' ){
					phrase2 = phrase2 + phrase1.charAt(i);
					premiereLettre = true;
				}
				else{

					if(premiereLettre && nombreDEspacesDisponible > 0 && !isPonctuation(phrase1,i)){
						//Ajoute les espaces moyen
						for(int j=0; j<longueurDIntervalle; ++j){
							phrase2 = phrase2 + " ";
							--nombreDEspacesDisponible;
						}
						//ajoute les espaces en trop
						if(resteDeCaracteresEspace>0){
							phrase2 = phrase2 + " ";
							--resteDeCaracteresEspace;
							--nombreDEspacesDisponible;
						}

						premiereLettre = false;

					}

				}
			
			/*else{
				phrase2 = phrase2 + phrase1.charAt(i);
				premiereLettre = true;

			}*/

		}

		//justifie la marge de droite
		for(int j=0; j<margeDeDroite; ++j){
			phrase2 = phrase2 + " ";
		}
		System.out.println(phrase2.length());
		System.out.println("&"+phrase2+"&");
	}
	
	///Y a t il une ponctuation comme prochain caratère autre qu'espace dans la chaine phrase
	///et si c'est une ponctuation alors 
	private static boolean isPonctuation(String phrase,int positionCourante){
		
		boolean isPonctuation = false;
		
		for(int i=positionCourante;i<phrase.length(); ++i){
			if(phrase.charAt(i) != ' ' ){
				if(phrase.charAt(i) == ',' ) {
					isPonctuation = true;
				}else{
					break;
				}
				
			}
		}
		
		return isPonctuation;
	}

}



