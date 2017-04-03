
public class Stage {

	String nomStage ;
	Date dateDebut = new Date() ;
	Date dateFin = new Date();
	
	public String affiche(int nomStage, int dateDebut, int dateFin){
		return "le stage "+nomStage+" débute le "+dateDebut+" et se termine le "+dateFin ;
	}
	
}
