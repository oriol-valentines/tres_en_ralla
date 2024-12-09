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
		int fila = 0;
		int columna = 0;
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
		
		while(jugar) {
			//REINICIAR EL TABLERO 
			for (int i = 0; i < Posicion.length; i++) {
				for (int j = 0; j < Posicion[i].length; j++) {
					Posicion[i][j] = "-";
				}
			}
			
			//DECIDIR QUIEN EMPIEZA 
			int turno = r.nextInt(2);
			System.out.print("La moneda ha decidido que es el turno de " + nombres[turno]);
			
			boolean partidaA = true;
			
			while(partidaA) {
				//MOSTRAR EL TABLERO
				System.out.println("El tablero: ");
				for (int i = 0; i < Posicion.length; i++) {
					for (int j = 0; j < Posicion[i].length; j++) {
						System.out.print(Posicion[i][j] + " ");
					}
					System.out.println();
				}
			}
		}
		
		
		
		
		
		
	}

}
