
public class Listedemots {
	public static void main(String[] args) {



		String [] listeUn = {"enfant","tournevis","telephone","gateau","chat","eclair","elephant"};
		String [] listeDeux = {"bleu","indigo","doré","vibrant","sensationnel","rebondi"};
		String [] listeTrois = {"chanteur","édenté","brouillon","neuf","plaisant","rigolo","écarlate"};

		try {


			int longueurListeUn = listeUn.length;
			int longueurListeDeux = listeDeux.length;
			int longueurListeTrois = listeTrois.length;

			int randUn = (int) (Math.random() * longueurListeUn);
			int randDeux = (int) (Math.random() * longueurListeDeux);
			int randTrois = (int) (Math.random() * longueurListeTrois);

			String phrase = listeUn[randUn] + " , " + listeDeux[randDeux]+ " et " + listeTrois[randTrois];

			System.out.println("il nous faut un " + phrase);
		}
		catch (Exception e) {
			System.out.println(e.toString());
		}

		String s = "bonjour";
		StringBuffer buf = new StringBuffer( s );

		buf.append( " me revoilou" );
		System.out.println( buf );
	}




}
