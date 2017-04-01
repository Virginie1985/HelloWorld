
public class Porjet2Vivi {    
	public static void main(String[] args) {
		/*int[] nombres = { 2, 12, 14, -8, 8, 9, 42, 7, 54, -6 };
		int i;
		i = 0;
		int u;
		u = 0;
somme des valeurs du tableau
		while (i<10){
			//if ( nombres [i] > u){

			u = nombres [i] + u  ;



			i = i + 1;
		}
		{

			System.out.println(u);
		}


	}
}*/

		double[] monTableau;
		monTableau = new double [20] ;
		int i; // car on part de la case 1
		i = 0;

		monTableau [i] = 1;

		while (i< 19){

			monTableau [i + 1] = monTableau [i] + 2.5;

			System.out.println(monTableau [i + 1]);

			++ i;
		}
	}
}





