import javax.swing.JOptionPane;

public class JeuxHasard {

	public static void main(String[] args) {

		// TODO Auto-generated method stub
		// trouver nombre aleatoire

		double d = Math.random();
		int j = (int)(d*100);
		//System.out.println(j);

		int i = 0;

		int nombreDeTirages = 0;

		for (nombreDeTirages=0; nombreDeTirages<5; ++nombreDeTirages){
			//while (nombreDeTirages<= 5) {

			//saisir un nombre

			String reponse = JOptionPane.showInputDialog("Proposer un nombre");

			try{
				i = Integer.parseInt(reponse);

				if (i==j){
					System.out.println("Bravo");
					break;
				}

				if (i<j){
					System.out.println("c'est au dessus");
				}

				if (i>j){
					System.out.println("c'est en dessous");
				}

				//++ nombreDeTirages;
			}
			catch (Exception e) {

				System.out.println("Ce n'est pas entier");
				// TODO: handle exception
			}
		}
		if (i!=j){
			System.out.println("c'est fini. Tu as perdu! Recommence");
		}
	}

}


