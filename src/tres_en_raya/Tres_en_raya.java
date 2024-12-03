package tres_en_raya;

import java.util.Scanner;
import java.util.Random;
import java.util.Arrays;

public class Tres_en_raya {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		String[] nombres = {" "," "};
		String[][] Posicion = {
				{"-","-","-"},
				{"-","-","-"},
				{"-","-","-"}};
		int Random = 0;
		int fila = 0;
		int columna = 0;
		int[] insert = new int[columna];
		
		Scanner x = new Scanner(System.in);
		Random r = new Random();
		
		//INSERTAR LOS NOPMBRES DE LOS JUGADORES 
		for (int i = 0; i < nombres.length; i++) {
		System.out.print("Introduce el nombre del jugador " + (i+1) + ": ");
		nombres[i] = x.nextLine();
		}
		
		//MOSTRAR LOS NOMBRES DE LOS JUGADORES 
		//for (int i = 0; i < nombres.length; i++) {
			//System.out.println(nombres[i]);
		//}
		
		//ESTE RANDOM GENERA UN NUMERO DEL 1 AL 2
		Random = r.nextInt(2)+1;
		
		if (Random == 1){
			System.out.print("En que columna quieres poner la ficha, " + nombres[0] + ": ");
			insert[columna] = x.nextInt();
		}else {
			System.out.print("En que columna quieres poner la ficha, " + nombres[1] + ": ");
			insert[columna] = x.nextInt();
		}
		
		while (true) {
			
		}
		
		
	}

}
