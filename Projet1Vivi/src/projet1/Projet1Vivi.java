package projet1;



public class Projet1Vivi {

	public static void main(String[] args) {

		int[] monTab;
		monTab = new int [10];
		int i;
		i = 0;

		while (i<10){
			monTab[i]= i+1;
			i= i+1;
		}


		i = 0;


		monTab [4]=-12;
		monTab [1]=-2;
		monTab[9]=-2;

		while (i < 10){
			if(monTab[i]<=0){

				System.out.println(monTab[i]);
			}

			i=i+1;

		}
	}

	
		
}


