package packarreglos;
import java.util.Scanner;
public class DecrementoNumeros 
{

	public static void main(String[] args) 
	{
		Bucle Bucle1 = new Bucle();
		Bucle1.PedirUsuario();
	}

	public static class Bucle
	{
		Scanner read = new Scanner(System.in);
		
		public int n;

		public int[] arreglo;
		
		public void PedirUsuario() 
		{
			System.out.println("Ingrese la cantidad de espacios a reserver: ");
			n = read.nextInt();
			arreglo = new int[n];
			
			for (int i=0;i<n;i++)
			{
				System.out.println("Ingrese un valor para la posision [" + (i+1) + "]: ");
				arreglo[i] = read.nextInt();
				
			}
			
			for (int i=n-1;i>=0;i--)
			{
				System.out.println(" " + arreglo[i]);
			}
		}
	}
}


