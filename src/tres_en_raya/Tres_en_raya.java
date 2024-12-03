package tres_en_raya;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Tres_en_raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String[] nombres = {" "," "};
		
		Scanner x = new Scanner(System.in);
		
		//INSERTAR LOS NOPMBRES DE LOS JUGADORES 
		for (int i = 0; i < nombres.length; i++) {
		System.out.print("Introduce el nombre del jugador " + (i+1) + ": ");
		nombres[i] = x.nextLine();
		}
		
		//MOSTRAR LOS NOMBRES DE LOS JUGADORES 
		for (int i = 0; i < nombres.length; i++) {
			System.out.println(nombres[i]);
		}
		
		
		
		
		
	}

}
