package packarreglos;

import java.util.Scanner;
 
public class CalculadoraArray
{
	public static void main(String[] args)
	{
		Scanner reader = new Scanner(System.in);
		int[] numeros = new int[5];
		int[] numeros2 = {50,20,40,50,40};
		
		int suma = 0;
		int resultado=0;
		int op = 0;
		
		System.out.println("Seleccione una opcion");
		System.out.println("1. Array sin elementos");
		System.out.println("2. Array con elementos");
		System.out.println("Opcion: ");
		op=reader.nextInt();
		
		switch (op)
		{
		case 1:
			for (int i=0 ; i < numeros.length; i++)
			{
				System.out.println("Digite el valor para el espacio [" + (i+1) + "]: ");
				suma=reader.nextInt();
				
				resultado=resultado+suma;
			}
			System.out.println("La suma de los valores es de: " + resultado);
			break;
			
		case 2:
			
			for (int i=0; i < numeros2.length; i++)
			{
				System.out.println("Valor en la posicion [" + (i+1) + "]: " + numeros2[i]);
				suma+=numeros2[i];
			}
			System.out.println("La suma de todos los valores es: " + suma);
			break;
			
		default:
		{
			System.out.println("Valor fuera de rango,Ejecute nuevamente!!");
			break;
		}
		}
		reader.close();
	}
	
}