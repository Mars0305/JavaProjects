package packarreglos;

import java.util.Scanner;

public class EjemploArray1 {

	public static void main(String[] args) {
		Scanner read = new Scanner(System.in);
		
		String[] cadena = new String[1];
		
		System.out.println("Escriba una palabra no mayor a 5 caracteres");
		String palabra = read.nextLine();
		
		if (palabra.length() <= 5)
		{
			cadena[0] = palabra;
			System.out.println("Palabra completa: " + cadena[0] );
		}
		else
		{
			cadena[0] = palabra.substring(0,5);
			System.out.println("Las primera 5 letras son: " + cadena[0]);
		}
		
		read.close();
	}

}
