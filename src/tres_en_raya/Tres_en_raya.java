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
				
				boolean posicionValida = false;
				
				while(!posicionValida) {
					//PEDIR LA POSICION
					System.out.println("Es el turno de: " + nombres[turno]);
					System.out.print("Introduce la fila (del 1 al 3): ");
					fila = x.nextInt() -1; //SE AGREGA EL -1 YA QUE TENEMOS LOS VALORES DEL 0 AL 2, SI PONEMOS UN 2 HACE EL SIGUIENTE PROCEDIMIENTO (2 -1 = 1) ENTONCES ACCEDE A LA POSICION 1, SE HACE ESO YA QUE NO TENEMOS LA POSICION 3.
					System.out.print("Introduce la columna (del 1 al 3): ");
					columna = x.nextInt() -1;
					
					//VERIFICAR LAS POSSICIONES
					if (fila >= 0 && fila < 3 && columna >= 0 && columna < 3 && Posicion[fila][columna].equals("-")) {
						Posicion[fila][columna] = "XO".charAt(turno) + "";
	                    posicionValida = true;
	                } else {
	                	System.out.println("Posición inválida, intenta de nuevo.");
	                }	
				}
				
				// VERIFICAR SI HAY GANADOR O EMPATE
				boolean ganador = false;

				// VERIFICAR FILAS Y COLUMNAS
				for (int i = 0; i < 3; i++) {
				    if (Posicion[i][0].equals(Posicion[i][1]) && Posicion[i][1].equals(Posicion[i][2]) && !Posicion[i][0].equals("-")) {
				        ganador = true;
				    }
				    if (Posicion[0][i].equals(Posicion[1][i]) && Posicion[1][i].equals(Posicion[2][i]) && !Posicion[0][i].equals("-")) {
				        ganador = true;
				    }
				}

				// VERIFICAR DIAGONALES
				if (Posicion[0][0].equals(Posicion[1][1]) && Posicion[1][1].equals(Posicion[2][2]) && !Posicion[0][0].equals("-")) {
				    ganador = true;
				}
				if (Posicion[0][2].equals(Posicion[1][1]) && Posicion[1][1].equals(Posicion[2][0]) && !Posicion[0][2].equals("-")) {
				    ganador = true;
				}

				if (ganador) {
				    System.out.println("¡" + nombres[turno] + " ha ganado!");
				    partidaA = false;
				} else {
				    //MIRAR SI HAY EMPATE (ESTANDO EL TABLERO LLENO)
				    boolean empate = true;
				    for (int i = 0; i < 3; i++) {
				        for (int j = 0; j < 3; j++) {
				            if (Posicion[i][j].equals("-")) {
				                empate = false;
				                break;
				            }
				        }
				        if (!empate) break; // SALIR SI HAY UNA CASILLA LLENA
				    }

				    if (empate) {
				        System.out.println("¡Empate!");
				        partidaA = false;
				    } else {
				        turno ^= 1; // ALTERNAR TURNO ENTRE JUGADOR 0 Y 1
				    }
				}
				
			}
			//MOSTRAR EL TABLERO FINAL
			System.out.println("Este es el tablero final:");
			for (int i = 0; i < Posicion.length; i++) {
				for (int j = 0; j < Posicion[i].length; j++) {
					System.out.print(Posicion[i][j]);
				}
				System.out.println(" ");
			}
			// PREGUNTAR POR REVANCHA
            System.out.print("¿Desean jugar una revancha? (S/N): ");
            String respuesta = x.next().toUpperCase();
            jugar = respuesta.equals("S");
			
		}
		System.out.println("¡Gracias por jugar!");
		
		
		
		
		
	}

}
