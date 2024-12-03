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
		int contPos = 0;
		int fila = 0;
		int columna = 0;
		int[][] insert = new int[fila][columna];
		
		Scanner x = new Scanner(System.in);
		Random r = new Random();
		
		boolean jugar = true;
		
		//INSERTAR LOS NOPMBRES DE LOS JUGADORES 
		for (int i = 0; i < nombres.length; i++) {
		System.out.print("Introduce el nombre del jugador " + (i+1) + ": ");
		nombres[i] = x.nextLine();
		}
		
		//MOSTRAR LOS NOMBRES DE LOS JUGADORES 
		System.out.println("__________________________________________");
		System.out.println(" ");
		System.out.println("Los nombres elegidos són: ");
		for (int i = 0; i < nombres.length; i++) {
			System.out.println("Jugador "+ (i + 1) + ": " + nombres[i]);
		}
		System.out.println("__________________________________________");
		
		//REINICIAR EL TABLERO 
		while(jugar) {
			for (int i = 0; i < Posicion.length; i++) {
				for (int j = 0; j < Posicion.length; j++) {
					Posicion[i][j] = "-";
				}
			}
			
			for (int i = 0; i < Posicion.length; i++) {
				for (int j = 0; j < Posicion[i].length; j++) {
					System.out.print((contPos + 1) + " " +Posicion[i][j] + " ");
					contPos++;
				}System.out.println();
			}
			
			//ESTE RANDOM GENERA UN NUMERO DEL 1 AL 2
			Random = r.nextInt(2)+1;
			
			if (Random == 1){
				System.out.print("En que posición quieres poner la ficha, jugador: " + nombres[0] + ": ");
				insert[fila][columna] = x.nextInt();
			}else {
				System.out.print("En que posición quieres poner la ficha, jugador: " + nombres[1] + ": ");
				insert[fila][columna] = x.nextInt();
			}
			
			
			
		}
		
		
		
		
		
		
	}

}
